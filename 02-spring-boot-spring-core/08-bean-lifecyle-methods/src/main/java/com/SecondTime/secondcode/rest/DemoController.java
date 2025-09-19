package com.SecondTime.secondcode.rest;

import com.SecondTime.secondcode.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach){
        this.coach = coach;
        System.out.println("type of Controller: " + this.getClass().getSimpleName());
    }
    @GetMapping("/coached")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    }




