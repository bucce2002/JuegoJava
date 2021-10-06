package es.vj.modelo.entidad;

public class Hechizos extends Arma{

	public Hechizos(int damage) {
		super.setDamage(damage);
	};

	public void usar() {

		System.out.println("EXPELIAAARMUS");

	}
}
