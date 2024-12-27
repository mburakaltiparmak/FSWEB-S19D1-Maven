package com.workintech.s18d2.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
public class VegetableException extends RuntimeException{
private final HttpStatus httpStatus;

    public VegetableException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
