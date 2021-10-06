package es.vj.modelo.entidad;

public class Espada extends Arma {
	
	public Espada(int damage) {
		super.setDamage(damage);
	};

	public void usar() {

		System.out.println("SWOOOOONG!");

	}

}
