package com.java.mongo.org.controller.validator;

import javax.validation.Payload;

public class Severity {

    public interface Info extends Payload {
    }

    public interface Warn extends Payload {
    }

    public interface Error extends Payload {
    }


}
