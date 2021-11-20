package com.musakarabulut.hotelreservation.service;

import com.musakarabulut.hotelreservation.model.Rooms;
import com.musakarabulut.hotelreservation.model.User;

import java.util.List;

public interface RoomsService {
    public List<Rooms> getAll();

    public Rooms get(Long id);

    public Rooms save(Rooms rooms);

    public Rooms update(Long id, Rooms rooms);

    public String delete(Long id);
}
