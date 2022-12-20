package ejercicios;

public class Radio {

	private static Radio radio;
	private String marca;

	public static Radio getInstance() {
		if (radio == null) {
			radio = new Radio();
		}

		return radio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
