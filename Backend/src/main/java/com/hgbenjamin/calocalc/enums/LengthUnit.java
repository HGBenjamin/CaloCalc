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
    
    /**
     * Converts a value from one unit to another.
     * Logic: (Value * SourceRatio) / TargetRatio
     * @param value the value of the current unit.
     * @param sourceUnit unit to convert from.
     * @param targetUnit unit to convert to.
     * @return the target unit.
     */
    public static double convert(double value, LengthUnit sourceUnit, LengthUnit targetUnit) 
    {
        if (sourceUnit == targetUnit) return value;
        
        // Step 1: Convert source to centimeters
        double inCentimeters = value * sourceUnit.toCentimeterRatio;
        
        // Step 2: Convert centimeters to target unit
        return inCentimeters / targetUnit.toCentimeterRatio;
    }
}
