package com.spring.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//inject properties for : coach.name and team.name
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	//expose new endpoint for team.name and coach.name
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach:"+coachName+","+"Team Name:"+teamName;
	}
	
	//expose "/" that return "hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the Server -"+LocalDateTime.now();
	}

	//expose a new endpoint 
	@GetMapping("/sample")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}
}
