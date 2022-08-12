package com.example.user.exception;

public class UserIdException extends RuntimeException{

    private final String message;

    public UserIdException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}