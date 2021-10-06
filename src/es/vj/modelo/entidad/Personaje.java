package es.vj.modelo.entidad;

public abstract class Personaje {
	
	private String nombre;
	private Arma arma;
	private double vida;
	
	public abstract void atacar(Personaje p);
	public abstract void bloquear(Personaje p);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}


}
