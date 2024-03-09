package com.dailycodebuffer.guestservice.controller;


import com.dailycodebuffer.guestservice.model.Guest;
import com.dailycodebuffer.guestservice.repository.GuestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GuestController.class);

    @Autowired
     GuestRepository repository;

    @PostMapping
    public Guest add(@RequestBody Guest guest) {
        LOGGER.info("Guest add: {}", guest);
        return repository.add(guest);
    }

    @GetMapping
    public List<Guest> findAll() {
        LOGGER.info("Guest find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Guest findById(@PathVariable("id") Long id) {
        LOGGER.info("Guest find: id={}", id);
        return repository.findById(id);
    }

    @GetMapping("/event/{eventId}")
    public List<Guest> findByEvent(@PathVariable("eventId") Long eventId) {
        LOGGER.info("Guest find: eventId={}", eventId);
        return repository.findByEvent(eventId);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        LOGGER.info("Guest delete: id={}", id);
        repository.deleteById(id);
    }
}


