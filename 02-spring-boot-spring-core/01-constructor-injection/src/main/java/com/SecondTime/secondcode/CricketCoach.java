package com.SecondTime.secondcode;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public String getDailyWorkout() {
        return  "swinging my bat";
    }
}
