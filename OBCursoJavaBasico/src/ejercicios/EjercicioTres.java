package ejercicios;

public class EjercicioTres {

	public static void main(String[] args) {
		
		String nombres[] = {"Aprendiendo", "Java", "en", "el","mejor","sitio"};
		
		String frase = "";
		
		for(String nombre: nombres) {
			frase = frase + nombre + " ";
		}
		
		
		System.out.println(frase);
	}

}
