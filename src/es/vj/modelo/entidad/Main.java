package es.vj.modelo.entidad;

public class Main {

	public static void main(String[] args) {

		Guerrero g1 = new Guerrero();
		g1.setNombre("Conan");
		Arma a1 = new Espada();
		g1.setArma(a1);
		g1.atacar();
		
		System.out.println("");

		Guerrero g2 = new Guerrero();
		g2.setNombre("Legolas");
		Arma a2 = new Arco();
		g2.setArma(a2);
		g2.atacar();
	}

}
