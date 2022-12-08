package com.techelevator.dao;

import com.techelevator.model.Event;

import java.time.LocalDateTime;
import java.util.List;

public interface EventDao {

    List<Event> getEvents(int id);

    Event createEvent(Event event);

//    boolean createEvent(int userId, String eventName, String location,
//                        LocalDateTime decisionDate, String inviteUrl);
}
