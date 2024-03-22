package com.virtualpairprogrammers.roombooking;

import org.apache.axis.AxisProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RoombookingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RoombookingApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RoombookingApplication.class);
	}

//	@PostConstruct
//	void preventAxisPropertiesClassLoaderLeak() {
//		ClassLoader tccl = Thread.currentThread().getContextClassLoader();
//		Thread.currentThread().setContextClassLoader(AxisProperties.class.getClassLoader());
//		AxisProperties.getNameDiscoverer();
//		Thread.currentThread().setContextClassLoader(tccl);
//	}
}
