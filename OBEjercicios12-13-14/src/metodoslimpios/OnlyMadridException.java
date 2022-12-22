package metodoslimpios;

/**
 * La clase "OnlyMadridException" es una excepción personalizada, destinada a controlar
 * qué objetos de la clase "Futbolista" son añadidos al registro realizado por clase
 * "Futbolistas".
 * 
 * @author Daniel
 * @since 21-12-2022
 *
 */
public class OnlyMadridException extends Exception {
	
	/**
	 * TODO: Reformar clase para admitir jugadores del Real Madrid Castilla. 
	 * */
	
	public OnlyMadridException(String message) {
		super("OnlyMadridException: " + message);
	}

}
