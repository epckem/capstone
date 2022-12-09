<template>
  <div class="details">
    <h1>{{ restaurant.name }}</h1>

    <div>
      <div class="rating">
        <img
          src="../assets/star.png"
          v-bind:title="restaurant.rating + ' Star Review'"
          class="ratingStar"
          v-for="n in Math.ceil(restaurant.rating)"
          v-bind:key="n"
        />
      </div>

      <h3>{{ restaurant.type }}</h3>
      <p>{{ restaurant.description }}</p>
      <p>
        {{ restaurant.address }} {{ restaurant.city }}, {{ restaurant.state }} -
        {{ restaurant.zipcode }}
      </p>
    </div>
    <div>
      <span>Call To Order: {{ restaurant.phoneNumber }}</span>
      <div>
        <h4>Hours:</h4>
        <p>
          {{ convertTime(restaurant.open) }} -
          {{ convertTime(restaurant.close) }}
        </p>
      </div>
      <div>
        <h4>Services:</h4>
        <p>Delivery</p>
        <p>Dine-in</p>
        <p>Carry-out</p>
      </div>
    </div>
  </div>
</template>

<script>
import RestaurantService from "../services/RestaurantService";
import moment from "moment";

export default {
  name: "restaurant-details",
  methods: {
    convertTime(time) {
      return moment(time, "HH:mm:ss").format("h:mm A");
    },
  },
  data() {
    return {
      restaurant: {},
    };
  },
  created() {
    const id = parseInt(this.$route.params.id);
    RestaurantService.getRestaurant(id).then((restaurant) => {
      this.restaurant = restaurant.data;
    });
  },
};
</script>

<style scoped>
h1 {
  font-size: 200px;
}
</style>