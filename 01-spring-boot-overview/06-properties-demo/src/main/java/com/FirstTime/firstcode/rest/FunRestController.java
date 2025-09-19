package com.FirstTime.firstcode.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //injecting properties into variables
    @Value("${team.name}")
    private String teamName;

    @Value("${Shifan.name}")
    private String shifanName;


@GetMapping("/showproperty")
public String  showProperty(){
    return "Team Name: "+teamName+"\nShifan Name: "+shifanName;
}

@GetMapping("/")
public String sayHello() {
    return "Hello World";
}

@GetMapping("/showmore")
public  String workmore(){
    return "lets get more hellos";
}





}





