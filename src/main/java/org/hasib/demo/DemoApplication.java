package org.hasib.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(demoController.myMethod()); 
		SpringApplication.run(DemoApplication.class, args);
	}

}
