/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hgbenjamin.calocalc.entity;

import com.hgbenjamin.calocalc.enums.ActivityLevel;
import com.hgbenjamin.calocalc.enums.Sex;
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
public class UserTest
{
    
    public UserTest()
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
     * Test of getUserId method, of class User.
     */
    @Test
    public void testGetUserId()
    {
        System.out.println("getUserId");
        User instance = new User();
        Long expResult = null;
        Long result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class User.
     */
    @Test
    public void testSetUserId()
    {
        System.out.println("setUserId");
        Long userId = null;
        User instance = new User();
        instance.setUserId(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class User.
     */
    @Test
    public void testGetUserEmail()
    {
        System.out.println("getUserEmail");
        User instance = new User();
        String expResult = "";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserEmail method, of class User.
     */
    @Test
    public void testSetUserEmail()
    {
        System.out.println("setUserEmail");
        String userEmail = "";
        User instance = new User();
        instance.setUserEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName()
    {
        System.out.println("getUserName");
        User instance = new User();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName()
    {
        System.out.println("setUserName");
        String userName = "";
        User instance = new User();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserPassword method, of class User.
     */
    @Test
    public void testGetUserPassword()
    {
        System.out.println("getUserPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getUserPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserPassword method, of class User.
     */
    @Test
    public void testSetUserPassword()
    {
        System.out.println("setUserPassword");
        String userPassword = "";
        User instance = new User();
        instance.setUserPassword(userPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeals method, of class User.
     */
    @Test
    public void testGetMeals()
    {
        System.out.println("getMeals");
        User instance = new User();
        List<Meal> expResult = null;
        List<Meal> result = instance.getMeals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeals method, of class User.
     */
    @Test
    public void testSetMeals()
    {
        System.out.println("setMeals");
        List<Meal> meals = null;
        User instance = new User();
        instance.setMeals(meals);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName()
    {
        System.out.println("getFirstName");
        User instance = new User();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName()
    {
        System.out.println("setFirstName");
        String firstName = "";
        User instance = new User();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiddleName method, of class User.
     */
    @Test
    public void testGetMiddleName()
    {
        System.out.println("getMiddleName");
        User instance = new User();
        String expResult = "";
        String result = instance.getMiddleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiddleName method, of class User.
     */
    @Test
    public void testSetMiddleName()
    {
        System.out.println("setMiddleName");
        String middleName = "";
        User instance = new User();
        instance.setMiddleName(middleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName()
    {
        System.out.println("getLastName");
        User instance = new User();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName()
    {
        System.out.println("setLastName");
        String lastName = "";
        User instance = new User();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class User.
     */
    @Test
    public void testGetAge()
    {
        System.out.println("getAge");
        User instance = new User();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class User.
     */
    @Test
    public void testSetAge()
    {
        System.out.println("setAge");
        int age = 0;
        User instance = new User();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class User.
     */
    @Test
    public void testGetHeight()
    {
        System.out.println("getHeight");
        User instance = new User();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class User.
     */
    @Test
    public void testSetHeight()
    {
        System.out.println("setHeight");
        double height = 0.0;
        User instance = new User();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class User.
     */
    @Test
    public void testGetWeight()
    {
        System.out.println("getWeight");
        User instance = new User();
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class User.
     */
    @Test
    public void testSetWeight()
    {
        System.out.println("setWeight");
        double weight = 0.0;
        User instance = new User();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSex method, of class User.
     */
    @Test
    public void testGetSex()
    {
        System.out.println("getSex");
        User instance = new User();
        Sex expResult = null;
        Sex result = instance.getSex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSex method, of class User.
     */
    @Test
    public void testSetSex()
    {
        System.out.println("setSex");
        Sex sex = null;
        User instance = new User();
        instance.setSex(sex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivityLevel method, of class User.
     */
    @Test
    public void testGetActivityLevel()
    {
        System.out.println("getActivityLevel");
        User instance = new User();
        Double expResult = null;
        Double result = instance.getActivityLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivityLevel method, of class User.
     */
    @Test
    public void testSetActivityLevel()
    {
        System.out.println("setActivityLevel");
        ActivityLevel activityLevel = null;
        User instance = new User();
        instance.setActivityLevel(activityLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyCalorieTarget method, of class User.
     */
    @Test
    public void testGetDailyCalorieTarget()
    {
        System.out.println("getDailyCalorieTarget");
        User instance = new User();
        Integer expResult = null;
        Integer result = instance.getDailyCalorieTarget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDailyCalorieTarget method, of class User.
     */
    @Test
    public void testSetDailyCalorieTarget()
    {
        System.out.println("setDailyCalorieTarget");
        Integer dailyCalorieTarget = null;
        User instance = new User();
        instance.setDailyCalorieTarget(dailyCalorieTarget);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeightLogs method, of class User.
     */
    @Test
    public void testGetWeightLogs()
    {
        System.out.println("getWeightLogs");
        User instance = new User();
        List<WeightLog> expResult = null;
        List<WeightLog> result = instance.getWeightLogs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
