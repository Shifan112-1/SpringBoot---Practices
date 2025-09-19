package com.SecondTime.secondcode.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("Type of coach: "+ this.getClass().getSimpleName());
    }
    public String getDailyWorkout() {
        return "Throw a pitch 20 times";
    }
}
