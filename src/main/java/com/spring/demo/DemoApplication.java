package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to Book app";
	}
	@GetMapping("/enjoy")
	public String greeting() {
		return "Have a great time by reading books";
	}
	@GetMapping("/experience")
	public String hello() {
		return "How was your experience?";
	}

}
