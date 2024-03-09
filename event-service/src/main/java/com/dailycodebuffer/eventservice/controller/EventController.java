package com.dailycodebuffer.eventservice.controller;


import com.dailycodebuffer.eventservice.client.GuestClient;
import com.dailycodebuffer.eventservice.model.Guest;
import com.dailycodebuffer.eventservice.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dailycodebuffer.eventservice.model.Event;

import java.util.List;



@RestController
@RequestMapping("/event")
public class EventController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventController.class);

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private GuestClient guestClient;

    @PostMapping
    public Event add(@RequestBody Event event) {
        LOGGER.info("Adding Event: {}", event);
        return eventRepository.addEvent(event);
    }

    @GetMapping
    public List<Event> findAll() {
        LOGGER.info("Getting all Events");
        return eventRepository.findAll();
    }

    @GetMapping("/{id}")
    public Event findEventById(@PathVariable Long id) {
        LOGGER.info("Getting Event by ID: {}", id);
        return eventRepository.findById(id);
    }
    @GetMapping("/with-guests")
    public List<Event> findAllWithGuests() {
        LOGGER.info("Finding all guests for all events");
        List<Event> events = eventRepository.findAll();
        events.forEach(event -> event.setGuests(guestClient.findByEvent(event.getId())));
        return events;
    }


}


