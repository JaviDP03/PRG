package tema4.pruebas;

import tema4.pruebas.Coche.SentidoMarcha;

public class PruebaCoche2 {
	public static void main(String[] args) {
		Coche c1 = new Coche (100, 2, 3);
		
		System.out.println(c1);
		c1.acelerar();
		c1.acelerar();
		
		c1.setOrientacion(270);
		c1.setSentido(SentidoMarcha.ATRAS);
		
		c1.avanzar();
		System.out.println(c1);
	}
}
