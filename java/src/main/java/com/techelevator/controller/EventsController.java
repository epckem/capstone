package com.techelevator.controller;

import com.techelevator.dao.EventDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Event;
import com.techelevator.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

//@PreAuthorize("isAuthenticated()")
@CrossOrigin
@RestController
public class EventsController {

    private UserDao userDao;
    private EventDao eventDao;

//    public EventsController(){}


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

}
