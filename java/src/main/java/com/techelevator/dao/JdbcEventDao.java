package com.techelevator.dao;

import com.techelevator.model.Event;

import java.util.List;


public class JdbcEventDao implements EventDao{
    @Override
    public List<Event> getEvents() {
        return null;
    }

    @Override
    public boolean createEvent() {
        return false;
    }
}
