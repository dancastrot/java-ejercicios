package ejerciciopatron;

public class EstadoBuscarPelicula extends Estado{
	public EstadoBuscarPelicula(TelevisorInteligente televisorInteligente) {
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
		return "buscarPelicula(): Ya estás en la sección de busqueda!!";
	}

	@Override
	public String seleccionarPelicula() {
		televisorInteligente.cambiarEstado(new EstadoSeleccionarPelicula(televisorInteligente));
		return "seleccionarPelicula(): Haga click para seleccionar la pelicula, disfrute!!";
	}


}
