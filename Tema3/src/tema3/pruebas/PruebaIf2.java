package tema3.pruebas;

/**
 * Simulación del limpiaparabrisas automático de un coche
 * El limpiaparabrisas sólo se activa cuando caen más de 30 gotas por segundo
 */
public class PruebaIf2 {

	public static void main(String[] args) {
		// Declaración de variables
		int gotasPorSegundo;

		// Inicialización y entrada de datos
		gotasPorSegundo = 33;

		// Procesamiento
		// Salida de resultados
		if (gotasPorSegundo >= 30) {
			System.out.println("Activando limpiaparabrisas");
		} else {
			System.out.println("Desactivando limpiaparabrisas");
		}

	}

}
