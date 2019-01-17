package edu.neu.cs4500.controllers;



public class HelloObject {
    private String message;
    public String getMEssage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public HelloObject(String message) {
        this.message = message;
    }
    public HelloObject() {}

}
