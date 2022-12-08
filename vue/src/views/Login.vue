<template>
  <div id="login" class="text-center">
    <form id="main-grid" class="form-signin" @submit.prevent="login">
      <h1 id="sign-in" class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div
        id="invalid"
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >
        Invalid username and password!
      </div>
      <div
        id="registered"
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >
        Thank you for registering, please sign in.
      </div>
      <div id="second-grid">
        <label for="username" class="sr-only" id="username"></label>
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />
        <label for="password" class="sr-only" id="password"></label>
        <input
          type="password"
          id="password"
          class="form-control"
          placeholder="Password"
          v-model="user.password"
          required
        />
        <router-link :to="{ name: 'register' }" id="register"
          >Need an account?</router-link
        >

        <button type="submit" id="submit-btn">Sign in</button>
      </div>

      <div id="blank"></div>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  beforeCreate() {
    document.body.className = "login";
  },
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/restaurants");
          }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>

<style>
body.login {
  background-image: url("https://iili.io/HCPiZ3F.jpg");
  background-size: cover;
}
</style>

<style scoped >
#main-grid {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;

  column-gap: 50px;
  grid-template-areas:
    ".  sign-in       ."
    ".  second-grid   ."
    ".  .             .";
}

#sign-in {
  grid-area: sign-in;
  display: flex;
  align-items: end;
  justify-content: center;
  color: white;
  font-family: "Times New Roman", Times, serif;
  font-size: 40px;
}

#second-grid {
  display: grid;
  grid-auto-columns: 1fr;
  row-gap: 20px;
  grid-area: second-grid;
  grid-template-areas:
    "username"
    "password"
    "submit-btn"
    "register";
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
  font-family: "Times New Roman", Times, serif;
}
#password {
  grid-area: password;
  font-family: "Times New Roman", Times, serif;
}
#submit-btn {
  grid-area: submit-btn;
  font-family: "Times New Roman", Times, serif;
  font-size: 20px;
  height: 27px;
  width: 440px;
  margin: 0 auto;
}
#register {
  grid-area: register;
  color: white;
  font-family: "Times New Roman", Times, serif;
  font-size: 20px;
}
.form-control {
  display: block;
  width: 350px;
  margin: 20px auto;
  padding: 10px 45px;
  background: white no-repeat 15px center;
  background-size: 15px 15px;
  font-size: 16px;
  border: none;
  border-radius: 5px;
  box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px,
    rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
}

#invalid {
  color: white;
  font-size: large;
}
#registered {
  color: white;
  font-size: large;
}
</style>
