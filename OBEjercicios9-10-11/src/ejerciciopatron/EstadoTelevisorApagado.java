package ejerciciopatron;

public class EstadoTelevisorApagado extends Estado {

	public EstadoTelevisorApagado(TelevisorInteligente televisorInteligente) {
		super(televisorInteligente);
	}

	@Override
	public String encenderTelevisor() {
		televisorInteligente.cambiarEstado(new EstadoTelevisorEncendido(televisorInteligente));
		return "encenderTelevisor(): TV encendida";
	}

	@Override
	public String entrarNetflix() {
		return "entrarNeflix(): No disponible. Primero debe entrar a Netflix";
	}
	
	@Override
	public String buscarPelicula() {
		return "buscarPelicula(): No disponible. Primero debe entrar a Neflix";
	}

	@Override
	public String seleccionarPelicula() {
		return "seleccionarPelicula(): No disponible. Primero debe entrar a Neflix";
	}

}
