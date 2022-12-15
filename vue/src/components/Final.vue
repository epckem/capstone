<template>
  <div class="restaurants">
    <restaurant-display
      class="restaurant"
      v-for="restaurant in restaurants"
      v-bind:key="restaurant.restaurant_id"
      :restaurant="restaurant"
    />
  </div>
</template>

<script>
import RestaurantDisplay from "./RestaurantDisplay.vue";

export default {
  props: ["restaurants"],
  name: "restaurant-finalists",
  components: { RestaurantDisplay },
  created() {},
};
</script>

<style>
#main-grid {
  display: flex;
  align-items: center;
  justify-content: space-around;
  flex-direction: row;
  text-align: center;
  border: 1px black solid;
  background-color: white;
  border-radius: 6px;
  padding: 1rem;
  margin-right: 20rem;
  margin-left: 20rem;
  margin-top: 1rem;
  width: 900px;
  height: 350px;
  border: 3px solid black;
}
.list-images {
  max-width: 300px;
  max-height: 300px;
  min-width: 300px;
  min-height: 300px;
}
#second-grid > img {
  height: 2rem;
  vertical-align: top;
  margin: 0 0.5rem;
}
div.main div.restaurant div.rating img {
  height: 100%;
}
</style>