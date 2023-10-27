package tema3.pruebas;

import java.util.Scanner;

/**
 * Simulación de un videjuego. Dependiendo de la gema que capture el personaje, ocurrirá:
 * AZUL = sube la vida al 100% y balas infinitas
 * ROJA = sube la vida al 100%
 * otra = no sube nada
 */
public class PruebaSwitch2 {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner entrada = new Scanner(System.in);
		String colorGema;

		// Inicialización y entrada de datos
		System.out.println("¿De qué color es la gema que has recogido?:");
		colorGema = entrada.nextLine();
		
		// Procesamiento
		// Salida de resultados
		switch (colorGema.toUpperCase()) {
		case "AZUL":
			System.out.println("Restauras tu vida al 100% y gozas de munición infinita");
			break;
		case "ROJA":
			System.out.println("Restauras tu vida al 100%");
			break;
		default:
			System.out.println("No tiene ningún efecto");
			break;
		}
		
		//Liberamos el scanner
		entrada.close();

	}

}
