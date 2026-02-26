package com.hgbenjamin.calocalc.enums;

/**
 * Contains 
 *
 * @author Haivan Benjamin
 */
public enum ActivityLevel 
{
    SEDINTARY(1.2),
    LIGHT(1.375),
    MODERATE(1.55),
    VERY(1.725),
    EXTREMELY(1.9);
    
    private final double activityMultiplier;
    
    ActivityLevel(double activityMultiplier)
    {
        this.activityMultiplier = activityMultiplier;
    }

    public double getActivityMultiplier()
    {
        return activityMultiplier;
    }
}
