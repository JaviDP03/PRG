package tema3.pruebas;

/**
 * Simulación del limpiaparabrisas automático de un coche
 * El limpiaparabrisas se activa de la siguiente forma:
 *  0 - 30 g/s PARADO
 * 31 - 60 g/s Velocidad LENTA
 * 61 - 90 g/s Velocidad MEDIA
 * 91 -    g/s Velocidad RAPIDA
 */
public class PruebaIf3 {

	public static void main(String[] args) {
		// Declaración de variables
		int gotasPorSegundo;

		// Inicialización y entrada de datos
		gotasPorSegundo = 100;

		// Procesamiento
		// Salida de resultados
		if (gotasPorSegundo > 30 && gotasPorSegundo <=60) {
			System.out.println("Activando limpiaparabrisas a velocidad LENTA");
		} else if (gotasPorSegundo > 60 && gotasPorSegundo <=90){
			System.out.println("Activando limpiaparabrisas a velocidad MEDIA");
		} else if (gotasPorSegundo > 90) {
			System.out.println("Activando limpiaparabrisas a velocidad RAPIDA");
		} else {
			System.out.println("Desactivando limpiaparabrisas");
		}

	}

}
