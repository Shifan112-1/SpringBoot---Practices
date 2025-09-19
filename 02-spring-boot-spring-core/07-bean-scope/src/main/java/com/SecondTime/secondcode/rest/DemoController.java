package com.SecondTime.secondcode.rest;

import com.SecondTime.secondcode.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach othercoach;
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach coach,
                          @Qualifier("baseballCoach") Coach otehrcoach){
        this.coach = coach;
        this.othercoach = otehrcoach;
        System.out.println("type of Controller: " + this.getClass().getSimpleName());
    }
    @GetMapping("/coached")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check_scope")
    public String checkScope() {
        return "coach == othercoach, " + (coach == othercoach);
    }

}


