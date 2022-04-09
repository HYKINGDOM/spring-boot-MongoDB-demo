package com.java.mongo.org.controller.validator;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({UserUpdate.class, UserCreate.class, Default.class})
public interface UserSequenceDesc {
}
