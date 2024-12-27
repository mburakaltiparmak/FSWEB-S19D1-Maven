package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.exceptions.VegetableException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class VegetableServiceImpl implements VegetableService{
    private VegetableRepository vegetableRepository;
    @Override
    public List<Vegetable> sortByPriceDesc() {
        return vegetableRepository.sortByPriceDesc();
    }

    @Override
    public List<Vegetable> sortByPriceAsc() {
        return vegetableRepository.sortByPriceAsc();
    }

    @Override
    public Vegetable findById(Long id) {
        return vegetableRepository.findById(id).orElseThrow(()-> new VegetableException("This vegetable is not exist" + " " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public Vegetable delete(Long id) {
        Vegetable vegetable = findById(id);
        vegetableRepository.delete(vegetable);
        return vegetable;
    }

    @Override
    public List<Vegetable> findByParam(String param) {
        return vegetableRepository.findByParam(param);
    }
}
