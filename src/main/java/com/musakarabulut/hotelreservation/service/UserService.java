package com.musakarabulut.hotelreservation.service;

import com.musakarabulut.hotelreservation.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAll();

    public User get(Long id);

    public User save(User user);

    public User update(Long id, User user);

    public String delete(Long id);

}
