package com.musakarabulut.hotelreservation.model.validation;

import com.musakarabulut.hotelreservation.service.RoomsService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniquRoomNoValidator implements ConstraintValidator<UniqueRoomNo, Integer> {

    private RoomsService roomsService;

    public UniquRoomNoValidator(RoomsService roomsService) {
        this.roomsService = roomsService;
    }

    @Override
    public boolean isValid(Integer roomNo, ConstraintValidatorContext constraintValidatorContext) {
        if(roomsService.findByRoomNo(roomNo)){
            return false;
        }
        return true;
    }
}
