package navidad;

public class Navidad {

	public static void main(String[] args) {
		Trineo t1 = new Trineo(3);
		Trineo t2 = new Trineo(3);
		
		System.out.println("Comprobando el trineo 1...\n---");
		t1.añadirRegalo("Ajedrez");
		t1.añadirRegalo("Parchís");
		t1.añadirRegalo("Pelota");
		t1.añadirRegalo("Carbón");
		
		System.out.println("El regalo 2 del trineo 1 es: " + t1.getRegalo(2));
		System.out.println(t1 + "\n");
		
		t1.quitarRegalo(2);
		System.out.println("El regalo 2 del trineo 1 es: " + t1.getRegalo(2));
		System.out.println(t1 + "\n");
		
		t1.quitarRegalo(2);
		System.out.println("El regalo 2 del trineo 1 es: " + t1.getRegalo(2));
		System.out.println(t1 + "\n");
		
		System.out.println("\nComprobando el trineo 2...\n---");
		t2.añadirRegalo("Muñeca");
		t2.añadirRegalo("Coche");
		
		System.out.println("Cambiando muñeca hacendado por una Barbie");
		System.out.println(t2);
		t2.quitarRegalo(0);
		t2.añadirRegalo("Barbie");
		System.out.println(t2 + "\n");
		
	}

}
