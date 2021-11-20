package com.musakarabulut.hotelreservation.service;

import com.musakarabulut.hotelreservation.model.Rooms;
import com.musakarabulut.hotelreservation.model.User;
import com.musakarabulut.hotelreservation.repository.RoomsRepository;
import com.musakarabulut.hotelreservation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomsImpl implements RoomsService{
    private RoomsRepository roomsRepository;
    public RoomsImpl(RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }

    @Override
    public List<Rooms> getAll() {
        return null;
    }

    @Override
    public Rooms get(Long id) {
        Optional<Rooms> rooms = roomsRepository.findById(id);
        return rooms.get();
    }

    @Override
    public Rooms save(Rooms rooms) {
        return roomsRepository.save(rooms);
    }

    @Override
    public Rooms update(Long id, Rooms rooms) {
        return roomsRepository.save(rooms);
    }

    @Override
    public String delete(Long id) {
        roomsRepository.deleteById(id);
        return "Rooms Deleted!";
    }
}
