package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 * Represents a database mapping of the user table.
 * 
 * @author Haivan Benjamin
 */
@Entity
@Table(name = "user")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true)
    private String email;
    
    @Column(nullable = false, unique = true)
    private String userName;
    
    @Column(nullable = false)
    private String password;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Meal> meals;
    
    private String firstName;
    private String middleName;
    private String lastName;
    
    public User()
    {
        
    }
    
    // Getters and Setters
}
