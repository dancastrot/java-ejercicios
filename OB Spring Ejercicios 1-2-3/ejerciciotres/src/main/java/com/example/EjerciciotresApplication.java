package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciotresApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjerciciotresApplication.class, args);
		
		Futbolista futbolista = new Futbolista(null,"Benzema","Frances","Madrid");
		
		FutbolistaRepository repository = context.getBean(FutbolistaRepository.class);
		repository.count();
		repository.save(futbolista);
		repository.count();
	}

}
