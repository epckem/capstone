<template>
  <div class="details" id="main-grid">
    <h1 id="rest-name">{{ restaurant.name }}</h1>
    <div id="rest-images">
      <img
        class="placeholders"
        v-bind:src="restaurant.img"
        alt="elementor placeholder image"
        border="0"
      />
      <img
        class="placeholders"
        v-bind:src="restaurant.img2"
        alt="elementor placeholder image"
        border="0"
      />
      <img
        class="placeholders"
        v-bind:src="restaurant.img3"
        alt="elementor placeholder image"
        border="0"
      />
    </div>
    <div id="second-grid">
      <div id="third-grid">
        <div id="stars">
          <img
            src="../assets/star.png"
            v-bind:title="restaurant.rating + ' Star Review'"
            class="ratingStar"
            v-for="n in Math.ceil(restaurant.rating)"
            v-bind:key="n"
          />
        </div>
        <div id="description">
          <h3>{{ restaurant.type }}</h3>
          <p>{{ restaurant.description }}</p>
        </div>
        <div id="address">
          <p>
            {{ restaurant.address }} {{ restaurant.city }},
            {{ restaurant.state }} -
            {{ restaurant.zipcode }}
          </p>
        </div>

        <span id="callToOrder"
          >Call To Order: {{ restaurant.phoneNumber }}</span
        >
        <p id="hours">
          Hours:
          {{ convertTime(restaurant.open) }} -
          {{ convertTime(restaurant.close) }}
        </p>
        <h4 id="services">Services: Delivery | Dine-in | Carry-out</h4>
      </div>
      <div id="google-maps">
        <img id="map" v-bind:src="restaurant.mapimg" alt="Google Maps" />
      </div>
    </div>
  </div>
</template>

<script>
import RestaurantService from "../services/RestaurantService";
import moment from "moment";

export default {
  name: "restaurant-details",
  beforeCreate() {
    document.body.className = "img-details";
  },
  methods: {
    convertTime(time) {
      return moment(time, "HH:mm:ss").format("h:mm A");
    },
  },
  data() {
    return {
      restaurant: {},
    };
  },
  created() {
    const id = parseInt(this.$route.params.id);
    RestaurantService.getRestaurant(id).then((restaurant) => {
      this.restaurant = restaurant.data;
    });
  },
};
</script>

<style>
body.img-details {
  background-image: url("https://iili.io/HoKnma1.webp");
  background-attachment: fixed;
  background-size: cover;
  background-position: 30%;
}
</style>

<style scoped>
#main-grid {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  gap: 20px;
  grid-template-areas:
    "rest-name            rest-name           rest-name"
    "rest-images  rest-images rest-images"
    "second-grid  second-grid second-grid";
}
#rest-name {
  grid-area: rest-name;
  font-size: 50px;
  display: flex;
  justify-content: center;
}
#rest-images {
  grid-area: rest-images;
  display: flex;
  flex-direction: row;
  column-gap: 25px;
  justify-content: space-evenly;
}
#second-grid {
  grid-area: second-grid;
  display: grid;
  gap: 20px;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-areas: "third-grid         third-grid      google-maps";
}

#hours-services {
  grid-area: hours-services;
  display: flex;
  flex-direction: column;
  background: white;
  border: 2px solid white;
  border-radius: 15px 50px;
  padding: 20px;
  justify-content: center;
}
#third-grid {
  grid-area: third-grid;
  display: grid;
  background: white;
  padding: 20px;
  border: 2px solid white;
  border-radius: 15px 50px;
  justify-content: space-around;
  grid-template-columns: 1fr 1fr;
  grid-template-areas:
    "stars        ."
    "description  description"
    "address      ."
    "callToOrder    ."
    "hours        ."
    "services      .";
}
#stars {
  grid-area: stars;
}
#description {
  grid-area: description;
}
#address {
  grid-area: address;
}
#callToOrder {
  grid-area: callToOrder;
}
#hours {
  grid-area: hours;
}
#services {
  grid-area: services;
}

#google-maps {
  grid-area: google-maps;
  display: flex;
}

h1 {
  font-size: 200px;
}

.placeholders {
  width: 350px;
  height: 350px;
  border: 2px solid black;
  border-radius: 5px;
}

.ratingStar {
  width: 50px;
  height: 50px;
}
#map {
  width: 300px;
  height: 300px;
  margin-left: 40px;
  margin-top: 70px;
  border: 2px solid black;
  border-radius: 5px;
}
</style>