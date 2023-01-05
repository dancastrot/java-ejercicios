package jugadores.repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import jugadores.entities.Jugador;

public class JugadorDBCsv extends JugadorDB {
	String ubicacionArchivo = "src/jugadores.csv";
	
	public JugadorDBCsv(ArrayList<Jugador> listaJugadores) {
		super(listaJugadores);
	}

	@Override
	public void listar() {
		for (Jugador jug : listaJugadores) {
			System.out.println(jug);
		}
	}

	@Override
	public boolean buscar(String nombre) {
		boolean existe = false;
		for (int i = 0; i < listaJugadores.size(); i++) {
			if (listaJugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				existe = true;
				System.out.println("Registro: " + listaJugadores.get(i));
			}
		}
		if (!existe) {
			System.out.println("No hay registro");
		}

		return existe;
	}
	
	@Override
	public void agregar(Jugador jugador) {
		listaJugadores.add(jugador);
	}

	@Override
	public void editar(String nombreBusqueda,String nombreNuevo, String apellidoNuevo, String NacNuevo,
			String equipoNuevo) {
		for (int i = 0; i < listaJugadores.size(); i++) {
			if (listaJugadores.get(i).getNombre().equalsIgnoreCase(nombreBusqueda)) {
				listaJugadores.get(i).setNombre(nombreNuevo);
				listaJugadores.get(i).setApellido(apellidoNuevo);
				listaJugadores.get(i).setNacionalidad(NacNuevo);
				listaJugadores.get(i).setEquipo(equipoNuevo);
			}
		}
	}

	@Override
	public void eliminar(String nombre) {
		boolean existe = false;
		for (int i = 0; i < listaJugadores.size(); i++) {
			if (listaJugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				existe = true;
				listaJugadores.remove(i);
			}
		}

		if (!existe) {
			System.out.println("REGISTRO NO ENCONTRADO!");
		}
	}

	@Override
	public void exportar() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(ubicacionArchivo);
			PrintStream printStream = new PrintStream(fileOutputStream);

			for (Jugador jug : listaJugadores) {
				printStream.println(jug);
			}
			printStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void importar() {
		try {
			Scanner scannerFichero = new Scanner(new File(ubicacionArchivo));
			while (scannerFichero.hasNext()) {
				String linea = scannerFichero.next();
				String[] partes = linea.split(",");
				agregar(new Jugador(partes[0], partes[1], partes[2], partes[3]));
			}
			scannerFichero.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}