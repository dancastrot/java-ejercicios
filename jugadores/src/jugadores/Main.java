package jugadores;

import java.util.Scanner;

import jugadores.services.JugadorService;

public class Main {

	public static void main(String[] args) {

		JugadorService service = new JugadorService();
		Scanner scanner = new Scanner(System.in);
		boolean entrada = true;

		while (entrada) {
			System.out.println(
					"\n1. Listar\n2. Buscar\n3. Agregar\n4. Exportar\n5. Importar\n6. Editar\n7. Eliminar\n8. Salir");
			String opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				service.listar();
				break;
			case "2":
				System.out.println("BUSQUEDA DE JUGADOR\nDigite nombre de jugador a buscar");
				String nombreBusqueda = scanner.nextLine();
				service.buscar(nombreBusqueda);
				break;
			case "3":
				System.out.println("AGREGAR JUGADOR");
				System.out.println("Digite nombre de jugador");
				String nombreJugador = scanner.nextLine();
				System.out.println("Digite apellido de jugador");
				String apellidoJugador = scanner.nextLine();
				System.out.println("Digite nacionalidad de jugador");
				String nacionalidadJugador = scanner.nextLine();
				System.out.println("Digite equipo de jugador");
				String equipoJugador = scanner.nextLine();
				service.agregar(nombreJugador, apellidoJugador, nacionalidadJugador, equipoJugador);
				break;
			case "4":
				service.exportar();
				break;
			case "5":
				service.importar();
				break;
			case "6":
				System.out.println("EDITAR JUGADOR\n");
				System.out.println("\nDigite nombre de jugador a editar");
				nombreJugador = scanner.nextLine();
				if (service.buscar(nombreJugador) == true) {
					System.out.println("JUGADOR ENCONTRADO");
					System.out.println("\nDigite nombre de jugador");
					String nombreNuevo = scanner.nextLine();
					System.out.println("\nDigite apellido de jugador");
					String apellidoNuevo = scanner.nextLine();
					System.out.println("\nDigite nacionalidad de jugador");
					String nacionalidadNuevo = scanner.nextLine();
					System.out.println("\nDigite equipo de jugador");
					String equipoNuevo = scanner.nextLine();
					service.editar(nombreJugador, nombreNuevo, apellidoNuevo, nacionalidadNuevo, equipoNuevo);
				} else {
					System.out.println("JUGADOR NO EXISTE!");
				}

				break;
			case "7":
				System.out.println("ELIMINAR JUGADOR\n");
				System.out.println("\nDigite nombre de jugador a eliminar");
				nombreJugador = scanner.nextLine();
				service.eliminar(nombreJugador);
				break;
			case "8":
				System.out.println("Saliendo...");
				entrada = false;
				break;
			default:
				System.out.println("Opcion no disponible. Volviendo a Menu...");
				break;
			}
		}
		scanner.close();
	}

}
