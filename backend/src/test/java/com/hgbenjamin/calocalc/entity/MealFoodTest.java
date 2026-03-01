/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hgbenjamin.calocalc.entity;

import java.time.LocalTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author haivanbenjamin
 */
public class MealFoodTest
{
    
    public MealFoodTest()
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
     * Test of getMealFoodId method, of class MealFood.
     */
    @Test
    public void testGetMealFoodId()
    {
        System.out.println("getMealFoodId");
        MealFood instance = new MealFood();
        Long expResult = null;
        Long result = instance.getMealFoodId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealFoodId method, of class MealFood.
     */
    @Test
    public void testSetMealFoodId()
    {
        System.out.println("setMealFoodId");
        Long mealFoodId = null;
        MealFood instance = new MealFood();
        instance.setMealFoodId(mealFoodId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeal method, of class MealFood.
     */
    @Test
    public void testGetMeal()
    {
        System.out.println("getMeal");
        MealFood instance = new MealFood();
        Meal expResult = null;
        Meal result = instance.getMeal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeal method, of class MealFood.
     */
    @Test
    public void testSetMeal()
    {
        System.out.println("setMeal");
        Meal meal = null;
        MealFood instance = new MealFood();
        instance.setMeal(meal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFood method, of class MealFood.
     */
    @Test
    public void testGetFood()
    {
        System.out.println("getFood");
        MealFood instance = new MealFood();
        Food expResult = null;
        Food result = instance.getFood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFood method, of class MealFood.
     */
    @Test
    public void testSetFood()
    {
        System.out.println("setFood");
        Food food = null;
        MealFood instance = new MealFood();
        instance.setFood(food);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealTime method, of class MealFood.
     */
    @Test
    public void testGetMealTime()
    {
        System.out.println("getMealTime");
        MealFood instance = new MealFood();
        LocalTime expResult = null;
        LocalTime result = instance.getMealTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealTime method, of class MealFood.
     */
    @Test
    public void testSetMealTime()
    {
        System.out.println("setMealTime");
        LocalTime mealTime = null;
        MealFood instance = new MealFood();
        instance.setMealTime(mealTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class MealFood.
     */
    @Test
    public void testGetQuantity()
    {
        System.out.println("getQuantity");
        MealFood instance = new MealFood();
        Double expResult = null;
        Double result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class MealFood.
     */
    @Test
    public void testSetQuantity()
    {
        System.out.println("setQuantity");
        Double quantity = null;
        MealFood instance = new MealFood();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealCalories method, of class MealFood.
     */
    @Test
    public void testGetMealCalories()
    {
        System.out.println("getMealCalories");
        MealFood instance = new MealFood();
        Double expResult = null;
        Double result = instance.getMealCalories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealCalories method, of class MealFood.
     */
    @Test
    public void testSetMealCalories()
    {
        System.out.println("setMealCalories");
        Double mealCalories = null;
        MealFood instance = new MealFood();
        instance.setMealCalories(mealCalories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
