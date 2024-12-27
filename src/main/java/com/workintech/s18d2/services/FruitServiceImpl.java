package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.exceptions.FruitException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service

public class FruitServiceImpl implements FruitService{
    private FruitRepository fruitRepository;
    @Override
    public List<Fruit> sortByPriceDesc() {
        return fruitRepository.sortByPriceDesc();
    }

    @Override
    public List<Fruit> sortByPriceAsc() {
        return fruitRepository.sortByPriceAsc();
    }

    @Override
    public Fruit findById(Long id) {
    return fruitRepository.findById(id).orElseThrow(()-> new FruitException("This fruit is not exist" + " " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit delete(Long id) {
       Fruit fruit = findById(id);
       fruitRepository.delete(fruit);
       return fruit;
    }

    @Override
    public List<Fruit> findByParam(String param) {
        return fruitRepository.findByParam(param);
    }
}
