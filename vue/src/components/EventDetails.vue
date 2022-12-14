<template>
  <div class="event-details">
    <h2>{{ event.eventName }}</h2>

    <h3>{{ event.location }}</h3>
    <h3>{{ event.decisionDate }}</h3>
  </div>
</template>

<script>
export default {
  name: "event-detail",
  props: ["event"],
  beforeCreate() {
    document.body.className = "event-details";
  },
};
</script>

<style>
</style>