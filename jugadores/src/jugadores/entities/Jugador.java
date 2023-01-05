package jugadores.entities;

public class Jugador {

	private String nombre;
	private String apellido;
	private String nacionalidad;
	private String equipo;

	public Jugador(String nombre, String apellido, String nacionalidad,String equipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public String getEquipo() {
		return equipo;
	}
	
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return nombre + "," + apellido + "," + nacionalidad + "," + equipo;
	}

}
