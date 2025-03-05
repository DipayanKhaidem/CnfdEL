package com.example.lab5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab5Application {

	public static void main(String[] args) {
		 try {
	            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	            Product product = context.getBean(Product.class);
	            System.out.println("Injected Product: " + product);
	        } catch (Exception e) {
	            System.err.println("Bean Validation Failed: " + e.getMessage());
	        }
	}

}
