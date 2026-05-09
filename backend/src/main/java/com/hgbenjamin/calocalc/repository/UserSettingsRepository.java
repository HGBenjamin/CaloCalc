/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.repository;

import com.hgbenjamin.calocalc.entity.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class handles CRUD operations for the UserSettings entity.
 * 
 * @author haivanbenjamin
 */
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long>
{
    
}
