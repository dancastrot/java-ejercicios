package ejercicio;

/**
 * La clase "OnlyMadridException" es una excepción personalizada, destinada a controlar
 * qué objetos de la clase "Futbolista" son añadidos al registro realizado por clase
 * "Futbolistas".
 * 
 * Es el mismo código que en la versión inicial, pero invocado en la clase "FutbolistasParser" 
 * y no en "Main" como era anteriormente.
 * 
 * @author Daniel
 * @since 24/12/2022
 */

public class OnlyMadridException extends Exception {
	public OnlyMadridException(String message) {
		super(message);
	}
}