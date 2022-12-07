<template>
  <div id="app">
    <div id="nav">
      <router-link id="home-btn" v-bind:to="{ name: 'home' }">Home</router-link
      >&nbsp;|&nbsp;
      <router-link id="invite-btn" v-bind:to="{ name: 'InviteView' }"
        >Invite</router-link
      >&nbsp;|&nbsp;
      <router-link
        v-bind:to="{ name: 'logout' }"
        v-if="$store.state.token != ''"
        >Logout</router-link
      >
    </div>
    <router-view />
  </div>
</template>
<style scoped>
#home-btn {
  color: white;
  text-decoration: none;
  font-size: x-large;
}
</style>