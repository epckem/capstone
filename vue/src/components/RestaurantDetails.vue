<template>
  <div class="details">
    <!-- <div>
      <img
        src="https://i.pinimg.com/originals/6d/00/9e/6d009e1b243cc054596b94082499e2ce.png"
        class="ratingStar"
      />
    </div>
    <div>
      <img
        src="https://upload.wikimedia.org/wikipedia/commons/6/62/Barbieri_-_ViaSophia25668.jpg"
        alt="restaurant image"
      />
    </div>
    <div>
      <p>Mexican</p>
      <p>123 Main Street, Cincinnati, OH 45212</p>
      <p>M-F: 11am-11pm</p>
      <span>Open</span>
    </div> -->

    <h1>{{ restaurant.name }}</h1>
  </div>
</template>

<script>
import RestaurantService from "../services/RestaurantService";

export default {
  name: "restaurant-details",

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