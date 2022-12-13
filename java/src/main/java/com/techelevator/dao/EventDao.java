package com.techelevator.dao;

import com.techelevator.model.Event;
import com.techelevator.model.Restaurant;

import java.util.List;

public interface EventDao {


    List<Event> getEventsByUser(int id);

    Event createEvent(Event event);

    Event getEvent(int event_id);

    List<Restaurant> getEventRestaurants(int event_id, String city, String zipcode);

    void submitVotes(int event_id, int restaurant_id, int upVote, int downVote);


}
