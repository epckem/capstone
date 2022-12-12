<template>
  <div class="main">
    <restaurant-list></restaurant-list>
  </div>
</template>

<script>
import RestaurantList from "../components/RestaurantsList.vue";

export default {
  beforeCreate() {
    document.body.className = "restaurants";
  },
  name: "restaurants",
  components: {
    RestaurantList,
  },
};
</script>

<style>
body.restaurants {
  background-image: none;
  background-color: #01949a;
}

#search-bar {
  display: block;
  width: 350px;
  margin: 20px auto;
  padding: 10px 45px;
  background: white url("../assets/search-icon.svg") no-repeat 15px center;
  background-size: 15px 15px;
  font-size: 16px;
  border: none;
  border-radius: 5px;
  box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px,
    rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
}
</style>

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

