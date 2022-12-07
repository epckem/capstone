<template>
  <Invite></Invite>
</template>

<script>
import Invite from "../components/Invite.vue";
export default {
  beforeCreate() {
    document.body.className = "invite";
  },
  name: "InviteView",
  components: {
    Invite,
  },
};
</script>

<style>
body.invite {
  background-image: none;
}
</style>