package com.SecondTime.secondcode.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("Type of coach: " + this.getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Swimm 100m for warm up";
    }
}
