import http from 'axios';

export default {
    getRestaurants(city, zip) {
        const options = {
            params: {
                zip,
                city
            }
        };
        return http.get("/restaurants", options);
    },

    getRestaurant(id) {
        return http.get(`/restaurants/${id}`);
    }
}