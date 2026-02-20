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
}
