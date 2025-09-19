package com.SecondTime.secondcode.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public String getDailyWorkout() {return "Practice running 400 meter sprints";
    }
}
