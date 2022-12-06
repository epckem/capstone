import http from 'axios';

export default {
    getRestaurants() {
        return http.get("/restaurants");
    },

    getRestaurant() {
        return http.get("/restaurants/id");
    }
}