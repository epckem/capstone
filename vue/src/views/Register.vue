<template>
  <div id="register" class="text-center">
    <form id="main-grid" class="form-register" @submit.prevent="register">
      <h1 id="create-account" class="h3 mb-3 font-weight-normal">
        Create Account
      </h1>
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
      </div>
      <div class="second-grid">
        <label id="username" for="username" class="sr-only">Username</label>
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />
        <label id="password" for="password" class="sr-only">Password</label>
        <input
          type="password"
          id="password"
          class="form-control"
          placeholder="Password"
          v-model="user.password"
          required
        />
        <input
          type="password"
          id="confirmPassword"
          class="form-control"
          placeholder="Confirm Password"
          v-model="user.confirmPassword"
          required
        />
        <router-link :to="{ name: 'login' }" id="login"
          >Have an account?</router-link
        >
        <button
          id="submit-btn"
          class="btn btn-lg btn-primary btn-block"
          type="submit"
        >
          Create Account
        </button>
      </div>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  beforeCreate() {
    document.body.className = "login";
  },
  name: "register",
  data() {
    return {
      user: {
        username: "",
        password: "",
        confirmPassword: "",
        role: "user",
      },
      registrationErrors: false,
      registrationErrorMsg: "There were problems registering this user.",
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = "Password & Confirm Password do not match.";
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: "/login",
                query: { registration: "success" },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = "Bad Request: Account Already Exists";
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = "There were problems registering this user.";
    },
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");
body {
  font-family: "Poppins";
}
body.login {
  background-image: url("https://iili.io/HCPiZ3F.jpg");
  background-size: cover;
}
</style>

<style scoped>
#main-grid {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  column-gap: 50px;
  grid-template-areas:
    ".  create-account       ."
    ".  second-grid   ."
    ".  .             .";
}

#create-account {
  grid-area: create-account;
  display: flex;
  align-items: end;
  justify-content: center;
  color: white;
  font-size: 40px;
}

.second-grid {
  display: grid;
  grid-auto-columns: 1fr;
  row-gap: 20px;
  grid-area: second-grid;
  grid-template-areas:
    "username"
    "password"
    "confirm-password"
    "submit-btn"
    "login";
  background-color: #db1f48;
  border: 10px #db1f48 solid;
  border-radius: 10px;
  padding-top: 40px;
  padding-bottom: 40px;
  padding-right: 20px;
  padding-left: 20px;
}

#username {
  grid-area: username;
}
#password {
  grid-area: password;
}
#confirmPassword {
  grid-area: confirm-password;
}
#submit-btn {
  grid-area: submit-btn;
  margin-top: 20px;
  font-size: 20px;
  height: 27px;
}
#login {
  grid-area: login;
  color: white;
  font-size: 20px;
}
.form-control {
  height: 25px;
  font-size: 20px;
}
.alert-danger {
  color: white;
  font-size: large;
}
</style>
