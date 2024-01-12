package tema5.resumen;

/**
 * Crea un array de 10 elementos de tipo double y asígnale directamente en el
 * código 10 valores cualesquiera, unos con decimales y otros sin ellos. Al
 * final del programa debes mostrar con 10 instrucciones printf() todos los
 * valores del array, pero con 2 posiciones decimales.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		double[] numerosDecimales = {65.12, 2.111, 90, 6.66, 5, 99, 210, 111.001, 01.2, 777};
		
		System.out.printf("%.2f\n", numerosDecimales[0]);
		System.out.printf("%.2f\n", numerosDecimales[1]);
		System.out.printf("%.2f\n", numerosDecimales[2]);
		System.out.printf("%.2f\n", numerosDecimales[3]);
		System.out.printf("%.2f\n", numerosDecimales[4]);
		System.out.printf("%.2f\n", numerosDecimales[5]);
		System.out.printf("%.2f\n", numerosDecimales[6]);
		System.out.printf("%.2f\n", numerosDecimales[7]);
		System.out.printf("%.2f\n", numerosDecimales[8]);
		System.out.printf("%.2f\n", numerosDecimales[9]);

	}

}
