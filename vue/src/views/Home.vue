<template>
  <div class="home">
    <restaurants-list> </restaurants-list>
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
  </div>
</template>

<script>
import RestaurantsList from "../components/RestaurantsList.vue";

export default {
  beforeCreate() {
    document.body.className = "home";
  },
  components: {
    RestaurantsList,
  },
};
</script>

<style>
body.home {
  background-image: none;
  background-color: #004369;
}
</style>

<style scoped>
h1,
p {
  color: red;
  font-size: xx-large;
}
</style>
