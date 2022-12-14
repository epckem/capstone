package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Restaurant;
import com.techelevator.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcEventDao implements EventDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcEventDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Event getEvent(int event_id) {
        Event event = null;
        String sql = "SELECT event_id, user_id, eventName, location, decisionDate, inviteCode\n" +
                "FROM events\n" +
                "WHERE event_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, event_id);
        if (results.next()) {
            event = mapRowToEvent(results);
        }
        return event;
    }

    @Override

    public List<Event> getEventsByUser(int id) {

        final String sql = "SELECT event_id, user_id, eventName, location, decisionDate, inviteCode \n" +
                "FROM events \n" +
                "WHERE user_id = (SELECT user_id FROM users WHERE user_id = ?);";
        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, id);
        final List<Event> events = new ArrayList<>();
        while (results.next()) {
            events.add(mapRowToEvent(results));
        }
        return events;
    }

    @Override
    public Event createEvent(Event event) {
        final String sql = "INSERT INTO events (user_id, eventName, location, decisionDate, inviteCode) \n" +
                "VALUES (?, ?, ?, ?, ?) RETURNING event_id;";
        Integer event_id =  jdbcTemplate.queryForObject(sql,
                Integer.class,
                event.getUserId(),
                event.getEventName(),
                event.getLocation(),
                event.getDecisionDate(),
                event.getInviteCode());
        return getEvent(event_id);
    }

    @Override
    public List<Restaurant> getEventRestaurants(int event_id, String zipcode, String city) {

        final String sql = "SELECT r.restaurant_id, img, name, description,type, address, city, state_abbrev, zip_code, open_time, close_time, rating, phone, img2, img3, mapimg\n" +
                "FROM restaurants r\n" +
                "LEFT JOIN event_voting ev ON r.restaurant_id = ev.restaurant_id AND ev.event_id = ?\n" +
                "WHERE r.zip_code ILIKE ? OR r.city ILIKE  ?;";
        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, event_id, '%' + zipcode + '%', '%' + city + '%');
        final List<Restaurant> restaurants = new ArrayList<>();
        while (results.next()) {
            restaurants.add(mapRowToRestaurant(results));
        }
        return restaurants;
    }

    @Override
    public void submitVotes(int event_id, int restaurant_id, int upVote, int downVote) {
        final String sql = "INSERT INTO event_voting (event_id, restaurant_id, vote_up, vote_down) VALUES (?,?,?,?)\n" +
                "ON CONFLICT (event_id, restaurant_id) DO UPDATE SET vote_up = EXCLUDED.vote_up + ?, vote_down = EXCLUDED.vote_down + ?;";
           this.jdbcTemplate.update(sql, event_id, restaurant_id, upVote, downVote, upVote, downVote);
    }

    @Override
    public Event getEventByCode(String inviteCode) {
        Event event = null;
        final String sql = "SELECT event_id, user_id, eventName, location, decisionDate, inviteCode\n" +
                "FROM events\n" +
                "WHERE inviteCode = ?;";
        final SqlRowSet result = this.jdbcTemplate.queryForRowSet(sql, inviteCode);
        if (result.next()) {
            event = mapRowToEvent(result);
        }
        return event;
    }


    private Event mapRowToEvent(SqlRowSet rowSet) {
       Event event = new Event();
       event.setEventId(rowSet.getInt("event_id"));
       event.setUserId(rowSet.getInt("user_id"));
       event.setEventName(rowSet.getString("eventName"));
       event.setLocation(rowSet.getString("location"));
       event.setDecisionDate(rowSet.getTimestamp("decisionDate").toLocalDateTime());
       event.setInviteCode(rowSet.getString("inviteCode"));

       return event;
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
        restaurant.setImg2(rowSet.getString("img2"));
        restaurant.setImg3(rowSet.getString("img3"));;
        restaurant.setMapimg(rowSet.getString("mapimg"));



        return restaurant;
    }

}
