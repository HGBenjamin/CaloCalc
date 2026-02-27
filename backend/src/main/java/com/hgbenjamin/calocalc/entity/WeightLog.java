package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Represents a WeightLog record stored in the database.
 *
 * This entity maps to the "user_settings" table.
 * @author Haivan Benjamin
 */
@Entity
public class WeightLog 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long weightLogId;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
