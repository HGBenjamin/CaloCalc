package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 * Represents a database mapping of the user table.
 * 
 * @author Haivan Benjamin
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
    private String userPassword;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Meal> meals;
    
    private String firstName;
    private String middleName;
    private String lastName;
    
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
}
