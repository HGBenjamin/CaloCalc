package com.hgbenjamin.calocalc.enums;

/**
 *
 * @author Haivan Benjamin
 */
public enum LengthUnit 
{
    //Length Units
    INCH(2.54, "in"),
    FEET(30.48, "ft"),
    CENTIMETER(1, "cm"),// Base Unit
    METER(100, "m");
    
    private final double toCentimeterRatio;
    private final String abbreviation;
    
    
    LengthUnit(double toCentimeterRatio, String abbreviation)
    {
        this.toCentimeterRatio = toCentimeterRatio;
        this.abbreviation = abbreviation;
    }
}
