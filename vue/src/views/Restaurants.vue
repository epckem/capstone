<template>
  <div class="main">
    <h1>Restaurants</h1>
    <restaurant-list></restaurant-list>
  </div>
</template>

<script>
import RestaurantList from "../components/RestaurantsList.vue";

export default {
  components: {
    RestaurantList,
  },
};
</script >
<style scoped>
#main {
  display: flex;
  justify-content: center;
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2d3844;
  max-width: 800px;
  margin: 60px auto 0 auto;
}
</style>

