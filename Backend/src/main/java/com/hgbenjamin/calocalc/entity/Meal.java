package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author Haivan Benjamin
 */
@Entity
@Table(name = "meal")
public class Meal 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mealId;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private List<MealFood> mealFoods;
    
    // Something like Breakfast, Lunch, Dinner, Meal 4, Meal 5, etc.
    private String mealType;
    private double totalCalories;
    private LocalDate date;
    
    public Meal()
    {
        
    }
    
    // Getters and Setters
}
