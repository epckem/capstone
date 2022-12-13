<template>
  <div></div>
</template>

<script>
import EventService from "../services/EventService";

export default {
  created() {
    EventService.getEvents(this.$route.params.code).then((response) => {
      const id = parseInt(response.data.eventId);
      this.$router.push(`/events/${id}`);
    });
  },
};
</script>

<style>
</style>