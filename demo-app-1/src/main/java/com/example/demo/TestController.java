package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
// test cmt
	@GetMapping(value = "/get")
	public String getTestData() {
		exit();
		// return "Hello from Spring Boot";
	}
}



