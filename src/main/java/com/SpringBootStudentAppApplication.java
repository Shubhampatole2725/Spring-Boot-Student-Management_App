package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStudentAppApplication {

	public static void main(String[] args) {
		System.out.println("Appication Starts");
		SpringApplication.run(SpringBootStudentAppApplication.class, args);
		System.out.println("Application Ends");
	}
}