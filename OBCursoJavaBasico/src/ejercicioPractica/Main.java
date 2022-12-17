package ejercicioPractica;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
		
		System.out.println(reverse("hola mundo"));
		System.out.println("");
		
		//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
		
		String[] arreglo = {"Argentina","Marruecos","Francia","Croacia"};
		for(String pais: arreglo) {
			System.out.print(pais + " ");
		}
		
		System.out.println(""); System.out.println("");
		
		/*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas 
		 * dimensiones.*/
		
		int[][] enteros = {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("numeros["+i+"]["+j+"]: " + enteros[i][j]);
			}
		}
		System.out.println("");
		
		/*Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y 
		 * muestra el resultado final*/
		
		Vector<String> wcPaises = new Vector<String>();
		wcPaises.add("Ecuador");
		wcPaises.add("Uruguay");
		wcPaises.add("Catar");
		wcPaises.add("Belgica");
		wcPaises.add("Tunez");
				
		wcPaises.remove(1);
		wcPaises.remove(1);
		
		System.out.println(wcPaises);
		System.out.println("");
		
		/*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 
		 * 1000 elementos para ser añadidos al mismo.
		 * RESPUESTA: Por defecto un vector tiene una capacidad de 10 elementos. Cada vez que se desborda la capacidad
		 * se genera una copia que añade 10+, lo que a la larga trae problemas por consumo excesivo de memoria*/
		
		/*Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. 
		 * Recorre ambos mostrando únicamente el valor de cada elemento.*/
		
		ArrayList<String> equipos = new ArrayList<>();
		equipos.add("Real Madrid");
		equipos.add("Barcelona");
		equipos.add("Atletico");
		equipos.add("Valencia");
		
		for(String equipo:equipos) {
			System.out.print(equipo + ", ");
		}
		
		System.out.println("");
		
		LinkedList<String> copia = new LinkedList<>(equipos);
		
		for(String copiaEquipo:copia) {
			System.out.print(copiaEquipo + ", ");
		}
		
		System.out.println("");System.out.println("");
		
		/*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
		 * A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
		 * Por último, vuelve a recorrerlo y muestra el ArrayList final. 
		 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.*/
		
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				continue;
			}
			numeros.add(i);
		}
		
		System.out.println(numeros);System.out.println("");
		
		/*Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo 
		 * ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). 
		 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
		 * Finalmente, mostraremos en cualquier caso: "Demo de código".*/
		
		dividePorCero(5);System.out.println("");
		
		/*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
		 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" 
		 * al fichero dado en "fileOut".*/
		
		String ficheroOriginal = "C:/Users/castr/Desktop/fichero.txt";
		String copiaFichero = "C:/Users/castr/Desktop/copia.txt";
		copiarFichero(ficheroOriginal,copiaFichero);System.out.println("");
		
		/*Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y 
		 * un ArrayList, LinkedList o array.*/
		
		String textoBase = "C:/Users/castr/Desktop/base.txt";
		String textoFinal = "C:/Users/castr/Desktop/goleadores.txt";
		
		goleadoresWC(textoBase,textoFinal);
		
	}

	public static String reverse(String texto) {

		String reverse = "";
		int largoFrase = texto.length()-1;
		
		for(int i = largoFrase;i>-1;i--) {
			reverse += texto.charAt(i);
		}
		
		return reverse;
	}
	
	public static void dividePorCero(int dividendo) throws ArithmeticException{
		try {
			int resultado = dividendo / 0;
			System.out.println(resultado);
		}catch(ArithmeticException e) {
			System.out.println("Esto no puede hacerse");
		}finally {
			System.out.println("Demo de código");
		}
	}
	
	public static void copiarFichero(String fileIn,String fileOut) {
		try {
			InputStream lectura = new FileInputStream(fileIn);
			byte[] datos = lectura.readAllBytes();
			lectura.close();
			
			PrintStream copia = new PrintStream(fileOut);
			copia.write(datos);
			copia.close();
			System.out.println("Fichero copiado con exito");
		}catch(Exception e) {
			System.out.println("Fichero no está: " + e.getMessage());
		}
	}
	
	public static void goleadoresWC(String textoBase,String textoFinal) {
		/*ArrayList-HashMap con maximos goleadores de WC, archivo origen y destino señalados por cliente*/
		
		ArrayList<String> goleadoresArr = new ArrayList<String>();
		HashMap<Integer,String> goleadoresHash = new HashMap<>();
		
		goleadoresArr.add("Miroslav Klose");
		goleadoresArr.add("Ronaldo");
		goleadoresArr.add("Gerd Müller");
		goleadoresArr.add("Just Fontaine");
		goleadoresArr.add("Pelé");
		goleadoresArr.add("Sándor Kocsis");
		goleadoresArr.add("Jürgen Klinsmann");
		goleadoresArr.add("Lionel Messi");
		
		for(int i=0;i<goleadoresArr.size();i++) {
			goleadoresHash.put(i, goleadoresArr.get(i));
		}
		
		try {
			InputStream lecturaBase = new FileInputStream(textoBase);
			byte[] datos = lecturaBase.readAllBytes();
			lecturaBase.close();
			
			PrintStream copiaFinal = new PrintStream(textoFinal);
			copiaFinal.write(datos);
			copiaFinal.println();
			for(Map.Entry<Integer, String> pair: goleadoresHash.entrySet()) {
				copiaFinal.println((pair.getKey()+1) + "-" + pair.getValue());
			}
			copiaFinal.close();
			
			System.out.println("Fichero final creado con exito");
			
		}catch(Exception e){
			System.out.println("Fichero base no está: " + e.getMessage());
		}
	}
	
}
