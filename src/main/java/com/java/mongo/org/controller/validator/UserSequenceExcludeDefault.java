package com.java.mongo.org.controller.validator;


import javax.validation.GroupSequence;

@GroupSequence({UserCreate.class, UserUpdate.class})
public interface UserSequenceExcludeDefault {
}
