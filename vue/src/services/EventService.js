import http from 'axios';

export default {

    addEvent(event) {
        return http.post("/events", event)
    },

    getEvents() {
        return http.get("/events")
    },

    getEvent(id) {
        return http.get(`/events/${id}`);
    }
}