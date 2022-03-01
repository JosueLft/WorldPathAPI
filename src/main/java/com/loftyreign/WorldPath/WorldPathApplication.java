package com.loftyreign.WorldPath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorldPathApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldPathApplication.class, args);
		System.err.println("API Online!");
	}
}