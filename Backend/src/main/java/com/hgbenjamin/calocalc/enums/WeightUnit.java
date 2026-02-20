package com.hgbenjamin.calocalc.enums;

/**
 *
 * @author Haivan Benjamin
 */
public enum WeightUnit 
{
    //Weight Units
    GRAM(1, "g"), // Base Unit
    OUNCE(28.3495, "oz");
    
    private final double toGramRatio;
    private final String abbreviation;
    
    WeightUnit(double toGramRatio, String abbreviation)
    {
        this.toGramRatio = toGramRatio;
        this.abbreviation = abbreviation;
    }
}
