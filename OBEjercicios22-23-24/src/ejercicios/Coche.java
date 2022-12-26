package ejercicios;

abstract public class Coche {
	
	protected int kilometraje;
	protected String marca;
	
	public Coche(int kilometraje, String marca) {
		this.kilometraje = kilometraje;
		this.marca = marca;
	}
	
	abstract public int getKilometraje();
	
	abstract String getMarca();
	
	abstract String cargaCombustible();
	
	abstract public String toString();
}
