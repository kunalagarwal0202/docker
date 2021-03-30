package com.aws.awsDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDockerApplication {
	
	@GetMapping("/test")
	public String getService() {
		return "Docker service called...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsDockerApplication.class, args);
	}

}
