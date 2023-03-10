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
    },

    submitVotes(eid, vote) {
        return http.post(`/events/${eid}/votes`, vote);
    },
    getRestaurantFinalists(eid) {
        return http.get(`/events/${eid}/finalists`);
    }
}