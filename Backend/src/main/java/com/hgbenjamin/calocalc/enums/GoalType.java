package com.hgbenjamin.calocalc.enums;

/**
 *
 * @author Haivan Benjamin
 */
public enum GoalType 
{
    LOSE_TWO_POUNDS(-1000),
    LOSE_POUND_AND_HALF(-750),
    LOSE_POUND(-500),
    LOSE_HALF_POUND(-250),
    MAINTAIN_WEIGHT(0),
    GAIN_HALF_POUND(250),
    GAIN_POUND(500),
    GAIN_POUND_AND_HALF(750),
    GAIN_TWO_POUNDS(1000);
    
    private final double changeInIntake;
    
    GoalType(double changeInIntake)
    {
        this.changeInIntake = changeInIntake;
    }

    public double getChangeInIntake()
    {
        return changeInIntake;
    }
}
