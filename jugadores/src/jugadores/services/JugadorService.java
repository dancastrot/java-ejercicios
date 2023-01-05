package jugadores.services;

import java.util.ArrayList;

import jugadores.entities.Jugador;
import jugadores.repositories.JugadorDB;
import jugadores.repositories.JugadorDBCsv;
import jugadores.repositories.JugadorDBFichero;

public class JugadorService {

	ArrayList<Jugador> jugadores = new ArrayList<>();
	JugadorDB jugadorDB = new JugadorDBCsv(jugadores);

	public void listar() {
		jugadorDB.listar();
	}

	public boolean buscar(String nombre) {
		return jugadorDB.buscar(nombre);
	}

	public void agregar(String nombre, String apellido, String nacionalidad, String equipo) {
		jugadorDB.agregar(new Jugador(nombre, apellido, nacionalidad, equipo));
	}

	public void editar(String nombreBusqueda, String nombreNuevo, String apellidoNuevo, String NacNuevo,
			String equipoNuevo) {
		jugadorDB.editar(nombreBusqueda, nombreNuevo, apellidoNuevo, NacNuevo, equipoNuevo);
	}

	public void eliminar(String nombre) {
		jugadorDB.eliminar(nombre);
	}
	
	public void exportar() {
		jugadorDB.exportar();
	}
	
	public void importar() {
		jugadorDB.importar();
	}

}
