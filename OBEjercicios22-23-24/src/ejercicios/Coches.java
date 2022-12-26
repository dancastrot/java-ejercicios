package ejercicios;

import java.util.ArrayList;

public class Coches {
	
	private ArrayList<Coche> listaCoches = new ArrayList<>();
	
	public void agregarCoche(Coche coche) {
		listaCoches.add(coche);
	}
	
	public void listarCoches() {
		for(Coche ejemplar : listaCoches) {
			System.out.println(ejemplar);
		}
	}
	
	public void cantidadCochesListados(){
		System.out.println("Coches listados: " + listaCoches.size());
	}
	
}
