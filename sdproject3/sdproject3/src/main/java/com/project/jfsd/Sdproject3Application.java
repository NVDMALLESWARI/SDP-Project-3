package com.project.jfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.project.jfsd")
public class Sdproject3Application {

	public static void main(String[] args) {
		SpringApplication.run(Sdproject3Application.class, args);
		System.out.println("Spring Boot Web MVC to perform CRUD Operations");
	}

}
