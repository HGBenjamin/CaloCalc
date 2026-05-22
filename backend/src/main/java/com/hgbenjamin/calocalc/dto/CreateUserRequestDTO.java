package com.hgbenjamin.calocalc.dto;

/**
 * This class represents user registration data.
 *
 * @author Haivan Benjamin
 */
public class CreateUserRequestDTO
{
    private String email;
    private String username;
    private String password;// This will be hashed

    private String firstName;
    private String middleName;// Optional
    private String lastName;

    private int age;
    private double height;
    private double weight;

    public CreateUserRequestDTO(String email, String username, String password, String firstName, String middleName, String lastName, int age, double height, double weight)
    {
        this.email = email;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String userEmail)
    {
        this.email = userEmail;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String userPassword)
    {
        this.password = userPassword;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
