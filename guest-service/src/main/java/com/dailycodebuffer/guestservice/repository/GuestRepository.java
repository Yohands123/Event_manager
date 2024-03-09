package com.dailycodebuffer.guestservice.repository;

import com.dailycodebuffer.guestservice.model.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class GuestRepository {

    private List<Guest> guests = new ArrayList<>();

    public Guest add(Guest guest) {
        guests.add(guest);
        return guest;
    }

    public Guest findById(Long id) {
        return guests.stream()
                .filter(a -> a.Id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Guest> findAll() {
        return guests;
    }

    public List<Guest> findByEvent(Long eventId) {
        return guests.stream()
                .filter(a -> a.eventId().equals(eventId))
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        guests.removeIf(guest -> guest.Id().equals(id));
    }
}




