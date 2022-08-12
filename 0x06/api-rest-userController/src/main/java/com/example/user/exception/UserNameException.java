package com.example.user.exception;

public class UserNameException extends RuntimeException{

    private String message;

    public UserNameException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}