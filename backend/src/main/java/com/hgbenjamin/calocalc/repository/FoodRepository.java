/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.repository;

import com.hgbenjamin.calocalc.entity.Food;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class handles CRUD operations for the Food entity.
 * 
 * @author haivanbenjamin
 */
public interface FoodRepository extends JpaRepository<Food, Long>
{
    public List<Food> findByNameContainingIgnoreCase(String name);
    
}
