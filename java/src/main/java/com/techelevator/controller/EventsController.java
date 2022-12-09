package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import com.techelevator.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

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
    public List<Event> getEventsByUser(Principal principal) {
        User user = userDao.findByUsername(principal.getName());
        int id = user.getId();
        return this.eventDao.getEventsByUser(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/events")
    public Event addEvent(Principal principal, @RequestBody Event event) {
        User user = userDao.findByUsername(principal.getName());
        event.setUserId(user.getId());
        event.setInviteCode(UUID.randomUUID().toString());
        return this.eventDao.createEvent(event);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/events/{id}")
    public Event getEventByEventId(@PathVariable int id) {
        return this.eventDao.getEvent(id);
    } //TODO: Check path variable

}
