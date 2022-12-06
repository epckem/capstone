import http from 'axios';

export default {

    getEvents() {
        return http.get("/events")
    },

    getEvent() {
        return http.get("/events/id")
    }
}