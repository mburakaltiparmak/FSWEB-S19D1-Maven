package com.workintech.s18d2.exceptions;

import com.workintech.s18d2.exceptions.ErrorResponse;
import com.workintech.s18d2.exceptions.FruitException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleFruitException(FruitException ex) {
        ErrorResponse response = new ErrorResponse(
                ex.getHttpStatus().value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        log.error("Fruit error occurred: {}", response);
        return new ResponseEntity<>(response, ex.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleVegetableException(VegetableException ex) {
        ErrorResponse response = new ErrorResponse(
                ex.getHttpStatus().value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        log.error("Vegetable error occurred: {}", response);
        return new ResponseEntity<>(response, ex.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse response = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        log.error("An unexpected error occurred: {}", response);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
