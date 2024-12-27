package com.workintech.s18d2.exceptions;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public record VegetableErrorResponse(Integer status, String message, LocalDateTime localDate) {
}
