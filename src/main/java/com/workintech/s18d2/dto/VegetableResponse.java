package com.workintech.s18d2.dto;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public record VegetableResponse(String message, List<Vegetable> vegetableList) {
}
