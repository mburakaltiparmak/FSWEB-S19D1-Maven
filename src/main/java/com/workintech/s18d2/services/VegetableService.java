package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> sortByPriceDesc();
    List<Vegetable> sortByPriceAsc();
    Vegetable findById(Long id);
    Vegetable save(Vegetable vegetable);
    Vegetable delete(Long id);
    List<Vegetable> findByParam(String param);
}
