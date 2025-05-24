package com.example.demo.controller;
import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/Greeting")
public class GreetingController {
	//UC1
	@Autowired
	private GreetingService greetingService;
	@GetMapping("/hello")
	public Greeting getSimpleGreeting() {
	    return greetingService.getSimpleGreeting();
	}
	
}
