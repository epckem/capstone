<template>
  <div class="restaurants">
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
</script>
<style scoped>
</style>