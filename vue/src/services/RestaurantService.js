import http from 'axios';

export default {
    getRestaurants(city, zipcode) {
        const options = {
            params: {
                zipcode,
                city
            }
        };
        return http.get("/restaurants", options);
    },

    getRestaurant(id) {
        return http.get(`/restaurants/${id}`);
    }
}