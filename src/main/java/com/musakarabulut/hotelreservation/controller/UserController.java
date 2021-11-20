package com.musakarabulut.hotelreservation.controller;

import com.musakarabulut.hotelreservation.model.User;
import com.musakarabulut.hotelreservation.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}") // urlden parametre almak istiyorsak bu şekilde tanımlanır @PathVariable ile alınır
    public User get(@PathVariable("id") Long id) {
        return userService.get(id);
    }

    @GetMapping
    //herhangi bir parametre vermezsek requestmapping de tanımlanan url direk kulanılır o kök url olarak düşünülebilir
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User save(@RequestBody User user) { //@RequestBody sorguda body den gönderilen veriyi almak için kullanılır
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable("id") Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

}
