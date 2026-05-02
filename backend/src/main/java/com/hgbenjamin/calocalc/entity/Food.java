package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

/**
 * Represents a food record stored in the database.
 *
 * This entity maps to the "food" table.
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
    
    private String brand;
    
    private Double servingSize;
    private String servingUnits;
    
    private Double protein;
    
    //Fats
    private Double totalFat;
    
    //Carbs
    private Double totalCarbs;
    private Double dietaryFiber;
    private Double totalSugar;
    
    //Minerals
    private Double sodium;
    
    //Vitimans
    
    //Others, like caffiene
    
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

    public void setFetchedAt(Instant now)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
