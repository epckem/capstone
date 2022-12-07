<template>
  <div id="app">
    <div id="nav" v-if="$store.state.token != ''">
      <router-link class="nav-btns" v-bind:to="{ name: 'home' }"
        >Home</router-link
      >&nbsp;|&nbsp;
      <router-link class="nav-btns" v-bind:to="{ name: 'InviteView' }"
        >Invite</router-link
      >
      &nbsp;|&nbsp;
      <router-link class="nav-btns" v-bind:to="{ name: 'restaurants' }"
        >Restaurants</router-link
      >
      &nbsp;|&nbsp;
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
</style>