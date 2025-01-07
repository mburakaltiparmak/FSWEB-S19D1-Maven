package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    @GetMapping
    public List<Fruit> getByPriceAsc() {
        return fruitService.getByPriceAsc();
         }

    @GetMapping("/desc")
    public List<Fruit> getByPriceDesc() {
    return fruitService.getByPriceDesc();
    }

    @GetMapping("/{id}")
    public Fruit getById(@PathVariable("id") Long id) {
    return fruitService.getById(id);
    }

    @PostMapping
    public Fruit save(@RequestBody Fruit fruit) {
    return fruitService.save(fruit);
    }

    @GetMapping("/name/{name}")
    public List<Fruit> searchByName(@PathVariable("name") String name) {
        return fruitService.searchByName(name);
    }


    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable("id") Long id) {
    return fruitService.delete(id);
    }
}
