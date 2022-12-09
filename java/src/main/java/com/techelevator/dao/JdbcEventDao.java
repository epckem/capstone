package com.techelevator.dao;

import com.techelevator.model.Event;
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
    public List<Event> getEventsByUserId(int id) {

        final String sql = "SELECT users.user_id, eventName, location, decisionDate, inviteCode FROM events JOIN users ON events.user_id = users.user_id WHERE users.user_id = ?;";
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

   private Event mapRowToEvent(SqlRowSet rowSet) {
       Event event = new Event();
       event.setEventId(rowSet.getInt("event_id"));
       event.setUserId(rowSet.getInt("user_id"));
       event.setEventName(rowSet.getString("eventName"));
       event.setLocation(rowSet.getString("location"));
       event.setDecisionDate(rowSet.getTimestamp("decisionDate"));
       event.setInviteCode(rowSet.getString("inviteCode"));

       return event;
   }


}
