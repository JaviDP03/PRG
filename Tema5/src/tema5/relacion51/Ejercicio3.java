package tema5.relacion51;

/**
 * Crear dos tablas de 10 números aleatorios byte y mezclarlas en una tercera
 * tabla de tamaño 20 de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de
 * B, etc.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		byte[] tabla1 = new byte[10];
		byte[] tabla2 = new byte[10];
		byte[][] tabla3 = new byte[2][10];

		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = (byte) (Math.random() * 255 - 128);
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = (byte) (Math.random() * 255 - 128);
		}
		
		for (int i = 0; i < tabla1.length; i++) {
			tabla3[0][i] = tabla1[i];
			tabla3[1][i] = tabla2[i];
		}
		
		System.out.printf("%4s%5s\n", "A", "B");
		for (int i = 0; i < tabla3[0].length; i++) {
			for (int j = 0; j < tabla3.length; j++) {
				System.out.printf("%4d ", tabla3[j][i]);
			}
			System.out.println();
		}
	}

}
