package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.FruitResponse;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/fruits")
public class FruitController {
    private final FruitService fruitService;
    @GetMapping
    public FruitResponse sortByPriceAsc(){
        FruitResponse fruitResponse = new FruitResponse("Fruits are sorted by price ascending!",fruitService.sortByPriceAsc());
        return fruitResponse;
    }
    @GetMapping("/desc")
    public FruitResponse sortByPriceDesc(){
        FruitResponse fruitResponse = new FruitResponse("Fruits are sorted by price descending!",fruitService.sortByPriceDesc());
        return fruitResponse;
    }
    @GetMapping("/{id}")
    public FruitResponse findById(@PathVariable("id")Long id){
        FruitResponse fruitResponse = new FruitResponse("Fruit found by id!",List.of(fruitService.findById(id)));
        return fruitResponse;
    }
    @PostMapping
    public FruitResponse save(@RequestBody Fruit fruit){
        FruitResponse fruitResponse = new FruitResponse(fruit.getName() + " " + " named fruit has been successfully saved!",List.of(fruitService.save(fruit)));
        return fruitResponse;
    }
    @GetMapping("/{name}")
    public FruitResponse findByParam(@PathVariable("name") String name){
        FruitResponse fruitResponse = new FruitResponse(name + " " + "named fruits are have been successfully found!",fruitService.findByParam(name));
        return fruitResponse;
    }
    @DeleteMapping("/{id}")
    public FruitResponse delete(@PathVariable("id") Long id){
        FruitResponse fruitResponse = new FruitResponse("Fruit ID : " + id + " " + "has been successfully deleted!",List.of(fruitService.delete(id)));
        return fruitResponse;
    }
}
