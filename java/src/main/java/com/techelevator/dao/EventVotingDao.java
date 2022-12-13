package com.techelevator.dao;

import com.techelevator.model.Restaurant;
import org.w3c.dom.events.Event;

import java.util.List;

public interface EventVotingDao {
    List<Restaurant> getRestaurants(); // is this still needed??

    List<Event> getRestaurantsListByEventId(int id);



}
