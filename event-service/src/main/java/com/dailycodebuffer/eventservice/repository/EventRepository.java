package com.dailycodebuffer.eventservice.repository;

import com.dailycodebuffer.eventservice.model.Guest;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.eventservice.model.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class EventRepository {
    private  List<Event> events = new ArrayList<>();

    public Event addEvent(Event event) {
        events.add(event);
        return event;
    }

    public Event findById(Long id) {
        return events.stream()
                .filter(event -> event.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Event> findAll() {
        return events;
    }

    public void deleteById(Long id) {
        events.removeIf(event -> event.getId().equals(id));
    }
    public List<Guest> findGuestsByEvent(Long eventId) {
        Event event = findById(eventId);
        if (event != null) {
            return event.getGuests();
        }
        return Collections.emptyList();
    }


}

