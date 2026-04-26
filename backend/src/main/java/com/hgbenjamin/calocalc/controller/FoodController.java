package com.hgbenjamin.calocalc.controller;

import com.hgbenjamin.calocalc.entity.Food;
import com.hgbenjamin.calocalc.service.FoodService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is responsible for handling HTTP(S) requests for the Food entity.
 *
 * @author Haivan Benjamin
 */
@RestController
@RequestMapping("/api/foods")
public class FoodController
{
    private final FoodService foodService;

    public FoodController(FoodService foodService)
    {
        this.foodService = foodService;
    }

    @GetMapping("/")
    public List<Food> listFoods()
    {
        return foodService.listFoods();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String query)
    {
        return ResponseEntity.ok(foodService.findAllByName(query));
    }
}
