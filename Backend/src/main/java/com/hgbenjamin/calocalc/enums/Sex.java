package com.hgbenjamin.calocalc.enums;

/**
 *
 * @author Haivan Benjamin
 */
public enum Sex 
{
    MALE("M", "Male"),
    FEMALE("F", "Female");
    
    private final String abbreviation;
    private final String displayLabel;
    
    Sex(String abbreviation, String displayLabel) 
    {
        this.abbreviation = abbreviation;
        this.displayLabel = displayLabel;
    }
}
