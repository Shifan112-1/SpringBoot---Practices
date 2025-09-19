package com.SecondTime.secondcode.config;

import com.SecondTime.secondcode.common.Coach;
import com.SecondTime.secondcode.common.SwimCoach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean("water")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
