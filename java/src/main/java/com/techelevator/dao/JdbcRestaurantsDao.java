package com.techelevator.dao;

import com.techelevator.model.Restaurant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcRestaurantsDao implements RestaurantDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRestaurantsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Restaurant> getRestaurants() {

        final String sql = "SELECT restaurant_id, img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone\n" +
                "FROM restaurants;";
        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
        final List<Restaurant> restaurants = new ArrayList<>();
        while (results.next()) {
            restaurants.add(mapRowToRestaurant(results));
        }
        return restaurants;
    }

    @Override
    public List<Restaurant> filteredRestaurants(String zipcode, String city) {
        final String sql = "SELECT restaurant_id, img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone\n" +
                "FROM restaurants\n" +
                "WHERE zip_code ILIKE = ? OR city ILIKE = ?";
        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, '%' + zipcode + '%', '%' + city + '%');
        final List<Restaurant> restaurants = new ArrayList<>();
        while (results.next()) {
            restaurants.add(mapRowToRestaurant(results));
        }
        return restaurants;
    }


    private Restaurant mapRowToRestaurant(SqlRowSet rowSet) {
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurant_id(rowSet.getInt("restaurant_id"));
        restaurant.setImg(rowSet.getString("img"));
        restaurant.setName(rowSet.getString("name"));
        restaurant.setDescription(rowSet.getString("description"));
        restaurant.setType(rowSet.getString("type"));
        restaurant.setAddress(rowSet.getString("address"));
        restaurant.setCity(rowSet.getString("city"));
        restaurant.setState(rowSet.getString("state_abbrev"));
        restaurant.setZipcode(rowSet.getString("zip_code"));
        restaurant.setOpen(rowSet.getTime("open_time").toLocalTime());
        restaurant.setClose(rowSet.getTime("close_time").toLocalTime());
        restaurant.setRating(rowSet.getDouble("rating"));
        restaurant.setPhoneNumber(rowSet.getString("phone"));

        return restaurant;
    }

}