package com.virtualpairprogrammers.roombooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RoombookingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RoombookingApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RoombookingApplication.class);
	}
}
