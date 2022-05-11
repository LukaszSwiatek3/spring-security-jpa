package com.example.springsecurityjpa.models;

import java.util.ArrayList;
import java.util.List;

public class Events {

    private List<Event> events = new ArrayList<>();

    public Events() {
    }

    public Events(List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
