<template>
  <div>

  </div>
</template>

<script>
import EventService from "../services/EventService"

export default {
  name: "event-detail",
  props: [],
  beforeCreate() {
    document.body.className = "event-details";
  },
  data(){
    return{
      event: {},
    };
  },
  created(){
    const id = parseInt(this.$route.params.id);
    EventService.getEvent(id).then((event) => {
        this.event = event.data 
    });
  },

}
</script>

<style>

</style>