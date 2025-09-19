package com.SecondTime.secondcode.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("Type of coach: "+ this.getClass().getSimpleName());
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Coach preDestroy");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Coach postConstruct");
    }

    public String getDailyWorkout() {
        return  "swinging my bat";
    }
}
