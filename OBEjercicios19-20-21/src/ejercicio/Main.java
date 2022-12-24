package ejercicio;

/*
 * El programa está destinado a mantener un registro de jugadores de futbol reales,
 * aunque con la condición de pertenecer al Real Madrid. 
 * 
 * Para ello, genera una clase "Futbolista" con cuatro atributos básicos, y a la clase "FutbolistasParser" 
 * que cumple con almacenar el total de registros.
 * 
 * A fin de verificar la pertenencia al club especificado, se crea una clase excepción "OnlyMadridException" 
 * que interviene en el proceso de registro.
 * 
 * A diferencia del proyecto inicial, en este caso se guardan datos que existen por defecto como atributo o 
 * argumento del Main. Por ello, la clase "Futbolistas" es convertida en "FutbolistasParser" dado que permite 
 * añadir caso por caso a los parámetros según el nombre del futbolista.
 * */

public class Main {

	public static void main(String[] args) {
		
		FutbolistasParser futbolistas = new FutbolistasParser(args);
		
		futbolistas.agregarParser("Karim");
		futbolistas.agregarParser("Memphis");
		futbolistas.agregarParser("David");
		
		futbolistas.listarFutbolistas();
	}
	
}
