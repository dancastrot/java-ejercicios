package ejercicios;

public class CocheHibrido extends Coche{
	
	public CocheHibrido(int kilometraje, String marca) {
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
		return "Cargando tanque de combustible y conectando al centro de carga electrico...";
		
	}

	@Override
	public String toString() {
		return "CocheHibrido [kilometraje=" + kilometraje + ", marca=" + marca + "]";
	}
}
