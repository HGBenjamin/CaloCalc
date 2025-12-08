package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Haivan Benjamin
 */
@Entity
@Table(name = "food")
public class Food 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private double calories;
    
    @OneToMany(mappedBy = "food")
    private List<MealFood> mealFoods;
    
    
    private String brand;
    
    private double servingSize;
    private String servingUnits;
    
    private double protein;
    
    //Fats
    private double totalFat;
    private double saturatedFat;
    private double transFat;
    private double polyunsaturatedFat;
    private double monosaturatedFat;
    
    //Carbs
    private double totalCarbs;
    private double dietaryFiber;
    private double sugar;
    private double addedSugar;
    private double sugarAlcohols;
    
    //Minerals
    private double calcium;
    private double iron;
    private double sodium;
    
    //Vitimans
    private double potassium;
    private double vitamanA;
    private double vitamanB;
    private double vitamanC;
    private double thiamin;
    
    //Others
    private double caffeine;

    public Food()
    {
        
    }
    
    // Getters and Setters
}
