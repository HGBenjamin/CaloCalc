package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;

/**
 * Represents a user record stored in the database.
 *
 * This entity maps to the "app_user" table and contains authentication and account metadata fields.
 *
 * Note: - Password is stored as a hash. - Role determines authorization level.
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

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;// This value should be hashed

    @Column(nullable = false)
    private String firstName;
    
    private String middleName;
    
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;
    
    @Column(nullable = false)
    private double height;
    
    @Column(nullable = false)
    private double weight;
    
    public User()
    {
        
    }
    
    public User(String email, String username, String password, String firstName, String middleName, String lastName, int age, double height, double weight)
    {
        this.email = email;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String userEmail)
    {
        this.email = userEmail;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String userPassword)
    {
        this.password = userPassword;
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
}
