package tema3.pruebas;

/**
 * Simulación de una tómbola que tenga las siguientes recompensas:
 * A = premio categoría 1
 * B = premio categoría 2
 * C = premio categoría 3
 */
public class PruebaSwitch {

	public static void main(String[] args) {
		// Declaración de variables
		char resultadoPremio;

		// Inicialización y entrada de datos
		resultadoPremio = 'C';

		// Procesamiento
		// Salida de resultados
		switch (resultadoPremio) {
		case 'A':
			System.out.println("¡Has ganado un premio de categoría 1!");
			break;
		case 'B':
			System.out.println("¡Has ganado un premio de categoría 2!");
			break;
		case 'C':
			System.out.println("¡Has ganado un premio de categoría 3!");
			break;
		default:
			System.out.println("Vuelve a intentarlo. ¡Gracias por participar!");
			break;
		}

	}

}
