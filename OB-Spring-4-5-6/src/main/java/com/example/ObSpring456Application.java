package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.entities.Laptop;
import com.example.repository.LaptopRepository;

@SpringBootApplication
public class ObSpring456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpring456Application.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);
				
		//Agrega Laptop a BBDD
		Laptop laptop1 = new Laptop(null,"HP","Windows 10",1000,true);
		Laptop laptop2 = new Laptop(null,"Asus","Windows 8",1500,false);
		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
		
		
	}

}
