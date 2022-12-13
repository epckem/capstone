<template>
  <div class="search-input">
    <input
      id="search-input"
      type="text"
      v-model="searchTerm"
      placeholder="Search by ZipCode or City"
      v-on:keyup.enter="onChange"
    />
  </div>
</template>

<script>
export default {
  name: "search-bar",
  data() {
    return {
      searchTerm: "",
    };
  },
  methods: {
    onChange() {
      this.$emit("change", this.searchTerm);
    },
  },
};
</script>

<style>
#search-input {
  background: none;
  width: 385px;
  border: none;
}
</style>