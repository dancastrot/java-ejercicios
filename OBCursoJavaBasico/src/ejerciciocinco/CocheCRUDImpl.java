package ejerciciocinco;

public class CocheCRUDImpl implements CocheCRUD{

	@Override
	public void save() {
		System.out.println("Este es el método save");
	}

	@Override
	public void findAll() {
		System.out.println("Este es el método findAll");
	}

	@Override
	public void findById() {
		System.out.println("Este es el método findById");
	}

	@Override
	public void update() {
		System.out.println("Este es el método update");
	}

	@Override
	public void delete() {
		System.out.println("Este es el método delete");
	}

}
