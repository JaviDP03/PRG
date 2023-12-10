package tema4.practica42;

public class Ejercicio1 {

	public static void main(String[] args) {
		Bebida c1, c2, c3, c4;
		c1 = new Bebida();
		c1.ponerCafe(100);
		c1.ponerDescafeinado(100);
		System.out.println("Preparación 1: " + c1);
		c2 = new Bebida();
		c2.ponerCafe(85);
		c2.ponerDesnatada(15);
		c2.ponerLeche(15);
		System.out.println("Preparación 2: " + c2);
		c3 = new Bebida();
		c3.ponerCafe(60);
		c3.ponerLeche(40);
		System.out.println("Preparación 3: " + c3);
		c4 = new Bebida();
		c4.ponerDescafeinado(15);
		c4.ponerDesnatada(85);
		System.out.println("Preparación 2: " + c4);
	}

}
