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
public class FoodTest
{
    
    public FoodTest()
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
     * Test of getFoodId method, of class Food.
     */
    @Test
    public void testGetFoodId()
    {
        System.out.println("getFoodId");
        Food instance = new Food();
        Long expResult = null;
        Long result = instance.getFoodId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodId method, of class Food.
     */
    @Test
    public void testSetFoodId()
    {
        System.out.println("setFoodId");
        Long foodId = null;
        Food instance = new Food();
        instance.setFoodId(foodId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Food.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Food instance = new Food();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Food.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        String name = "";
        Food instance = new Food();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalories method, of class Food.
     */
    @Test
    public void testGetCalories()
    {
        System.out.println("getCalories");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getCalories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalories method, of class Food.
     */
    @Test
    public void testSetCalories()
    {
        System.out.println("setCalories");
        Double calories = null;
        Food instance = new Food();
        instance.setCalories(calories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealFoods method, of class Food.
     */
    @Test
    public void testGetMealFoods()
    {
        System.out.println("getMealFoods");
        Food instance = new Food();
        List<MealFood> expResult = null;
        List<MealFood> result = instance.getMealFoods();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealFoods method, of class Food.
     */
    @Test
    public void testSetMealFoods()
    {
        System.out.println("setMealFoods");
        List<MealFood> mealFoods = null;
        Food instance = new Food();
        instance.setMealFoods(mealFoods);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrand method, of class Food.
     */
    @Test
    public void testGetBrand()
    {
        System.out.println("getBrand");
        Food instance = new Food();
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrand method, of class Food.
     */
    @Test
    public void testSetBrand()
    {
        System.out.println("setBrand");
        String brand = "";
        Food instance = new Food();
        instance.setBrand(brand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServingSize method, of class Food.
     */
    @Test
    public void testGetServingSize()
    {
        System.out.println("getServingSize");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getServingSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServingSize method, of class Food.
     */
    @Test
    public void testSetServingSize()
    {
        System.out.println("setServingSize");
        Double servingSize = null;
        Food instance = new Food();
        instance.setServingSize(servingSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServingUnits method, of class Food.
     */
    @Test
    public void testGetServingUnits()
    {
        System.out.println("getServingUnits");
        Food instance = new Food();
        String expResult = "";
        String result = instance.getServingUnits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServingUnits method, of class Food.
     */
    @Test
    public void testSetServingUnits()
    {
        System.out.println("setServingUnits");
        String servingUnits = "";
        Food instance = new Food();
        instance.setServingUnits(servingUnits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProtein method, of class Food.
     */
    @Test
    public void testGetProtein()
    {
        System.out.println("getProtein");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getProtein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProtein method, of class Food.
     */
    @Test
    public void testSetProtein()
    {
        System.out.println("setProtein");
        Double protein = null;
        Food instance = new Food();
        instance.setProtein(protein);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalFat method, of class Food.
     */
    @Test
    public void testGetTotalFat()
    {
        System.out.println("getTotalFat");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getTotalFat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalFat method, of class Food.
     */
    @Test
    public void testSetTotalFat()
    {
        System.out.println("setTotalFat");
        Double totalFat = null;
        Food instance = new Food();
        instance.setTotalFat(totalFat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCarbs method, of class Food.
     */
    @Test
    public void testGetTotalCarbs()
    {
        System.out.println("getTotalCarbs");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getTotalCarbs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalCarbs method, of class Food.
     */
    @Test
    public void testSetTotalCarbs()
    {
        System.out.println("setTotalCarbs");
        Double totalCarbs = null;
        Food instance = new Food();
        instance.setTotalCarbs(totalCarbs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalSugar method, of class Food.
     */
    @Test
    public void testGetTotalSugar()
    {
        System.out.println("getTotalSugar");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getTotalSugar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalSugar method, of class Food.
     */
    @Test
    public void testSetTotalSugar()
    {
        System.out.println("setTotalSugar");
        Double totalSugar = null;
        Food instance = new Food();
        instance.setTotalSugar(totalSugar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSodium method, of class Food.
     */
    @Test
    public void testGetSodium()
    {
        System.out.println("getSodium");
        Food instance = new Food();
        Double expResult = null;
        Double result = instance.getSodium();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSodium method, of class Food.
     */
    @Test
    public void testSetSodium()
    {
        System.out.println("setSodium");
        Double sodium = null;
        Food instance = new Food();
        instance.setSodium(sodium);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsUserMade method, of class Food.
     */
    @Test
    public void testIsIsUserMade()
    {
        System.out.println("isIsUserMade");
        Food instance = new Food();
        boolean expResult = false;
        boolean result = instance.isIsUserMade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsUserMade method, of class Food.
     */
    @Test
    public void testSetIsUserMade()
    {
        System.out.println("setIsUserMade");
        boolean isUserMade = false;
        Food instance = new Food();
        instance.setIsUserMade(isUserMade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdated method, of class Food.
     */
    @Test
    public void testGetLastUpdated()
    {
        System.out.println("getLastUpdated");
        Food instance = new Food();
        LocalDate expResult = null;
        LocalDate result = instance.getLastUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdated method, of class Food.
     */
    @Test
    public void testSetLastUpdated()
    {
        System.out.println("setLastUpdated");
        LocalDate lastUpdated = null;
        Food instance = new Food();
        instance.setLastUpdated(lastUpdated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
