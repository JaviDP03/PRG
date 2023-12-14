package tema4.practica41;

public class Ejercicio2 {

	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(1, 20, 30);
		Tiempo t2 = new Tiempo(17, 52, 11);
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println();
		
		t1.sumar(2, 30, 50);
		t2.sumar(17, 30, 27);
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println();
		
		t1.restar(2, 3, 44);
		t2.restar(1, 12, 33);
		
		System.out.println(t1);
		System.out.println(t2);
	}

}
