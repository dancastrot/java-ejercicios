package ejerciciopatron;

public class Main {

	public static void main(String[] args) {
		
		/*Patrón creacional Singleton aplicado a patrón de comportamiento State. 
		 * La lógica del proyecto es imaginar a un cliente controlando la TV a través del remoto, para que este pueda
		 * acceder a la aplicación Netflix y ver una pelicula. 
		 * Con Singleton se asegura la existencia de un solo objeto TelevisorInteligente que recibirá las 
		 * instrucciones dadas por el cliente.
		 * Con State se asegura una secuencia correcta de pasos por parte del cliente para poder ver una pelicula, es decir:
		 * - encender televisorInteligente
		 * - acceder a Netflix
		 * - acceder al buscador de peliculas
		 * - seleccionar pelicula deseada
		 * En la medida que repita alguno de los pasos, será notificado por el programa.
		 * */

		TelevisorInteligente smart = TelevisorInteligente.getInstance();
		
		System.out.println(smart.estado.encenderTelevisor());
		System.out.println(smart.estado.entrarNetflix());
		System.out.println(smart.estado.buscarPelicula());
		System.out.println(smart.estado.seleccionarPelicula());
		
		TelevisorInteligente smart2 = TelevisorInteligente.getInstance();
		
		System.out.println("\n" + smart);
		System.out.println(smart2);
		

	}

}
