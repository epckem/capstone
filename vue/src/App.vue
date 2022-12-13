<template>
  <div id="app">
    <img
      v-if="$store.state.token != ''"
      id="logo"
      src="https://iili.io/HofseHX.png"
      alt="table for a few low resolution logo color on transparent background (1)"
      border="0"
    />
    <div id="nav" v-if="$store.state.token != ''">
      <router-link class="nav-btns" v-bind:to="{ name: 'home' }"
        >Home</router-link
      >
      <div id="nav-lines">&nbsp;|&nbsp;</div>
      <router-link class="nav-btns" v-bind:to="{ name: 'CreateEvent' }"
        >Invite</router-link
      >
      <div id="nav-lines">&nbsp;|&nbsp;</div>

      <router-link class="nav-btns" v-bind:to="{ name: 'restaurants' }"
        >Restaurants</router-link
      >
      <div id="nav-lines">&nbsp;|&nbsp;</div>

      <router-link id="list" class="nav-btns" v-bind:to="{ name: 'logout' }"
        >Logout</router-link
      >
    </div>

    <router-view />
  </div>
</template>
<style>
.nav-btns {
  color: white;
  text-decoration: none;
  font-size: x-large;
}
#nav {
  display: flex;
  flex-direction: row;
  align-items: center;
}
#nav-lines {
  color: white;
}
#logo {
  width: 150px;
  float: right;
}
</style>