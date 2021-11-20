package com.musakarabulut.hotelreservation.controller;

import com.musakarabulut.hotelreservation.model.Rooms;
import com.musakarabulut.hotelreservation.model.User;
import com.musakarabulut.hotelreservation.service.RoomsService;
import com.musakarabulut.hotelreservation.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {
    private RoomsService roomService;
    public RoomController(RoomsService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/{id}") // urlden parametre almak istiyorsak bu şekilde tanımlanır @PathVariable ile alınır
    public Rooms get(@PathVariable("id") Long id) {
        return roomService.get(id);
    }

    @GetMapping
    //herhangi bir parametre vermezsek requestmapping de tanımlanan url direk kulanılır o kök url olarak düşünülebilir
    public List<Rooms> getAll() {
        return roomService.getAll();
    }

    @PostMapping
    public Rooms save(@RequestBody Rooms rooms) { //@RequestBody sorguda body den gönderilen veriyi almak için kullanılır
        return roomService.save(rooms);
    }

    @PutMapping("/{id}")
    public Rooms update(@PathVariable("id") Long id, @RequestBody Rooms rooms) {
        return roomService.update(id, rooms);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        return roomService.delete(id);
    }


}
