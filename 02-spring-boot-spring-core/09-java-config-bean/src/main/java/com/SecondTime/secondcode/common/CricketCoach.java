package com.SecondTime.secondcode.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("Type of coach: "+ this.getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return  "swinging my bat";
    }
}
