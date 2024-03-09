package com.dailycodebuffer.eventservice.client;


import com.dailycodebuffer.eventservice.model.Guest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;
@HttpExchange
public interface GuestClient {
    @GetExchange("/guest/event/{eventId}")
    public List<Guest> findByEvent(@PathVariable("eventId") Long eventId);



}
