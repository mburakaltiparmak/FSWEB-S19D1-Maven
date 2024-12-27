package com.workintech.s18d2.dto;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;

public record FruitResponse(String message, List<Fruit> fruitList) {

}
