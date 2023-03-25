package com.olegzcv.rest.exception_handling;

public class ExceptionData {
    private String message;
    public ExceptionData(RuntimeException ex) {
        message = ex.getMessage();
    }

    public ExceptionData() {
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String newMessage) {
        message = newMessage;
    }
}
