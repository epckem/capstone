package com.techelevator.dao;

import com.techelevator.model.Event;

import java.util.List;

public interface EventDao {


    List<Event> getEventsByUser(int id);

    Event createEvent(Event event);

    Event getEvent(int event_id);


}
