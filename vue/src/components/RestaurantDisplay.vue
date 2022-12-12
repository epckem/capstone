<template>
  <div class="restaurant" id="main-grid">
    <div id="img-container" class="img-container">
      <img
        class="list-images"
        id="pointer"
        @click="viewRestaurantDetails(restaurant.restaurant_id)"
        v-bind:src="restaurant.img"
      />
      <div class="rating" id="second-grid">
        <img
          src="../assets/star.png"
          v-bind:title="restaurant.rating + ' Star Review'"
          class="ratingStar"
          v-for="n in Math.ceil(restaurant.rating)"
          v-bind:key="n"
        />
      </div>
    </div>
    <div id="restaurant-info" class="info-container">
      <h1
        class="restaurant-name"
        id="pointer"
        @click="viewRestaurantDetails(restaurant.restaurant_id)"
      >
        {{ restaurant.name }}
      </h1>
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
    viewRestaurantDetails(id) {
      this.$router.push(`/restaurants/${id}`);
    },
  },
};
</script>

<style>
#main-grid {
  display: grid;
  grid-template-columns: 1fr 1fr;
  column-gap: 20px;
  grid-template-areas: "img-container   info-container";
}
.img-container {
  grid-area: img-container;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.info-container {
  grid-area: info-container;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}

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
  width: 1000px;
  height: 350px;
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

#pointer {
  cursor: pointer;
}
.list-images {
  max-width: 300px;
  max-height: 300px;
  min-width: 300px;
  min-height: 300px;
}
#img-container {
  display: flex;
  position: relative;
  left: 30px;
}
.restaurant-name {
  max-width: 300px;
}
.rating {
  padding-top: 10px;
}
</style>

