package tema2.relacion21;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Escribe un programa que calcule el total de una factura a partir del precio y cantidad, 
		 * que estarán almacenadas previamente en variables.*/
		
		double precioTeclado = 29.99;
		int cantidadTeclado = 5;
		double precioRaton = 14.99;
		int cantidadRaton = 12;
		
		System.out.println("FACTURA");
		System.out.println("----------------------------------");
		System.out.printf("Teclado: %d x %.2f = %.2f\n", cantidadTeclado, precioTeclado, cantidadTeclado * precioTeclado);
		System.out.printf("Ratón: %d x %.2f = %.2f\n", cantidadRaton, precioRaton, cantidadRaton * precioRaton);
		System.out.printf("Total: %.2f", cantidadTeclado * precioTeclado + cantidadRaton * precioRaton);
	}

}
