<template>
  <div>
    <event-details :event="event"></event-details>
    <restaurant-list :restaurants="restaurants"></restaurant-list>
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
  data() {
    return {
      event: {},
      restaurants: [],
    };
  },
  created() {
    EventService.getEvent(this.$route.params.id)
      .then((response) => {
        this.event = response.data;
        return this.event.eventId;
      })
      .then((eventId) => EventService.getEventRestaurants(eventId))
      .then((resp) => {
        this.restaurants = resp.data;
      });
  },
};
</script>

<style>
</style>