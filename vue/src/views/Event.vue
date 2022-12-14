<template>
  <div>
    <event-details :event="event"></event-details>
    <restaurant-list :restaurants="$store.state.restaurants"></restaurant-list>
    <button @click="castVotes">Record my votes</button>
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
      // vote: {
      //   restaurant_id: "",
      //   upVote: 0,
      //   downVote: 0,
      // },
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
        this.$store.commit("SET_RESTAURANTS", resp.data);
      });
  },

  methods: {
    castVotes() {
      this.$store.state.restaurants
        .filter((r) => r.vote && (r.vote === 1 || r.vote === -1))
        .forEach((r) => {
          const vote = {
            restaurant_id: r.restaurant_id,
            upVote: r.vote === 1 ? 1 : 0,
            downVote: r.vote === -1 ? 1 : 0,
          };
          EventService.submitVotes(this.$route.params.id, vote);
        });
    },
  },
};
</script>

<style >
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