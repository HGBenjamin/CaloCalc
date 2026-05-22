/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.controller;

import com.hgbenjamin.calocalc.dto.CreateUserRequestDTO;
import com.hgbenjamin.calocalc.dto.UserResponseDTO;
import com.hgbenjamin.calocalc.entity.User;
import com.hgbenjamin.calocalc.service.UserService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author haivanbenjamin
 */
@RestController
@RequestMapping("/api/users")
public class UserController
{//https://calocalc.hgbenjamin.com/api/users/5
    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@RequestBody CreateUserRequestDTO dto)
    {
        return ResponseEntity.ok(userService.registerUser(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable Long id)
    {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserResponseDTO>> listUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    
    @GetMapping("/allUsersNoDTO")
    public ResponseEntity<List<User>> listUsersNonDTO()
    {
        return ResponseEntity.ok(userService.getAllUsersNonDTO());
    }
}
