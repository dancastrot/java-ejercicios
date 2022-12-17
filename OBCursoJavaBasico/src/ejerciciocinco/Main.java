package ejerciciocinco;

public class Main {

	public static void main(String[] args) {	
		
		CocheCRUD cocheCrud = new CocheCRUDImpl();
		
		cocheCrud.save();
		cocheCrud.findAll();
		cocheCrud.findById();
		cocheCrud.update();
		cocheCrud.delete();
	}

}
