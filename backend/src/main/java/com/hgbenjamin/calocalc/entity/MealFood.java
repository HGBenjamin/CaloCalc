package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

/**
 * Represents a meal_food record stored in the database.
 *
 * This entity maps to the "meal_food" table.
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
    private Double mealCalories;// maybe calculate on the fly?

    public MealFood()
    {
        
    }

    public Long getMealFoodId()
    {
        return mealFoodId;
    }

    public void setMealFoodId(Long mealFoodId)
    {
        this.mealFoodId = mealFoodId;
    }

    public Meal getMeal()
    {
        return meal;
    }

    public void setMeal(Meal meal)
    {
        this.meal = meal;
    }

    public Food getFood()
    {
        return food;
    }

    public void setFood(Food food)
    {
        this.food = food;
    }

    public LocalTime getMealTime()
    {
        return mealTime;
    }

    public void setMealTime(LocalTime mealTime)
    {
        this.mealTime = mealTime;
    }

    public Double getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Double quantity)
    {
        this.quantity = quantity;
    }

    public Double getMealCalories()
    {
        return mealCalories;
    }

    public void setMealCalories(Double mealCalories)
    {
        this.mealCalories = mealCalories;
    }
}

