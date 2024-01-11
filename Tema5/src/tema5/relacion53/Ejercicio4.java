package tema5.relacion53;

/**
 * Necesitamos almacenar las temperaturas (con decimales) máximas y mínimas de
 * un lugar durante todos los días del año (no es necesario controlar los
 * bisiestos). Usa una matriz donde las filas sean los meses y las columnas los
 * días dentro del mes. No se permite usar 12 líneas de definición de tamaño
 * para la segunda dimensión (la de columnas) sino que hay que hacerlo con el
 * tamaño de cada mes obtenido.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] mesesNombre = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		double[][] temperaturas = new double[meses.length][meses[0]];

		System.out.printf("%17s", "");
		for (int i = 0; i < temperaturas[0].length; i++) {
			System.out.printf("%-9d", i + 1);
		}
		System.out.println();
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.printf("%-12s", mesesNombre[i]);
			for (int j = 0; j < temperaturas[i].length; j++) {
				temperaturas[i][j] = (double) (Math.random() * 60) - 20;
				System.out.printf("%7.1fºC", temperaturas[i][j]);
			}
			System.out.println();
		}
	}

}
