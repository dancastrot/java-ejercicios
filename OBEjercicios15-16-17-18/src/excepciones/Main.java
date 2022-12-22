package excepciones;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Arithmetic exception tratando de hacer una división entre dos números, siendo
		// el que divide 0.

		int divisor = 10;
		int resultado = 0;

		try {
			resultado = divisor / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e.getMessage());
		}
		
		//ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
		
		String[] paises = {"Chile","España","Mexico","Brasil","Peru","Francia"};
		
		int elementoBuscado = 9;
		try {
			System.out.println(paises[elementoBuscado-1]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException: " + e.getMessage());
		}
		
		//FileNotFound tratando de acceder a un fichero que no existe.
		
		String ubicacionFichero = "C:/Users/castr/Desktop/fichero.txt";
		
		try {
			File file = new File(ubicacionFichero);
			Scanner scanner = new Scanner(file);
		}catch(Exception e) {
			System.out.println("FileNotFound: " + e.getMessage());
		}
		
	}

}
