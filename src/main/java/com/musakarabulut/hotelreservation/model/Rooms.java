package com.musakarabulut.hotelreservation.model;

import com.musakarabulut.hotelreservation.model.validation.UniqueRoomNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rooms {
    @Id //db tarafında bir id
    @GeneratedValue(strategy= GenerationType.AUTO) //otomatik id oluşturur
    private Long id;
    @UniqueRoomNo
    private Integer roomNo;
    private RoomType roomsType;
    private Boolean status;

}
