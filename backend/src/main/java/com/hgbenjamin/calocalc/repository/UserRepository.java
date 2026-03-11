/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.repository;

import com.hgbenjamin.calocalc.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This class handles CRUD operations for the User entity.
 *
 * @author haivanbenjamin
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    Optional<User> findByUserEmail(String email);

    Optional<User> findByUserName(String name);
}
