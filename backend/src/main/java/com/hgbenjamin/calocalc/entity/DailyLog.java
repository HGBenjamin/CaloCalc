/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a daily_log record stored in the database.
 *
 * This entity maps to the "daily_log" table.
 * 
 * @author Haivan Benjamin
 */
@Entity
@Table(name = "daily_log")
public class DailyLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dailyLogId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate date;

    @OneToMany(mappedBy = "dailyLog", cascade = CascadeType.ALL)
    private List<Meal> meals;

    private Double calorieGoal; // e.g., 2000
    
    // Logic method (not stored in DB)
    public Double getRemainingCalories() {
        Double consumed = meals.stream().mapToDouble(Meal::getTotalCalories).sum();
        
        return calorieGoal - consumed;
    }
}
