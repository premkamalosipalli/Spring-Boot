package com.spring.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//expose "/" that return "hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the Server -"+LocalDateTime.now();
	}

}
