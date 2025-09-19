package com.SecondTime.secondcode.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println("Type of coach: "+ this.getClass().getSimpleName());
    }
    public String getDailyWorkout() {return "Practice running 400 meter sprints";
    }
}
