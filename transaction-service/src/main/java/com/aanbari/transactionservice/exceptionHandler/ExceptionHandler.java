package com.aanbari.transactionservice.exceptionHandler;

import com.aanbari.transactionservice.exception.ExceptionResponse;
import com.aanbari.transactionservice.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<ExceptionResponse> NotFoundException(NotFoundException exc){

        ExceptionResponse exception = new ExceptionResponse();
        exception.setMessage(exc.getMessage());
        exception.setStatus(HttpStatus.NOT_FOUND.value());
        exception.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }


    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<ExceptionResponse> ExceptionHandler(Exception exc){

        ExceptionResponse exception = new ExceptionResponse();
        exception.setMessage(exc.getMessage());
        exception.setStatus(HttpStatus.BAD_REQUEST.value());
        exception.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }
}
