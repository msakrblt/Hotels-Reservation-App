package com.musakarabulut.hotelreservation.repository;

import com.musakarabulut.hotelreservation.model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms,Long> {
}
