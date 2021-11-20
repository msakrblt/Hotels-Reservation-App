package com.musakarabulut.hotelreservation.service;

import com.musakarabulut.hotelreservation.model.User;
import com.musakarabulut.hotelreservation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User get(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        return userRepository.save(user);
    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "User deleted!";
    }
}