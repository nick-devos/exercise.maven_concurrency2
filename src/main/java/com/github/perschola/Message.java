package com.github.perschola;

import java.io.Serializable;

//JavaBean classes follow these conventions:
//1. Must implement Serializable.
//2. It should have a public no-arg constructor.
//3. All properties in java bean must be private with public getters and setter methods.

public class Message implements Serializable {
    private String message;

    public Message() {
        this.message = "This is the default message";
    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
