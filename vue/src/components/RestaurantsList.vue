<template>
  <div>
    <h1>Restaurants</h1>
    <div class="restaurants">
      <div class="loading" v-if="isLoading">
        <img
          src="https://i.pinimg.com/originals/3b/d6/36/3bd636710de01d3256732078071c22c4.gif"
        />
      </div>
      <div
        class="restaurant"
        v-for="restaurant in restaurants"
        v-bind:key="restaurant.id"
        v-else
      ></div>
    </div>
  </div>
</template>

<script>
export default {
  name,
};
</script>

<style>
</style>