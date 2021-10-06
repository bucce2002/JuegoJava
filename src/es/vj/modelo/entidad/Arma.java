package es.vj.modelo.entidad;

public abstract class Arma {
	
	private int damage;
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public abstract void usar();

}
