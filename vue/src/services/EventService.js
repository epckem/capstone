import http from 'axios';

export default {

    addEvent(event) {
        return http.post("/events", event)
    },

    getEvents(code) {
        const options = {
            params: {
                inviteCode: code
            }
        };

        return http.get("/events", options)
    },

    getEvent(id) {
        return http.get(`/events/${id}`);
    },

    getEventRestaurants(id) {
        return http.get(`/events/${id}/restaurants`);
    }
}