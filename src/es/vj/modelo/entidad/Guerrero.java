package es.vj.modelo.entidad;

public class Guerrero {

	private String nombre;
	private Arma arma;

	public Guerrero() {

	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getEspada() {
		return arma;
	}

	public void setEspada(Espada espada) {
		this.arma = espada;
	}

	public void atacar() {

		System.out.println("AAAAAAAAAAAAARGGG! LA FURIA DE " + nombre);
		arma.usar();
	}
}
