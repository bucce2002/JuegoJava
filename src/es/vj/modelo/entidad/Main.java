package es.vj.modelo.entidad;

public class Main {

	public static void main(String[] args) {
		
		Arma a1 = new Espada(40);
		Personaje g1 = new Guerrero(150,null, a1,4);
		Personaje g2 = new Guerrero(150,null, a1,7);
		g1.setNombre("Conan");
		
		g1.setArma(a1);
		g1.atacar(g2);
		System.out.println(g1.getVida());
		System.out.println(g2.getVida());
		
		
		System.out.println("");

		
		g2.setNombre("Legolas");
		Arma a2 = new Arco();
		g2.setArma(a2);
		g2.atacar(g1);
		System.out.println(g1.getVida());
		System.out.println(g2.getVida());
	}

}
