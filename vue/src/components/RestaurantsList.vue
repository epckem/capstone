<template>
  <div class="restaurants">
    <restaurant-display
      class="restaurant"
      v-for="restaurant in restaurants"
      v-bind:key="restaurant.restaurant_id"
      :restaurant="restaurant"
    />
    <div class="loading" v-if="isLoading">
      <img
        src="https://i.pinimg.com/originals/3b/d6/36/3bd636710de01d3256732078071c22c4.gif"
      />
    </div>
  </div>
</template>

<script>
import RestaurantService from "../services/RestaurantService";
import RestaurantDisplay from "./RestaurantDisplay";
export default {
  name: "restaurant-list",
  components: {
    RestaurantDisplay,
  },
  created() {
    RestaurantService.getRestaurants().then((response) => {
      this.$store.commit("SET_RESTAURANTS", response.data);
    });
    // TODO .catch()
  },
  computed: {
    restaurants() {
      return this.$store.state.restaurants;
    },
  },
};
</script>

<style scoped>
div.main {
  background-color: red;
  margin: 1rem 0;
}
div.main div.well-display {
  display: flex;
  justify-content: space-around;
  background-color: red;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
  background-color: red;
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