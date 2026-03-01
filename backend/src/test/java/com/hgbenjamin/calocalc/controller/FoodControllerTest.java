/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hgbenjamin.calocalc.controller;

import com.hgbenjamin.calocalc.entity.Food;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author haivanbenjamin
 */
public class FoodControllerTest
{
    
    public FoodControllerTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of createFood method, of class FoodController.
     */
    @Test
    public void testCreateFood()
    {
        System.out.println("createFood");
        Food food = null;
        FoodController instance = null;
        Food expResult = null;
        Food result = instance.createFood(food);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFoods method, of class FoodController.
     */
    @Test
    public void testGetAllFoods()
    {
        System.out.println("getAllFoods");
        FoodController instance = null;
        List<Food> expResult = null;
        List<Food> result = instance.getAllFoods();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFood method, of class FoodController.
     */
    @Test
    public void testGetFood()
    {
        System.out.println("getFood");
        Long id = null;
        FoodController instance = null;
        Food expResult = null;
        Food result = instance.getFood(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFood method, of class FoodController.
     */
    @Test
    public void testUpdateFood()
    {
        System.out.println("updateFood");
        Long id = null;
        Food food = null;
        FoodController instance = null;
        Food expResult = null;
        Food result = instance.updateFood(id, food);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFood method, of class FoodController.
     */
    @Test
    public void testDeleteFood()
    {
        System.out.println("deleteFood");
        Long id = null;
        FoodController instance = null;
        instance.deleteFood(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
