package ejerciciopatron;

public class EstadoTelevisorEncendido extends Estado {
	public EstadoTelevisorEncendido(TelevisorInteligente televisorInteligente) {
		super(televisorInteligente);
	}

	@Override
	public String encenderTelevisor() {
		return "encenderTelevisor(): El televisor ya esta encendido!!";
	}

	@Override
	public String entrarNetflix() {
		televisorInteligente.cambiarEstado(new EstadoEntrarNetflix(televisorInteligente));
		return "entrarNetflix(): Bienvenido a Netflix!";
	}
	
	@Override
	public String buscarPelicula() {
		return "buscarPelicula(): No disponible. Primero debe entrar a seccion de peliculas";
	}

	@Override
	public String seleccionarPelicula() {
		return "seleccionarPelicula(): No disponible. Primero debe entrar a seccion de peliculas";
	}
}
