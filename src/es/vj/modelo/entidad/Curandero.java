package es.vj.modelo.entidad;

public class Curandero extends Personaje{
	private int sabiduria;
	
	public Curandero(double vida,String nombre, Arma arma,int sabiduria) {
		super.setVida(vida);
		super.setArma(arma);
		super.setNombre(nombre);
		this.sabiduria = sabiduria;
		
	}

	@Override
	public void atacar(Personaje p) {
		if(super.getArma() instanceof Rezos) {
			super.getArma().setDamage(super.getArma().getDamage() + 10);
		}
		if(Math.round(Math.random()*6) == 6) {
			p.setVida(p.getVida() - (super.getArma().getDamage() + 20 + sabiduria));
		}else {
			p.setVida(p.getVida() - (super.getArma().getDamage()));
		}
		super.getArma().usar();
		
	}

	@Override
	public void bloquear(Personaje p) {
		int bloqueo = p.getArma().getDamage() - 5;
		this.setVida(super.getVida() + bloqueo);
		
	}


}
