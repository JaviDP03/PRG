package pruebas;

public class Prueba2 {

	public static void main(String[] args) {
		int edad = 18;
		int x=100, y=200;
		float z;
		
		z = ++x - --y + (x++ + y++);
		
		System.out.println(edad++);
		System.out.println(edad);
		System.out.println(z);
	}

}	
