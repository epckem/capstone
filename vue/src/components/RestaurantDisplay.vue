<template>
  <div class="restaurant">
    <div id="img-container">
      <img v-bind:src="restaurant.img" />
      <div class="rating">
        <img
          src="../assets/star.png"
          v-bind:title="restaurant.rating + ' Star Review'"
          class="ratingStar"
          v-for="n in Math.ceil(restaurant.rating)"
          v-bind:key="n"
        />
      </div>
    </div>
    <div id="restaurant-info">
      <h1>{{ restaurant.name }}</h1>
      <h3>
        {{ restaurant.address }} {{ restaurant.city }}, {{ restaurant.state }} -
        {{ restaurant.zipcode }}
      </h3>
      <p>
        {{ convertTime(restaurant.open) }} - {{ convertTime(restaurant.close) }}
      </p>
      <!-- <p>
      Favorite?
      <input
        type="checkbox"
        v-bind:checked="restaurant.favorited"
        v-on:change="onFavoritedChange(restaurant)"
      />
    </p> -->
    </div>
  </div>
</template>

<script>
import moment from "moment";
export default {
  name: "restaurant-display",
  props: ["restaurant"],
  //   methods: {
  //     onFavoritedChange(restaurant) {
  //       this.$store.commit("FLIP_FAVORITED", restaurant);
  //     },
  //   },
  methods: {
    convertTime(time) {
      return moment(time, "HH:mm:ss").format("h:mm A");
    },
  },
};
</script>

<style>
div.main div.restaurant {
  display: flex;
  align-items: center;
  justify-content: space-around;
  flex-direction: row;
  text-align: center;
  border: 1px black solid;
  background-color: white;
  border-radius: 6px;
  padding: 1rem;
  margin-right: 20rem;
  margin-left: 20rem;
  margin-top: 1rem;
}

/* div.main div.restaurant {
  background-color: lightyellow;
} */

div.main div.restaurant div.rating {
  height: 2rem;
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

/* div.main div.restaurant h1 {
  font-size: 1rem;
} */
</style>

