package com.olegzcv.rest.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ExceptionData> noEmployee(NoSuchEmployeeException ex) {
        ExceptionData exceptionData = new ExceptionData(ex);
        return new ResponseEntity<ExceptionData>(exceptionData, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionData> handleException(Exception ex) {
        ExceptionData exceptionData = new ExceptionData();
        exceptionData.setMessage(ex.getMessage());
        return new ResponseEntity<>(exceptionData, HttpStatus.BAD_REQUEST);
    }
}
