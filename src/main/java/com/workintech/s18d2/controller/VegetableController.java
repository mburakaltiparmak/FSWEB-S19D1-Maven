package com.workintech.s18d2.controller;

import com.workintech.s18d2.dto.VegetableResponse;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vegetable")
public class VegetableController {
    private VegetableService vegetableService;
    @GetMapping("/desc")
    public VegetableResponse sortByPriceDesc(){
        VegetableResponse vegetableResponse = new VegetableResponse("Vegetables are sorted by price descending!",vegetableService.sortByPriceDesc());
        return vegetableResponse;
    }
    @GetMapping
    public VegetableResponse sortByPriceAsc(){
        VegetableResponse vegetableResponse = new VegetableResponse("Vegetables are sorted by price ascending!",vegetableService.sortByPriceAsc());
        return vegetableResponse;
    }
    @GetMapping("/{id}")
    public VegetableResponse findById(@PathVariable("id") Long id){
        VegetableResponse vegetableResponse = new VegetableResponse("Vegetable found by id!",List.of(vegetableService.findById(id)));
        return vegetableResponse;
    }
    @GetMapping("/{name}")
    public VegetableResponse findByParam(@PathVariable("name") String name){
        VegetableResponse vegetableResponse = new VegetableResponse(name + " " + "named vegetables are have been found!",vegetableService.findByParam(name));
        return vegetableResponse;
    }
    @PostMapping
    public VegetableResponse save(@RequestBody Vegetable vegetable){
    VegetableResponse vegetableResponse = new VegetableResponse(vegetable.getName() + " " + "named vegetable has been successfully saved!",List.of(vegetableService.save(vegetable)));
        return vegetableResponse;
    }
    @DeleteMapping("/{id}")
    public VegetableResponse delete(@PathVariable("id") Long id){
        VegetableResponse vegetableResponse = new VegetableResponse("Vegetable ID : " +  id + " " + "has been successfully deleted!",List.of(vegetableService.delete(id)));
        return vegetableResponse;
    }

}
