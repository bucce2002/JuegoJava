package es.vj.modelo.entidad;

public class Mago extends Personaje{
	private int inteligencia;
	
	public Mago(int vida, String nombre, Arma arma, int inteligencia) {
		super.setVida(vida);
		super.setArma(arma);
		super.setNombre(nombre);
		this.inteligencia = inteligencia;
		
	}

	@Override
	public void atacar(Personaje p) {
		if(super.getArma() instanceof Hechizos) {
			super.getArma().setDamage(super.getArma().getDamage() + 10);
		}
		if(Math.round(Math.random()*6) == 6) {
			p.setVida(p.getVida() - (super.getArma().getDamage() + 20));
		}else {
			p.setVida(p.getVida() - (super.getArma().getDamage()));
		}
		
	}

	@Override
	public void bloquear(Personaje p) {
		int bloqueo = p.getArma().getDamage() - inteligencia;
		this.setVida(super.getVida() + bloqueo);
		
	}


}
