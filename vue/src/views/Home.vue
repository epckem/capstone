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
  components: {
    RestaurantsList,
  },
};
</script>
<style scoped>
h1,
p {
  color: red;
  font-size: xx-large;
}
</style>
