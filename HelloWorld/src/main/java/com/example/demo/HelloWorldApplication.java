package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(HelloWorldApplication.class, args);
		ConfigurableApplicationContext context=SpringApplication.run(HelloWorldApplication.class, args);
		Customers c=context.getBean(Customers.class);
		c.display();
		
		}

}
