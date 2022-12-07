import http from 'axios';

export default {
    getRestaurants() {
        return http.get("/restaurants");
    },

    getRestaurant(id) {
        return http.get(`/restaurants/${id}`);
    }
}