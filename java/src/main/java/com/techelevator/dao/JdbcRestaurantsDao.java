package com.techelevator.dao;

import com.techelevator.model.Restaurant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class JdbcRestaurantsDao implements RestaurantDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRestaurantsDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Restaurant> getRestaurants() {

        final String sql = "SELECT restaurant_id, name, type, address, city, state_abbrev, zip_code, open_time, close_time, rating\n" +
                "FROM restaurants;";
        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
        final List<Restaurant> restaurants = new ArrayList<>();
        while (results.next()) {
//            LocalTime openTime = null;
//            if (results.getTime("open_time").toLocalTime() != null) {
//                openTime = results.getTime("open_time").toLocalTime();
//            }
//            LocalTime closeTime = null;
//            if (results.getTime("close_time").toLocalTime() != null) {
//                closeTime = results.getTime("close_time").toLocalTime();
//            }
            final Restaurant restaurant = new Restaurant(
                    results.getInt("restaurant_id"),
                    results.getString("name"),
                    results.getString("type"),
                    results.getString("address"),
                    results.getString("city"),
                    results.getString("state_abbrev"),
                    results.getInt("zip_code"),
                    results.getTime("open_time").toLocalTime(),
                    results.getTime("close_time").toLocalTime(),
                    results.getDouble("rating")
            );
             restaurants.add(restaurant);
        }
        return restaurants;
    }
}