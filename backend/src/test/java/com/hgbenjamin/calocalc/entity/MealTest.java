/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hgbenjamin.calocalc.entity;

import java.time.LocalDate;
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
public class MealTest
{
    
    public MealTest()
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
     * Test of getMealId method, of class Meal.
     */
    @Test
    public void testGetMealId()
    {
        System.out.println("getMealId");
        Meal instance = new Meal();
        Long expResult = null;
        Long result = instance.getMealId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealId method, of class Meal.
     */
    @Test
    public void testSetMealId()
    {
        System.out.println("setMealId");
        Long mealId = null;
        Meal instance = new Meal();
        instance.setMealId(mealId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Meal.
     */
    @Test
    public void testGetUser()
    {
        System.out.println("getUser");
        Meal instance = new Meal();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Meal.
     */
    @Test
    public void testSetUser()
    {
        System.out.println("setUser");
        User user = null;
        Meal instance = new Meal();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealFoods method, of class Meal.
     */
    @Test
    public void testGetMealFoods()
    {
        System.out.println("getMealFoods");
        Meal instance = new Meal();
        List<MealFood> expResult = null;
        List<MealFood> result = instance.getMealFoods();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealFoods method, of class Meal.
     */
    @Test
    public void testSetMealFoods()
    {
        System.out.println("setMealFoods");
        List<MealFood> mealFoods = null;
        Meal instance = new Meal();
        instance.setMealFoods(mealFoods);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealType method, of class Meal.
     */
    @Test
    public void testGetMealType()
    {
        System.out.println("getMealType");
        Meal instance = new Meal();
        String expResult = "";
        String result = instance.getMealType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealType method, of class Meal.
     */
    @Test
    public void testSetMealType()
    {
        System.out.println("setMealType");
        String mealType = "";
        Meal instance = new Meal();
        instance.setMealType(mealType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealName method, of class Meal.
     */
    @Test
    public void testGetMealName()
    {
        System.out.println("getMealName");
        Meal instance = new Meal();
        String expResult = "";
        String result = instance.getMealName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealName method, of class Meal.
     */
    @Test
    public void testSetMealName()
    {
        System.out.println("setMealName");
        String mealName = "";
        Meal instance = new Meal();
        instance.setMealName(mealName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCalories method, of class Meal.
     */
    @Test
    public void testGetTotalCalories()
    {
        System.out.println("getTotalCalories");
        Meal instance = new Meal();
        Double expResult = null;
        Double result = instance.getTotalCalories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalCalories method, of class Meal.
     */
    @Test
    public void testSetTotalCalories()
    {
        System.out.println("setTotalCalories");
        Double totalCalories = null;
        Meal instance = new Meal();
        instance.setTotalCalories(totalCalories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Meal.
     */
    @Test
    public void testGetDate()
    {
        System.out.println("getDate");
        Meal instance = new Meal();
        LocalDate expResult = null;
        LocalDate result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Meal.
     */
    @Test
    public void testSetDate()
    {
        System.out.println("setDate");
        LocalDate date = null;
        Meal instance = new Meal();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
