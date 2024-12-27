package com.workintech.s18d2.exceptions;

import java.time.LocalDateTime;

public record FruitErrorResponse(Integer status, String message, LocalDateTime localDate) {

}
