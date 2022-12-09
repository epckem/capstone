package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import com.techelevator.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Timestamp;
import java.util.List;

@PreAuthorize("isAuthenticated()")
@CrossOrigin
@RestController
public class EventsController {

    private UserDao userDao;
    private EventDao eventDao;


    public EventsController(EventDao eventDao, UserDao userDao) {
        this.eventDao = eventDao;
        this.userDao = userDao;
    }

    @GetMapping("/events")
    public List<Event> getEventsById(Principal principal) {
        User user = userDao.findByUsername(principal.getName());
        int id = user.getId();
        return this.eventDao.getEventsById(id);
    }

    @PostMapping("/events")
    public Event addEvent( @RequestBody Event event) {

        this.eventDao.createEvent(event);

        return event;
    }
    //TODO: link???

}
