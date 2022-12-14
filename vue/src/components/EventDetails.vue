<template>
  <div class="event-details">
      <h1 id="event-name">{{ event.eventName }}</h1>
    
        <h2>{{ event.location }}</h2>
        <p>{{ event.decisionDate }}</p>
        
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