package com.hgbenjamin.calocalc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
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
