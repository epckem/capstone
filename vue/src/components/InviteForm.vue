<template>
  <div id="main-grid1">
    <form1>
      <div id="heading">
        <h1>Create an Event</h1>
        <h3>Let's get this party started!</h3>
      </div>
      <div id="formContent">
        <label for="eventName" class="sr-only" id="eventName"
          >Event Name:</label
        >
        <input
          type="text"
          id="event-input"
          class="form2-control"
          placeholder="Event Name"
          v-model="event.eventName"
          required
          autofocus
        />
        <label for="location" class="sr-only" id="location"
          >Zip Code or City:</label
        >
        <input
          type="text"
          id="location-input"
          class="form2-control"
          placeholder="Location"
          v-model="event.location"
          required
        />
        <label for="date" id="date">Decision Date/Time:</label>
        <input
          type="datetime-local"
          id="date-input"
          class="form2-control"
          placeholder="Date/Time"
          v-model="event.date"
          required
        />
        <button
          id="generate-btn"
          type="submit"
          v-on:submit.prevent="createEvent"
        >
          Generate Link!
        </button>
        <p id="generatedLink">Invitation Link:</p>
      </div>
    </form1>
  </div>
</template>

<script>
import EventService from "../services/EventService";
export default {
  beforeCreate() {
    document.body.className = "invite-img";
  },
  name: "InviteForm",
  components: {},
  data() {
    return {
      event: {
        eventName: "",
        location: "",
        date: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    createEvent() {
      EventService.addEvent(this.event)
        .then((response) => {
          if (response.status == 201) {
            this.event = {
              eventName: "",
              location: "",
              date: "",
            };
            this.$router.push({ name: "home" });
          }
        })
        .catch((error) => {
          if (error.response) {
            this.errorMsg =
              "There was an error adding the event. Response received was '" +
              error.response.statusText +
              "'.";
          } else if (error.request) {
            this.errorMsg =
              "There was an error adding the event. Server could not be reached.";
          } else {
            this.errorMsg =
              "There was an error adding the event. Request could not be created.";
          }
        });
    },
  },
};
</script>

<style >
body.invite-img {
  background-image: url("https://iili.io/HoKnma1.webp");
  background-size: cover;
  background-position: 30%;
}

#main-grid1 {
  display: grid;

  grid-template-columns: 1fr 1fr 1fr;

  column-gap: 50px;
  grid-template-areas: ".  main-grid   .";
  background-color: white;
  margin-left: 400px;
  margin-right: 400px;
  border: 3px solid black;
  border-radius: 15px 50px;
}
form1 {
  grid-area: main-grid;
  display: flex;
  flex-direction: column;
}
#formContent {
  display: flex;
  flex-direction: column;
  row-gap: 10px;
}
label {
  font-size: 20px;
}
.form2-control {
  height: 25px;
  font-size: 20px;
}
.generate-btn {
  height: 27px;
  font-size: 20px;
}
</style>