package com.techelevator.model;

import java.time.LocalDateTime;

public class Event {
    private int event_id;
    private int user_id;
    private String eventName;
    private String location;
    private LocalDateTime decisionDate;
    private String inviteUrl;

    public Event() {

    }

    public Event(int event_id, int user_id, String eventName, String location, LocalDateTime decisionDate,  String inviteUrl) {
        this.event_id = event_id;
        this.user_id = user_id;
        this.eventName = eventName;
        this.location = location;
        this.decisionDate = decisionDate;
        this.inviteUrl = inviteUrl;
    }

    public int getEvent_id() {
        return event_id;
    }

    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDecisionDate() {
        return decisionDate;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getInviteUrl() {
        return inviteUrl;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDecisionDate(LocalDateTime decisionDate) {
        this.decisionDate = decisionDate;
    }

    public void setInviteUrl(String inviteUrl) {
        this.inviteUrl = inviteUrl;
    }
}
