package tema4.practica41;

public class Ejercicio1 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("0-7645-2641-3", "El Lazarillo de Tormes", "Anónimo", 5);
		Libro libro2 = new Libro("0-1234-7543-1", "La Celestina", "Paco Sanz", 7);
		Libro libro3 = new Libro("0-8956-5462-9", "Historia de una escalera", "Pepe González", 3);
		
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		
		System.out.println();
		
		libro1.solicitarPrestamo(5);
		libro2.solicitarPrestamo(5);
		libro3.solicitarPrestamo(5);
		
		System.out.println();
		
		libro1.realizarDevolucion(3);
		libro2.realizarDevolucion(3);
		libro3.realizarDevolucion(3);
		
		System.out.println();
		
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
	}
	
}
