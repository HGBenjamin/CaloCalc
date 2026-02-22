package com.hgbenjamin.calocalc.enums;

/**
 * Represents 
 * 
 * @author Haivan Benjamin
 */
public enum BodyWeightUnit 
{
    POUND(1.0, "lb"),
    KILOGRAM(0.45359237, "kg");

    private final double toPoundRatio;
    private final String abbreviation;

    BodyWeightUnit(double toPoundRatio, String abbreviation) 
    {
        this.toPoundRatio = toPoundRatio;
        this.abbreviation = abbreviation;
    }

    public double convert(double value, BodyWeightUnit targetUnit) 
    {
        // Convert input to pounds first, then to the target unit
        double valueInPounds = value / this.toPoundRatio;
        return valueInPounds * targetUnit.toPoundRatio;
    }

    public String getAbbreviation() 
    {
        return abbreviation;
    }
}

