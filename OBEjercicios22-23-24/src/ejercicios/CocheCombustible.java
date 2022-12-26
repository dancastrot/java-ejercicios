package ejercicios;

public class CocheCombustible extends Coche{
	
	public CocheCombustible(int kilometraje, String marca) {
		super(kilometraje, marca);
	}

	@Override
	public String getMarca() {
		return marca;
	}
	
	public int getKilometraje() {
		return kilometraje;
	}

	@Override
	public String cargaCombustible() {
		return "Cargando tanque con gasolina de 97 octanos...";
	}

	@Override
	public String toString() {
		return "CocheCombustible [kilometraje=" + kilometraje + ", marca=" + marca + "]";
	}
}
