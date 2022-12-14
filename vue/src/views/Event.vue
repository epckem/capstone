<template>
  <div>
    <event-details />
    <restaurant-list />
  </div>
</template>

<script>
import EventService from "../services/EventService";
import RestaurantList from "../components/RestaurantsList.vue";
import EventDetails from "../components/EventDetails.vue";
export default {
  components: {
    EventDetails,
    RestaurantList,
  },
  // data() {
  //   return {
  //     event: {},
  //     restaurants: {},
  //   };
  // },
  created() {
    EventService.getEvent(this.$route.params.id)
      .then((response) => {
        this.EventDetails = response.data;
        return this.event.eventId;
      })
      .then((eventId) => EventService.getEventRestaurants(eventId))
      .then((resp) => {
        this.RestaurantList = resp.data;
      });
  },
};
</script>

<style>
</style>