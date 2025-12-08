package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

/**
 *
 * @author Haivan Benjamin
 */
@Entity
@Table(name = "meal_food")
public class MealFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mealFoodId;

    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "food_id", nullable = false)
    private Food food;
    
    private LocalTime mealTime;
    private Double quantity; // servings eaten

    public MealFood()
    {
        
    }
    
    // Getters and Setters
}

