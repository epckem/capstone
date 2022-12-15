<template>
  <div class="event-details">
    <h1 id="event-name">{{ event.eventName }}</h1>
    <div id="event-info">
      <h3>{{ event.location }}</h3>
      &nbsp;|&nbsp;
      <h3>{{ convertDecisionDate(event.decisionDate) }}</h3>
    </div>
  </div>
</template>

<script>
import moment from "moment";

export default {
  name: "event-detail",
  props: ["event"],
  beforeCreate() {
    document.body.className = "event-details";
  },
  methods: {
    convertDecisionDate(date) {
      const newDate = moment(date, "YYYY-MM-DD HH:mm:ss");
      return newDate.format("MM-DD-YYYY | h:mm A");
    },
  },
};
</script>

<style>
.event-details {
  display: flex;
  flex-direction: column;
  align-items: center;
}
#event-name {
  display: flex;
  align-items: center;
  color: white;
  font-size: 50px;
  font-weight: bold;
  margin-bottom: 0px;
}
#event-info {
  display: flex;
  flex-direction: row;
  align-items: center;
  color: white;
  margin-bottom: 30px;
}
</style>