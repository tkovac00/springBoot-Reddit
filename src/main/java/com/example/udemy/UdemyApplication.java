package com.example.udemy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class UdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyApplication.class, args);
		System.out.println("Welcome!");
	}

	@Bean
	@Profile("dev")
	CommandLineRunner runner(){
		return args ->{
			System.out.println("This is dev message");
		};
	}

}
