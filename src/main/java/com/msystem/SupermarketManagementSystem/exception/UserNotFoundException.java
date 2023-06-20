package com.msystem.SupermarketManagementSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserNotFoundException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> userNotFound(String message) {
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
