package com.techelevator.controller;

import com.techelevator.dao.RestaurantDao;
import com.techelevator.model.Restaurant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class RestaurantsController {

    private RestaurantDao restaurantDao;

    RestaurantsController(RestaurantDao restaurantDao){this.restaurantDao = restaurantDao;}

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/restaurants")
    public List<Restaurant> filteredBy(@RequestParam(defaultValue = "") String zipcode,
                                       @RequestParam(defaultValue = "") String city) {
        return this.restaurantDao.filteredRestaurants(zipcode, city);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/restaurants/{id}")
    public Restaurant getRestaurant(@PathVariable int id) {
        return this.restaurantDao.getRestaurant(id);
    }




}
