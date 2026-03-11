/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hgbenjamin.calocalc.controller;

import com.hgbenjamin.calocalc.dto.UserDTO;
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
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO dto)
    {
        return ResponseEntity.ok(userService.registerUser(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id)
    {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> listUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
