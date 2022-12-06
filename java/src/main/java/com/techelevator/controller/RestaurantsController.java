package com.techelevator.controller;

import com.techelevator.dao.RestaurantDao;
import com.techelevator.model.Restaurant;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RestaurantsController {

    private RestaurantDao restaurantDao;

    RestaurantsController(RestaurantDao restaurantDao){this.restaurantDao = restaurantDao;}

    @GetMapping("/restaurants")
    public List<Restaurant> getAll(){return  this.restaurantDao.getRestaurants();}

}
