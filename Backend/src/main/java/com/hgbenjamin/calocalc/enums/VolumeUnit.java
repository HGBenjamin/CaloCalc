package com.hgbenjamin.calocalc.enums;

/**
 *
 * @author Haivan Benjamin
 */
public enum VolumeUnit 
{
    //Volume Units
    MILLILITER(1, "ml"), // Base Unit
    LITER(1000, "l"),
    TEASPOON(4.9289, "tsp"),
    TABLESPOON(14.7868, "tbsp"),
    CUPS(236.588, "cup");
    
    private final double toMilliliterRatio;
    private final String abbreviation;

    VolumeUnit(double toMilliliterRatio, String abbreviation)
    {
        this.toMilliliterRatio = toMilliliterRatio;
        this.abbreviation = abbreviation;
    }

    public double getToMilliliterRatio()
    {
        return toMilliliterRatio;
    }

    public String getAbbreviation()
    {
        return abbreviation;
    }
    
    /**
     * Converts a value from one unit to another.
     * Logic: (Value * SourceRatio) / TargetRatio
     * @param value the value of the current unit.
     * @param sourceUnit unit to convert from.
     * @param targetUnit unit to convert to.
     * @return the target unit.
     */
    public static double convert(double value, VolumeUnit sourceUnit, VolumeUnit targetUnit) 
    {
        if (sourceUnit == targetUnit) return value;
        
        // Step 1: Convert source to centimeters
        double inMillileters = value * sourceUnit.toMilliliterRatio;
        
        // Step 2: Convert centimeters to target unit
        return inMillileters / targetUnit.toMilliliterRatio;
    }
}
