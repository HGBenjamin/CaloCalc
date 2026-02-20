/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hgbenjamin.calocalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author haivanbenjamin
 */
@RestController
@SpringBootApplication
public class CaloCalcApplication 
{
    @RequestMapping("/hello")
    String home() 
    {
        return "Hello World!";
    }
    
    @RequestMapping("/user")
    String user()
    {
        return "haivan";
    }

    public static void main(String[] args) 
    {
        SpringApplication.run(CaloCalcApplication.class, args);
    }
}
