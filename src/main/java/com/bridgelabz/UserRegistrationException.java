package com.bridgelabz;

public class UserRegistrationException extends Exception {
    static String message;

    // declaring enum
    enum ExceptionType {
        ENTERED_INVALID, ENTERED_NULL
    }
    // declaring constructor
    ExceptionType type;
    public UserRegistrationException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }

}
