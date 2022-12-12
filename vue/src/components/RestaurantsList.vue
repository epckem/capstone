<template>
  <div class="restaurants">
    <h1 v-if="!hasData">Sorry no search results found. Try again!</h1>

    <!-- <div
      class="search filter"
      v-for="restaurant in filteredList"
      :key="restaurant"
    ></div>
    <div class="item error" v-if="input && !filteredList.length">
      <p>No results found!</p>
    </div> -->

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
// import RestaurantService from "../services/RestaurantService";
import RestaurantDisplay from "./RestaurantDisplay";
export default {
  name: "restaurant-list",
  props: ["restaurants"],
  data() {
    return {
      searchTerm: "",
      isLoading: false,
    };
  },
  components: {
    RestaurantDisplay,
  },

  methods: {
    timeStatus() {
      let time = new Date().toLocaleTimeString([], {
        hour: "2-digit",
        minute: "2-digit",
      });
      if (this.restaurant.open < time < this.restaurant.close) {
        return null;
      }
    },
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