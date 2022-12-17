package ejercicios;

public class EjercicioCuatro {

	public static void main(String[] args) {
		
		SmartDevice televisor = new SmartDevice("LG","Android",21);
		SmartPhone galaxyS21 = new SmartPhone("Samsung","Android",7,16,50); 
		SmartWatch miBand = new SmartWatch("Xiaomi","Android",4.5,"Plastico",true);
				
		System.out.println("Televisor"
				+ "\nMarca: " + televisor.getMarca()
				+ "\nSistema Operativo: " + televisor.getSistemaOperativo()
				+ "\nPulgadas pantalla: " + televisor.getPulgadasPantalla());
		
		System.out.println("");
		
		System.out.println("GalaxyS21"
				+ "\nMarca: " + galaxyS21.getMarca()
				+ "\nSistema Operativo: " + galaxyS21.getSistemaOperativo()
				+ "\nPulgadas pantalla: " + galaxyS21.getPulgadasPantalla()
				+ "\nMemoria Ram: " + galaxyS21.getMemoriaRam()
				+ "\nMegapixeles: " + galaxyS21.getCamaraMegapixels());
		
		System.out.println("");
		
		System.out.println("miBand"
				+ "\nMarca: " + miBand.getMarca()
				+ "\nSistema Operativo: " + miBand.getSistemaOperativo()
				+ "\nPulgadas pantalla: " + miBand.getPulgadasPantalla()
				+ "\nMaterial Pulsera: " + miBand.getMaterialPulsera()
				+ "\nResistencia al agua: " + miBand.getResistenciaAlAgua());
								
	}

}

class SmartDevice{
	
	private String marca;
	private String sistemaOperativo;
	private double pulgadasPantalla;
	
	public SmartDevice() {}
	
	public SmartDevice(String marca, String sistemaOperativo, double pulgadasPantalla) {
		this.marca = marca;
		this.sistemaOperativo = sistemaOperativo;
		this.pulgadasPantalla = pulgadasPantalla;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public double getPulgadasPantalla() {
		return pulgadasPantalla;
	}
	
	public void setPulgadasPantalla(double pulgadasPantalla) {
		this.pulgadasPantalla = pulgadasPantalla;
	}
	
}

class SmartPhone extends SmartDevice{
		
	private int memoriaRam;
	private double camaraMegapixels;
	
	public SmartPhone() {}
	
	public SmartPhone(String marca, String sistemaOperativo, double pulgadasPantalla,int memoriaRam,double camaraMegapixels) {
		super(marca,sistemaOperativo,pulgadasPantalla);
		this.memoriaRam = memoriaRam;
		this.camaraMegapixels = camaraMegapixels;
	}
	
	public int getMemoriaRam() {
		return memoriaRam;
	}
	
	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
	public double getCamaraMegapixels() {
		return camaraMegapixels;
	}
	
	public void setCamaraMegapixels(double camaraMegapixels) {
		this.camaraMegapixels = camaraMegapixels;
	}
}

class SmartWatch extends SmartDevice{
	
	private String materialPulsera;
	private boolean resistenciaAlAgua;
	
	public SmartWatch() {}
	
	public SmartWatch(String marca, String sistemaOperativo, double pulgadasPantalla,String materialPulsera,boolean resistenciaAlAgua) {
		super(marca,sistemaOperativo,pulgadasPantalla);
		this.materialPulsera = materialPulsera;
		this.resistenciaAlAgua = resistenciaAlAgua;
	}
	
	public String getMaterialPulsera() {
		return materialPulsera;
	}
	
	public void setMaterialPulsera(String materialPulsera) {
		this.materialPulsera = materialPulsera;
	}
	
	public boolean getResistenciaAlAgua() {
		return resistenciaAlAgua;
	}
	
	public void setResistenciaAlAgua(boolean resistenciaAlAgua) {
		this.resistenciaAlAgua = resistenciaAlAgua;
	}
}
