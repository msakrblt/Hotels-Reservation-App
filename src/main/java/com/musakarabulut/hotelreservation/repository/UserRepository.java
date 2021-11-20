package com.musakarabulut.hotelreservation.repository;

import com.musakarabulut.hotelreservation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
