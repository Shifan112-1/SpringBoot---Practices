package com.SecondTime.secondcode.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("Type of coach: "+ this.getClass().getSimpleName());
    }
    public String getDailyWorkout() {
        return "Throw a pitch 20 times";
    }
}
