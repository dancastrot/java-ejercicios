package com.ejerciciodos;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	public String imprimirSaludo() {
		return "Hola, como te va?";
	}
}
