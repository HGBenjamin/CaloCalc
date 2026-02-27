package com.hgbenjamin.calocalc.entity;

import com.hgbenjamin.calocalc.enums.ActivityLevel;
import com.hgbenjamin.calocalc.enums.Sex;
import jakarta.persistence.*;
import java.util.List;

/**
 * Represents a user record stored in the database.
 *
 * This entity maps to the "app_user" table and contains
 * authentication and account metadata fields.
 *
 * Note:
 * - Password is stored as a hash.
 * - Role determines authorization level.
 */
@Entity
@Table(name = "app_user")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true)
    private String userEmail;
    
    @Column(nullable = false, unique = true)
    private String userName;
    
    @Column(nullable = false)
    private String userPassword;// This value should be hashed
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Meal> meals;
    
    private String firstName;
    private String middleName;
    private String lastName;
    
    private int age;
    private double height;
    private double weight;
    
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Enumerated(EnumType.STRING)
    private ActivityLevel activityLevel;

    private Integer dailyCalorieTarget;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WeightLog> weightLogs;
    
    public User()
    {
        
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }

    public List<Meal> getMeals()
    {
        return meals;
    }

    public void setMeals(List<Meal> meals)
    {
        this.meals = meals;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public Sex getSex()
    {
        return sex;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    public Double getActivityLevel()
    {
        return activityLevel.getActivityMultiplier();
    }

    public void setActivityLevel(ActivityLevel activityLevel)
    {
        this.activityLevel = activityLevel;
    }

    public Integer getDailyCalorieTarget()
    {
        return dailyCalorieTarget;
    }

    public void setDailyCalorieTarget(Integer dailyCalorieTarget)
    {
        this.dailyCalorieTarget = dailyCalorieTarget;
    }

    public List<WeightLog> getWeightLogs()
    {
        return weightLogs;
    }    
}
