package ejerciciopatron;

public class TelevisorInteligente {
	
	public Estado estado;
	
	private static TelevisorInteligente televisorInteligente;
		
	private TelevisorInteligente() {
		estado = new EstadoTelevisorApagado(this);
	}
	
	public void cambiarEstado(Estado estado) {
		System.out.println("Estado inicial: " + this.estado.getClass().getName());
		this.estado = estado;
		System.out.println("Estado actual: " + this.estado.getClass().getName());
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public static TelevisorInteligente getInstance() {
		if(televisorInteligente == null) {
			televisorInteligente = new TelevisorInteligente();
		}
		
		return televisorInteligente;
	}
}
