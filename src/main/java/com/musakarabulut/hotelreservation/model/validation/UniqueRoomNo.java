package com.musakarabulut.hotelreservation.model.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniquRoomNoValidator.class)
public @interface UniqueRoomNo {
    String message() default "{room no must be unique}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
