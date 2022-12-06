<template>
  <div id="login" class="text-center">
    <form id="main-grid" class="form-signin" @submit.prevent="login">
      <h1 id="sign-in" class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
        Invalid username and password!
      </div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >
        Thank you for registering, please sign in.
      </div>
      <div id="second-grid">
        <label for="username" class="sr-only" id="username">Username</label>
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Username"
          v-model="user.username"
          required
          autofocus
        />
        <label for="password" class="sr-only" id="password">Password</label>
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
            this.$router.push("/");
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

<style  >
#main-grid {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;

  column-gap: 50px;
  grid-template-areas:
    ".  sign-in       ."
    ".  second-grid   ."
    ".  blank             .";
  /* background-image: url("https://img.rawpixel.com/private/static/images/website/2022-05/px1369813-image-kwvxxp91.jpg?w=1200&h=1200&dpr=1&fit=clip&crop=default&fm=jpg&q=75&vib=3&con=3&usm=15&cs=srgb&bg=F4F4F3&ixlib=js-2.2.1&s=b0bb6d55ae739cf84787c39dfe80d0ba");
  background-size: cover; */
}

body {
  background-image: url("https://iili.io/HCPiZ3F.jpg");
  background-size: cover;
}

#sign-in {
  grid-area: sign-in;
  display: flex;
  align-items: end;
  justify-content: center;
  color: rgb(112, 152, 66);
}
#blank {
  grid-area: blank;
  min-height: fit-content;
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
}
#password {
  grid-area: password;
}
#submit-btn {
  grid-area: submit-btn;
}
#register {
  grid-area: register;
  color: white;
}
</style>
