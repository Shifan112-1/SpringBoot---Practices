package com.SecondTime.secondcode.common;

import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice a relay for 10 minutes";
    }
}
