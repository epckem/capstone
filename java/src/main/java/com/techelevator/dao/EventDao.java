package com.techelevator.dao;

import com.techelevator.model.Event;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public interface EventDao {

    List<Event> getEventsById(int id);

    Event createEvent(String eventName, String location, Timestamp decisionDate);

}