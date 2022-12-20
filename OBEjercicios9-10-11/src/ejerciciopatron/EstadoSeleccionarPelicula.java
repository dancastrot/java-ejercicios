package ejerciciopatron;

public class EstadoSeleccionarPelicula extends Estado{
	public EstadoSeleccionarPelicula(TelevisorInteligente televisorInteligente) {
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
		return null;
	}

	@Override
	public String seleccionarPelicula() {
		return null;
	}
	
}

