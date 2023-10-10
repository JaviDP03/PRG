package tema2.relacion21;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Amplia el programa anterior para que añada al total de la factura el IVA (valor constante de 21). 
		 * Define y usa una variable constante.*/
		
		double precioTeclado = 29.99;
		int cantidadTeclado = 5;
		double precioRaton = 14.99;
		int cantidadRaton = 12;
		final double IVA = 0.21;
		
		System.out.println("FACTURA");
		System.out.println("----------------------------------");
		System.out.printf("Teclado: %d x %.2f = %.2f\n", cantidadTeclado, precioTeclado, cantidadTeclado * precioTeclado);
		System.out.printf("Ratón: %d x %.2f = %.2f\n", cantidadRaton, precioRaton, cantidadRaton * precioRaton);
		System.out.printf("Subtotal: %.2f\n", cantidadTeclado * precioTeclado + cantidadRaton * precioRaton);
		System.out.printf("Total: %.2f", cantidadTeclado * precioTeclado + cantidadRaton * precioRaton + 
				(cantidadTeclado * precioTeclado + cantidadRaton * precioRaton)*IVA);
	}

}
