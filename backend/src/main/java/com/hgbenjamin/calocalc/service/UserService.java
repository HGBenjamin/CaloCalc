/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.service;

import com.hgbenjamin.calocalc.dto.CreateUserRequestDTO;
import com.hgbenjamin.calocalc.dto.UserResponseDTO;
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
    public UserResponseDTO toDTO(User user)
    {
        return new UserResponseDTO(user.getEmail(), user.getUsername(), user.getFirstName(), user.getMiddleName(), user.getLastName(), user.getAge(), user.getHeight(), user.getHeight());
    }

    // Register new user (MVP: no password hashing yet)
    public UserResponseDTO registerUser(CreateUserRequestDTO createUserRequestDTO)
    {
        User user = new User(createUserRequestDTO.getEmail(), createUserRequestDTO.getUsername(), createUserRequestDTO.getPassword(), createUserRequestDTO.getFirstName(), createUserRequestDTO.getMiddleName(), createUserRequestDTO.getLastName(), createUserRequestDTO.getAge(), createUserRequestDTO.getHeight(), createUserRequestDTO.getHeight());
        userRepository.save(user);
        return toDTO(user);
    }

    // Get user by ID
    public UserResponseDTO getUser(Long id)
    {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return toDTO(user);
    }

    // List all users (optional)
    public List<UserResponseDTO> getAllUsers()
    {
        return userRepository.findAll().stream().map(this::toDTO).toList();
    }

    public List<User> getAllUsersNonDTO()
    {
        return userRepository.findAll();
    }
}
