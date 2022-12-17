package yisusjeans;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		ProductoServicio productoServicio = new ProductoServicio();
		Scanner teclado = new Scanner(System.in);

		boolean entrada = true;

		while (entrada) {
			System.out.println("1 Listar Producto\n2 Agregar Producto\n3 Exportar Datos\n4 Salir\nIngrese una opción:");
			String opcion = teclado.nextLine();

			switch (opcion) {
			case "1":
				productoServicio.listarProductos();
				break;
			case "2":
				System.out.println("Crear Producto");
				System.out.println("Ingresar nombre articulo:");
				String articulo = teclado.nextLine();
				System.out.println("Ingresa precio:");
				String precio = teclado.nextLine();
				System.out.println("Ingresa descripción:");
				String descripcion = teclado.nextLine();
				System.out.println("Ingresa código:");
				String codigo = teclado.nextLine();
				System.out.println("Ingresa talla:");
				String talla = teclado.nextLine();
				System.out.println("Ingresa marca:");
				String marca = teclado.nextLine();
				System.out.println("Ingresa color:");
				String color = teclado.nextLine();
				productoServicio.agregarProductos(articulo, precio, descripcion, codigo, talla, marca, color);
				break;
			case "3":
				System.out.println("Exportar Datos\nIngrese la opción 1 para exportar:");
				String opcionExportar = teclado.nextLine();
				if (opcionExportar.equals("1")) {
					System.out.println("\nExportar Datos");
					System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.txt:");
					String rutaDestino = teclado.nextLine();
					productoServicio.exportar(rutaDestino + "/clientes.txt");
					System.out.println("\nDatos de clientes exportados correctamente en formato .txt"
							+ "\n---------------------------------------");
				} else {
					System.out.println("Volviendo al menu...");
				}
				break;
			case "4":
				System.out.println("Abandonando el sistema de productos...\nAcaba de salir del sistema");
				entrada = false;
				break;
			default:
				System.out.println("Opción no disponible. Intente nuevamente");
			}
		}

		teclado.close();

	}

}
