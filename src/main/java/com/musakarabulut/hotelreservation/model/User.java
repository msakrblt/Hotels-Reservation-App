package com.musakarabulut.hotelreservation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id //db tarafında bir id
    @GeneratedValue(strategy= GenerationType.AUTO) //otomatik id oluşturur
    private Long id;

    private String name;

    private String surname;

    private int age;
}
