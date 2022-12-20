package ejercicios;

public class Main {

	public static void main(String[] args) {

		Radio radio = Radio.getInstance();
		radio.setMarca("Sony");
		
		Radio radio2 = Radio.getInstance();
		radio2.setMarca("Samsung");
		
		System.out.println(radio);
		System.out.println(radio2);
		
	}

}
