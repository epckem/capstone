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
              this.registrationErrorMsg = "Bad Request: Validation Errors";
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
  font-family: "Times New Roman", Times, serif;
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
  background-color: rgb(218, 78, 97);
  border: 10px rgb(218, 78, 97) solid;
  border-radius: 10px;
  padding-top: 40px;
  padding-bottom: 40px;
  padding-right: 20px;
  padding-left: 20px;
}

#username {
  grid-area: username;
  font-family: "Times New Roman", Times, serif;
}
#password {
  grid-area: password;
  font-family: "Times New Roman", Times, serif;
}
#confirmPassword {
  grid-area: confirm-password;
  font-family: "Times New Roman", Times, serif;
}
#submit-btn {
  grid-area: submit-btn;
  font-family: "Times New Roman", Times, serif;
}
#login {
  grid-area: login;
  color: white;
  font-family: "Times New Roman", Times, serif;
  font-size: 20px;
}
</style>
