package ejerciciopatron;

abstract public class Estado {
	
	public TelevisorInteligente televisorInteligente;
	
	public Estado(TelevisorInteligente televisorInteligente) {
		this.televisorInteligente = televisorInteligente;
	}
	
	abstract public String encenderTelevisor();
	
	abstract public String entrarNetflix();
	
	abstract public String buscarPelicula();
	
	abstract public String seleccionarPelicula();
}
