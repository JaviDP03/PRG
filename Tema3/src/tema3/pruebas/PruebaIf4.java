package tema3.pruebas;

/**
 * Simulación de una tómbola que tenga las siguientes recompensas:
 * A = premio categoría 1
 * B = premio categoría 2
 * C = premio categoría 3
 */
public class PruebaIf4 {

	public static void main(String[] args) {
		// Declaración de variables
		char resultadoPremio;

		// Inicialización y entrada de datos
		resultadoPremio = 'B';

		// Procesamiento
		// Salida de resultados
		if (resultadoPremio == 'A') {
			System.out.println("¡Has ganado un premio de categoría 1!");
		} else if (resultadoPremio == 'B'){
			System.out.println("¡Has ganado un premio de categoría 2!");
		} else if (resultadoPremio == 'C') {
			System.out.println("¡Has ganado un premio de categoría 3!");
		} else {
			System.out.println("Vuelve a intentarlo. ¡Gracias por participar!");
		}

	}

}
