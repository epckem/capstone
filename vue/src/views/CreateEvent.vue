<template>
  <invite-form></invite-form>
</template>

<script>
import InviteForm from "../components/InviteForm.vue";
export default {
  beforeCreate() {
    document.body.className = "invite";
  },
  name: "InviteView",
  components: {
    InviteForm,
  },
};
</script>

<style>
body.invite {
  background-image: none;
  background-color: #01949a;
}
</style>