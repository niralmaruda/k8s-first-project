package com.k8sfirstproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sFirstProjectApplication {
	
	@GetMapping("/message")
	public String displayMessage() {
		return "Welcome to kubernetes demo project!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(K8sFirstProjectApplication.class, args);
	}

}
