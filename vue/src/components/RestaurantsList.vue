<template>
  <div class="restaurants">
    <h1 v-if="!hasData">Sorry no search results found. Try again!</h1>

    <restaurant-display
      class="restaurant"
      v-for="restaurant in restaurants"
      v-bind:key="restaurant.restaurant_id"
      :restaurant="restaurant"
      :viewmode="viewmode"
    />
  </div>
</template>

<script>
import RestaurantDisplay from "./RestaurantDisplay";
export default {
  name: "restaurant-list",
  props: ["restaurants", "viewmode"],
  components: {
    RestaurantDisplay,
  },
  computed: {
    hasData() {
      return this.restaurants.length != 0;
    },
  },
};
</script>

<style scoped>
div.main {
  margin: 1rem 0;
}
div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.well-display div.well {
  cursor: pointer;
}
</style>