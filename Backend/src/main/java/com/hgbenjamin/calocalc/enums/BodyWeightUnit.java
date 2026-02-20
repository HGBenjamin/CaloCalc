package com.hgbenjamin.calocalc.enums;

/**
 *
 * @author Haivan Benjamin
 */
public enum BodyWeightUnit 
{
    POUND(1, "Lbs"),
    KILOGRAM(2.2046, "Kgs");
    
    private final double toPoundRatio;
    private final String abbreviation;
    
    BodyWeightUnit(double toPoundRatio, String abbreviation)
    {
        this.toPoundRatio = toPoundRatio;
        this.abbreviation = abbreviation;
    }
}
