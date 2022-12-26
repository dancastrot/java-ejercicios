package ejercicios;

public class Main {

	public static void main(String[] args) {

		Coches coches = new Coches();
		
		Coche electrico = new CocheElectrico(500,"Toyota");
		System.out.println(electrico.getKilometraje());
		System.out.println(electrico.cargaCombustible());
		
		Coche combustible = new CocheCombustible(1000,"Nissan");
		System.out.println(combustible.getKilometraje());
		System.out.println(combustible.cargaCombustible());
		
		Coche hibrido = new CocheHibrido(250,"Chery");
		System.out.println(hibrido.getKilometraje());
		System.out.println(hibrido.cargaCombustible());
		
		coches.agregarCoche(electrico);
		coches.agregarCoche(combustible);
		coches.agregarCoche(hibrido);
		
		coches.listarCoches();
		coches.cantidadCochesListados();
	}

}
