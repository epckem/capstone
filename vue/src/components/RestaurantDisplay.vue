<template>
  <div class="restaurant" id="main-grid">
    <div id="img-container" class="img-container">
      <img
        id="pointer"
        class="list-images"
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
        {{ convertTime(restaurant.open) }} -
        {{ convertTime(restaurant.close) }} <span v-if="isOpen">OPEN</span
        ><span v-else>CLOSED</span>
      </p>
      <label for="voteUp" class="voting">
        <input type="radio" name="voteUp" value="1" checked />
        <img src="..\assets\icons8-thumbs-down-64 (1).png" alt="voteUp" />
      </label>
      <label for="voteDown" class="voting">
        <input type="radio" name="voteDown" value="-1" checked />
        <img src="..\assets\icons8-thumbs-down-64_updated.png" alt="voteDown" />
      </label>
    </div>
  </div>
</template>

<script>
import moment from "moment";
export default {
  beforeCreate() {
    document.body.className = "display";
  },
  name: "restaurant-display",
  props: ["restaurant"],
  methods: {
    convertTime(time) {
      const now = moment(time, "HH:mm:ss");
      return now.format("h:mm A");
    },
    viewRestaurantDetails(id) {
      this.$router.push(`/restaurants/${id}`);
    },
  },
  computed: {
    isOpen() {
      const open = moment(this.restaurant.open, "HH:mm:ss");
      const closed = moment(this.restaurant.close, "HH:mm:ss");
      const now = moment();
      return now.isAfter(open) && now.isBefore(closed);
    },
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");
body {
  font-family: "Poppins";
}
body.display {
  background-image: url("https://iili.io/HoKnma1.webp");
  background-attachment: fixed;
  background-size: cover;
  background-position: 30%;
}

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
[type="radio"] {
  position: absolute;
  opacity: 0;
  width: 40px;
  height: 40px;
}

[type="radio"] + img {
  cursor: pointer;
}

[type="radio"]:checked + img {
  outline: 2px solid #f00;
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
  width: 900px;
  height: 350px;
  border: 3px solid black;
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

