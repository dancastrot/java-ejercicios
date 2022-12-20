package ejerciciopatron;

public class EstadoEntrarNetflix extends Estado{

	public EstadoEntrarNetflix(TelevisorInteligente televisorInteligente) {
		super(televisorInteligente);
	}

	@Override
	public String encenderTelevisor() {
		return "encenderTelevisor(): El televisor ya esta encendido!! ";
	}
	
	@Override
	public String entrarNetflix() {
		return "entrarNetflix(): Ya estas en Netflix!!";
	}


	@Override
	public String buscarPelicula() {
		televisorInteligente.cambiarEstado(new EstadoBuscarPelicula(televisorInteligente));
		return "buscarPelicula(): Bienvenido a la sección de peliculas, ahora puede buscar";
	}

	@Override
	public String seleccionarPelicula() {
		return "seleccionarPelicula(): No disponible, primero debes buscar la pelicula";
	}
}
