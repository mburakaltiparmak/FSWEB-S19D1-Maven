package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {
    List<Fruit> sortByPriceDesc();
    List<Fruit> sortByPriceAsc();
    Fruit findById(Long id);
    Fruit save(Fruit fruit);
    Fruit delete(Long id);
    List<Fruit> findByParam(String param);


}
