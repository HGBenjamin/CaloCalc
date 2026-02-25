package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Haivan Benjamin
 */
@Entity
public class UserSettings 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userSettingsId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    private Integer calorieGoal;
    private Double proteinGoal;
    private Double carbGoal;
    private Double fatGoal;
    
    private Boolean darkMode;
}
