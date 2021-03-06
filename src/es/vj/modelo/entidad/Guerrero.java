package es.vj.modelo.entidad;

public class Guerrero extends Personaje {
	private int fuerza ;

	
	public Guerrero(double vida, String nombre, Arma arma, int fuerza) {
		super.setVida(vida);
		super.setArma(arma);
		super.setNombre(nombre);
		this.fuerza = fuerza;
		
	}

	public void atacar(Personaje p) {
		if(super.getArma() instanceof Espada || super.getArma() instanceof Arco) {
			super.getArma().setDamage(super.getArma().getDamage() + 10);
		}
		if(Math.round(Math.random()*6) == 6) {
			p.setVida(p.getVida() - (super.getArma().getDamage() + 20 + fuerza));
		}else {
			p.setVida(p.getVida() - (super.getArma().getDamage() + fuerza));
		}
		super.getArma().usar();
	}

	public void bloquear(Personaje p) {
		int bloqueo = p.getArma().getDamage() - 5;
		this.setVida(super.getVida() + bloqueo);
		
	}

}
