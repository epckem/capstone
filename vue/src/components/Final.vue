<template>
  <div class="restaurants">
    <restaurants-list :restaurants="restaurants" />
  </div>
</template>

<script>
import EventService from "../services/EventService";
import RestaurantsList from "./RestaurantsList.vue";

export default {
  props: ["restaurants"],
  name: "restaurant-finalists",
  components: { RestaurantsList },
  created() {
    EventService.getRestaurantFinalists(this.$route.params.id).then(
      (response) => {
        this.$store.commit("SET_RESTAURANTS", response.data);
      }
    );
  },
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