package com.musakarabulut.hotelreservation.repository;

import com.musakarabulut.hotelreservation.model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms,Long> {

    void deleteByRoomNo(int roomNo);

    Optional<Rooms> findByRoomNo(int roomNo);
}
