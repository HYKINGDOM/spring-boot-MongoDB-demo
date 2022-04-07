package com.java.mongo.org.config;

import org.springframework.stereotype.Component;

import javax.validation.ClockProvider;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidHandle implements ConstraintValidator<EmailValid, String> {


    @Override
    public void initialize(EmailValid constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println(value);
        System.out.println(context);
        ClockProvider clockProvider = context.getClockProvider();
        return false;
    }
}
