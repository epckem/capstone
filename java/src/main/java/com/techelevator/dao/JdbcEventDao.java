//package com.techelevator.dao;
//
//import com.techelevator.model.Event;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class JdbcEventDao implements EventDao{
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public JdbcEventDao(JdbcTemplate jdbcTemplate) {
//
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public List<Event> getEvents(int id) {
//
//        final String sql = "SELECT users.user_id, eventname, location, decisiondate, inviteurl \n" +
//                "\tFROM events\n" +
//                "\tJOIN users ON events.user_id = users.user_id\n" +
//                "\tWHERE users.user_id = ?;";
//        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
//        final List<Event> events = new ArrayList<>();
//        while (results.next()) {
//            events.add(mapRowToEvent(results));
//        }
//        return events;
//    }
//
//    @Override
//    public Event createEvent(Event event) {
//        final String sql = "INSERT INTO events(\n" +
//                "\tuser_id, eventname, location, decisiondate, inviteurl)\n" +
//                "\tVALUES (?, ?, ?, ?, ?);";
//        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, event.getEventName(), event.getLocation(), event.getDecisionDate(), event.getInviteUrl());
//        return getEvent(newID);
//    }

//    @Override
//    public boolean createEvent(int userId, String eventName, String location, LocalDateTime decisionDate, String inviteUrl) {
//        final String sql = "INSERT INTO events(\n" +
//                "\tuser_id, eventname, location, decisiondate, inviteurl)\n" +
//                "\tVALUES (?, ?, ?, ?, ?);";
//        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, even)
//        return false;
//    }

//    private Event mapRowToEvent(SqlRowSet rowSet) {
//        Event event = new Event();
//        event.setUserId(rowSet.getInt("user_id"));
//        event.setEventName(rowSet.getString("eventname"));
//        event.setLocation(rowSet.getString("location"));
//        event.setDecisionDate(rowSet.getTimestamp("decisiondate"));
//        event.setInviteUrl(rowSet.getString("inviteurl"));
//
//        return event;
//    }
//
//
//}
