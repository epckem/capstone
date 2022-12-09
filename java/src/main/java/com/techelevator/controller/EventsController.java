package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import com.techelevator.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.security.Timestamp;
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

    @GetMapping("/events/{id}")
    public List<Event> getEventsById(Principal principal, @PathVariable int id) {
        User user = userDao.findByUsername(principal.getName());
        id = user.getId();
        return this.eventDao.getEventsById(id);
    }

    @PostMapping("/events")
    public void addEvent(@RequestParam String eventName, @RequestParam String location, @RequestParam Timestamp decisionDate) {
        eventDao.createEvent(eventName, location, decisionDate);
    }
    //TODO: link???

}
