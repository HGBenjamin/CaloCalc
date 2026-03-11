package com.hgbenjamin.calocalc.dto;

/**
 * This class handles data transfer between the back and and the front end for User entity.
 *
 * @author Haivan Benjamin
 */
public class UserDTO
{
    private String name;
    private String email;
    private String password;

    public UserDTO()
    {
    }

    public UserDTO(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public UserDTO(Long userId, String firstName, String userEmail)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
