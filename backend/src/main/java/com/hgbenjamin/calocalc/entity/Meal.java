package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;


/**
 * Represents a meal record stored in the database.
 *
 * This entity maps to the "meal" table.
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
    
    @ManyToOne
    @JoinColumn(name = "dailyLogId") // This creates the actual column in the DB
    private DailyLog dailyLog;
    
    private String mealType;//Replace with Enums eventually?
    private String mealName;//Automatically whatever the Enum is unless other is chosen or user chooses to rename meal.
    private Double totalCalories;//Maybe calculate it on the fly?
    private LocalDate date;
    
    public Meal()
    {
        
    }

    public Long getMealId()
    {
        return mealId;
    }

    public void setMealId(Long mealId)
    {
        this.mealId = mealId;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public List<MealFood> getMealFoods()
    {
        return mealFoods;
    }

    public void setMealFoods(List<MealFood> mealFoods)
    {
        this.mealFoods = mealFoods;
    }

    public String getMealType()
    {
        return mealType;
    }

    public void setMealType(String mealType)
    {
        this.mealType = mealType;
    }

    public String getMealName()
    {
        return mealName;
    }

    public void setMealName(String mealName)
    {
        this.mealName = mealName;
    }

    public Double getTotalCalories()
    {
        return totalCalories;
    }

    public void setTotalCalories(Double totalCalories)
    {
        this.totalCalories = totalCalories;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }
}
