package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
// test cmt added
	@GetMapping(value = "/get")
	public String getTestData() {
	
		return "Hello from Spring Boot";
	}
}



