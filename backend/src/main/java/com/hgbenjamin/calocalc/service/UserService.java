/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.service;

import com.hgbenjamin.calocalc.dto.UserDTO;
import com.hgbenjamin.calocalc.entity.User;
import com.hgbenjamin.calocalc.repository.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author haivanbenjamin
 */
@Service
public class UserService
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    // Convert User entity → DTO
    public UserDTO toDTO(User user)
    {
        return new UserDTO(user.getUserName(), user.getUserEmail());
    }

    // Register new user (MVP: no password hashing yet)
    public UserDTO registerUser(UserDTO dto)
    {
        User user = new User(dto.getName(), dto.getEmail(), dto.getPassword());
        userRepository.save(user);
        return toDTO(user);
    }

    // Get user by ID
    public UserDTO getUser(Long id)
    {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return toDTO(user);
    }

    // List all users (optional)
    public List<UserDTO> getAllUsers()
    {
        return userRepository.findAll().stream().map(this::toDTO).toList();
    }
}
