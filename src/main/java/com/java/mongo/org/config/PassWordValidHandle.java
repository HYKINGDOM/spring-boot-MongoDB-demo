package com.java.mongo.org.config;

import lombok.extern.slf4j.Slf4j;

import javax.validation.ClockProvider;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author yi.hu
 */
@Slf4j
public class PassWordValidHandle implements ConstraintValidator<PassWordValid, String> {

    private String messages;

    private String pattern;

    @Override
    public void initialize(PassWordValid constraintAnnotation) {
        messages = constraintAnnotation.message();
        pattern = constraintAnnotation.pattern();
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern compile = Pattern.compile(pattern);
        log.info(messages);
        return compile.matcher(value).find();
    }
}
