package ejercicio;

import java.util.ArrayList;

public class FutbolistasParser {
	private ArrayList<Futbolista> listaFutbolistas = new ArrayList<>();
	private String[] args;

	private FutbolistasParser() {
	}

	public FutbolistasParser(String[] args) {
		this.args = args;
	}
	
	/**
	 * El método agregarFutbolista recibe como parámetro a un objeto de la clase Futbolista, y 
	 * en caso de cumplir con la condición de pertenecer al Real Madrid lo añade dentro del ArrayList
	 * "Futbolistas".
	 * 
	 * En caso contrario, arroja la excepción "OnlyMadridException".
	 * 
	 * A diferencia del proyecto inicial, acá este método es usado dentro de la misma clase, 
	 * en agregarParser().
	 * 
	 * @param futbolista
	 * @throws OnlyMadridException
	 * @since 24/12/2022
	 */
	public void agregarFutbolista(Futbolista futbolista) throws OnlyMadridException {
		if (!futbolista.equipo.equalsIgnoreCase("Madrid")) {
			throw new OnlyMadridException(
					"OnlyMadridException: Solo puede añadir a jugadores del Real Madrid. Equipo: " + futbolista.equipo);
		}

		listaFutbolistas.add(futbolista);
	}

	public void listarFutbolistas() {
		for (Futbolista jugador : listaFutbolistas) {
			System.out.println(jugador);
		}
	}

	public void agregarParser(String nombre) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].contains(nombre)) {
				String nombreJugador = args[i];
				String apellidoJugador = args[i + 1];
				String nacionalidadJugador = args[i + 2];
				String equipoJugador = args[i + 3];
				Futbolista jugador = new Futbolista(nombreJugador, apellidoJugador, nacionalidadJugador, equipoJugador);

				try {
					agregarFutbolista(jugador);
				} catch (OnlyMadridException e) {
					System.out.println(e.getMessage());
				}

			}
		}
	}
}
