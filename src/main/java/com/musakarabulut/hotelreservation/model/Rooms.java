package com.musakarabulut.hotelreservation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rooms {
    @Id //db tarafında bir id
    @GeneratedValue(strategy= GenerationType.AUTO) //otomatik id oluşturur
    private Long id;
    private Integer roomNo;
    private String roomsType;
    private Boolean status;

}
