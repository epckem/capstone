<template>
  <div class="restaurant" v-bind:key="restaurant.restaurant_id">
    <h4>{{ restaurant.name }}</h4>
    <div class="rating">
      <img
        src="../assets/star.png"
        v-bind:title="restaurant.rating + ' Star Review'"
        class="ratingStar"
        v-for="n in Math.ceil(restaurant.rating)"
        v-bind:key="n"
      />
    </div>
    <h3>
      {{ restaurant.address }} {{ restaurant.city }},
      {{ restaurant.state_abbrev }}
    </h3>
    <p>{{ restaurant.open }} - {{ restaurant.close }}}}</p>
    <!-- <p>
      Favorite?
      <input
        type="checkbox"
        v-bind:checked="restaurant.favorited"
        v-on:change="onFavoritedChange(restaurant)"
      />
    </p> -->
  </div>
</template>

<script>
export default {
  name: "restaurant-display",
  props: ["restaurant"],
  //   methods: {
  //     onFavoritedChange(restaurant) {
  //       this.$store.commit("FLIP_FAVORITED", restaurant);
  //     },
  //   },
};
</script>

<style scoped>
div.main div.restaurant {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

/* div.main div.restaurant.favorited {
  background-color: lightyellow;
} */

div.main div.restaurant div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.restaurant div.rating img {
  height: 100%;
}

div.main div.restaurant p {
  margin: 20px;
}

div.main div.restaurant h3 {
  display: inline-block;
}

div.main div.restaurant h4 {
  font-size: 1rem;
}
</style>

