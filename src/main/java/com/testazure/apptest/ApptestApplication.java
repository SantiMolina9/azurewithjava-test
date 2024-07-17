package com.testazure.apptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApptestApplication {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hola desde Azure!";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApptestApplication.class, args);
	}

}
