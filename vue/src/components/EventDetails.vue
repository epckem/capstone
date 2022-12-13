<template>
  <div></div>
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