<template>
  <div class="main">
    <h1 id="title-restaurants">Restaurants</h1>
    <search-bar id="search-bar" @change="retrieveRestaurants"></search-bar>
    <restaurant-list :restaurants="restaurants"></restaurant-list>
  </div>
</template>

<script>
import SearchBar from "../components/SearchBar.vue";
import RestaurantService from "../services/RestaurantService";
import RestaurantList from "../components/RestaurantsList.vue";

export default {
  beforeCreate() {
    document.body.className = "restaurants";
  },
  name: "restaurants",
  components: {
    RestaurantList,
    SearchBar,
  },
  created() {
    this.retrieveRestaurants();
    // TODO .catch()
  },
  computed: {
    restaurants() {
      return this.$store.state.restaurants;
    },
  },
  methods: {
    retrieveRestaurants(search) {
      RestaurantService.getRestaurants(search, search).then((response) => {
        this.$store.commit("SET_RESTAURANTS", response.data);
      });
    },
  },
};
</script>

<style>
#title-restaurants {
  color: white;
  -webkit-text-stroke-width: 1px;
  -webkit-text-stroke-color: #db1f48;
  font-size: 50px;
  display: flex;
  justify-content: center;
}

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

