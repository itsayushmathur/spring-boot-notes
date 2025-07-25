package com.itsayushmathur.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    inject properties for : coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "TeamInfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+coachName+"\n Team Name: "+teamName;
    }

    //expose '/' that return "Hello world!"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    //expose a new endpoint for 'workout'
     @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
     }

     //wxpose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "You are Lucky!";
    }

}
