package jugadores.repositories;

import java.util.ArrayList;

import jugadores.entities.Jugador;

abstract public class JugadorDB {

	protected ArrayList<Jugador> listaJugadores = new ArrayList<>();

	protected JugadorDB(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	abstract public void listar();

	abstract public boolean buscar(String nombre);

	abstract public void agregar(Jugador jugador);

	abstract public void editar(String nombreBusqueda, String nombreNuevo, String apellidoNuevo, String NacNuevo,
			String equipoNuevo);

	abstract public void eliminar(String nombre);
	
	abstract public void exportar();
	
	abstract public void importar();

}
