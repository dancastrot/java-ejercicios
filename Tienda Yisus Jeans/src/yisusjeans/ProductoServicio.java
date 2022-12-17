package yisusjeans;

import java.io.PrintStream;
import java.util.ArrayList;

public class ProductoServicio {

	ArrayList<Producto> listaProductos = new ArrayList<>();

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void listarProductos() {
		for (Producto producto : listaProductos) {
			System.out.println(producto);
		}
	}

	public void agregarProductos(String articulo, String precio, String descripcion, String codigo, String talla,
			String marca, String color) {
		listaProductos.add(new Producto(articulo, precio, descripcion, codigo, talla, marca, color));
	}

	public void exportar(String rutaDestino) {

		try {
			PrintStream escritura = new PrintStream(rutaDestino);
			for (Producto producto : listaProductos) {
				escritura.println(producto);
			}
			escritura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
