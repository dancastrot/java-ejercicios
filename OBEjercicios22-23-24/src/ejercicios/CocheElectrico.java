package ejercicios;

public class CocheElectrico extends Coche{
	
	public CocheElectrico(int kilometraje, String marca) {
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
		return "Conectando a centro de carga electrico...";
	}

	@Override
	public String toString() {
		return "CocheElectrico [kilometraje=" + kilometraje + ", marca=" + marca + "]";
	}

}
