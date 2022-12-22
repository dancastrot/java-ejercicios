package metodoslimpios;

import java.util.ArrayList;

public class Futbolistas {
	
	private ArrayList<Futbolista> futbolistas = new ArrayList<>();
	
	/**
	 * 
	 * El método agregarFutbolista recibe como parámetro a un objeto de la clase Futbolista, y 
	 * en caso de cumplir con la condición de pertenecer al Real Madrid lo añade dentro del ArrayList
	 * "Futbolistas".
	 * 
	 * En caso contrario, arroja la excepción "OnlyMadridException".
	 * 
	 * @param futbolista
	 * @throws OnlyMadridException
	 * @Since 21-12-2022
	 */
	public void agregarFutbolista(Futbolista futbolista) throws OnlyMadridException{
		if(!futbolista.equipo.equalsIgnoreCase("Real Madrid")) {
			throw new OnlyMadridException("Solo puede añadir a jugadores del Real Madrid"); 
		}
		
		futbolistas.add(futbolista);
		
	}
	
	
	
}
