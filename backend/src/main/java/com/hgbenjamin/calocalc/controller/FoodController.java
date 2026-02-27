package com.hgbenjamin.calocalc.controller;

import com.hgbenjamin.calocalc.entity.Food;
import com.hgbenjamin.calocalc.service.FoodService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is responsible for handling HTTP(S) requests for the Food entity.
 * 
 * @author haivanbenjamin
 */
@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return null;//foodService.save(food);
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return null;//foodService.findAll();
    }

    @GetMapping("/{id}")
    public Food getFood(@PathVariable Long id) {
        return null;//foodService.findById(id);
    }

    @PutMapping("/{id}")
    public Food updateFood(@PathVariable Long id, @RequestBody Food food) {
        return null;//foodService.update(id, food);
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        //foodService.delete(id);
    }
}

