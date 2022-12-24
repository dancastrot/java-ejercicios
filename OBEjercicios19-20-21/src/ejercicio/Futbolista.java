package ejercicio;

public class Futbolista {
	public String nombre;
	public String apellido;
	public String nacionalidad;
	public String equipo;

	public Futbolista(String nombre, String apellido, String nacionalidad, String equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ ", equipo=" + equipo + "]";
	}
}
