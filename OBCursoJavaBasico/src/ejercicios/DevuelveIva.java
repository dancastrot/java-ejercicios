package ejercicios;

public class DevuelveIva {

	public static void main(String[] args) {
		
		devuelveIva(150);
		
	}
	
	static double devuelveIva(double precio) {
		double precioConIva = precio * 1.19;
		System.out.println(precioConIva);
		return precioConIva;
	}

}
