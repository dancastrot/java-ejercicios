package metodoslimpios;

public class Main {
	
	/*
	 * El programa está destinado a mantener un registro de jugadores de futbol reales,
	 * aunque con la condición de pertenecer al Real Madrid. 
	 * 
	 * Para ello, genera una clase "Futbolista" con cuatro atributos básicos, y a la clase "Futbolistas" 
	 * que cumple con almacenar el total de registros.
	 * 
	 * A fin de verificar la pertenencia al club especificado, se crea una clase excepción "OnlyMadridException" 
	 * que interviene en el proceso de registro.
	 * */
	public static void main(String[] args) {
		Futbolistas futbolistas = new Futbolistas();

		Futbolista benzema = new Futbolista();
		benzema.nombre = "Karim";
		benzema.apellido = "Benzema";
		benzema.nacionalidad = "francés";
		benzema.equipo = "Real Madrid";

		Futbolista depay = new Futbolista();
		depay.nombre = "Memphis";
		depay.apellido = "Depay";
		depay.nacionalidad = "neerlandés";
		depay.equipo = "FC Barcelona";

		try {
			futbolistas.agregarFutbolista(benzema);
			futbolistas.agregarFutbolista(depay);
		} catch (OnlyMadridException e) {
			System.out.println(e.getMessage());
		}
	}

}
