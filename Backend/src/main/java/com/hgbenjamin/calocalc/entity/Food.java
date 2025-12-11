package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
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
    private Double calories;
    
    @OneToMany(mappedBy = "food")
    private List<MealFood> mealFoods;
    
    
    private String brand;
    
    private Double servingSize;
    private String servingUnits;
    
    private Double protein;
    
    //Fats
    private Double totalFat;
    //private Double saturatedFat;
    //private Double transFat;
    //private Double polyunsaturatedFat;
    //private Double monounsaturatedFat;
    
    //Carbs
    private Double totalCarbs;
    //private Double dietaryFiber;
    private Double totalSugar;
    //private Double addedSugar;
    //private Double sugarAlcohols;
    
    //Minerals
    //private Double calcium;
    //private Double iron; // for future update
    private Double sodium;
    
    //Vitimans For future updates :(
    //private Double potassium;
    //private Double vitaminA;
    //private Double B1; // (thiamine)
    //private Double B2; // (riboflavin)
    //private Double B3; // (niacin)
    //private Double B5; // (pantothenic acid)
    //private Double B6;
    //private Double B7; // (biotin)
    //private Double B9; // (folate/folic acid)
    //private Double B12;
    //private Double vitaminC;
    //private Double thiamine;
    
    //Others
    //private Double caffeine;
    
    private boolean isUserMade;
    private LocalDate lastUpdated;

    public Food()
    {
        
    }
    
    public Long getFoodId()
    {
        return foodId;
    }

    public void setFoodId(Long foodId)
    {
        this.foodId = foodId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getCalories()
    {
        return calories;
    }

    public void setCalories(Double calories)
    {
        this.calories = calories;
    }

    public List<MealFood> getMealFoods()
    {
        return mealFoods;
    }

    public void setMealFoods(List<MealFood> mealFoods)
    {
        this.mealFoods = mealFoods;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public Double getServingSize()
    {
        return servingSize;
    }

    public void setServingSize(Double servingSize)
    {
        this.servingSize = servingSize;
    }

    public String getServingUnits()
    {
        return servingUnits;
    }

    public void setServingUnits(String servingUnits)
    {
        this.servingUnits = servingUnits;
    }

    public Double getProtein()
    {
        return protein;
    }

    public void setProtein(Double protein)
    {
        this.protein = protein;
    }

    public Double getTotalFat()
    {
        return totalFat;
    }

    public void setTotalFat(Double totalFat)
    {
        this.totalFat = totalFat;
    }

    public Double getTotalCarbs()
    {
        return totalCarbs;
    }

    public void setTotalCarbs(Double totalCarbs)
    {
        this.totalCarbs = totalCarbs;
    }

    public Double getTotalSugar()
    {
        return totalSugar;
    }

    public void setTotalSugar(Double totalSugar)
    {
        this.totalSugar = totalSugar;
    }

    public Double getSodium()
    {
        return sodium;
    }

    public void setSodium(Double sodium)
    {
        this.sodium = sodium;
    }

    public boolean isIsUserMade()
    {
        return isUserMade;
    }

    public void setIsUserMade(boolean isUserMade)
    {
        this.isUserMade = isUserMade;
    }

    public LocalDate getLastUpdated()
    {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated)
    {
        this.lastUpdated = lastUpdated;
    }
}
