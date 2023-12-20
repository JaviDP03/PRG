package tema5.relacion51;

/**
 * Crear un array de 5 números aleatorios de tipo byte. La aplicación debe
 * indicarnos si los números están ordenados de forma creciente, decreciente, o
 * si están desordenados.
 */
public class Ejercicio4 {
	public static boolean esCreciente(byte[] numeros) {
		for (int i = 0; i < numeros.length - 1; i++) {
			if (numeros[i] > numeros[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean esDecreciente(byte[] numeros) {
		for (int i = 0; i < numeros.length - 1; i++) {
			if (numeros[i] < numeros[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		byte[] numerosAleatorios = new byte[5];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (byte) (Math.random() * 255 - 128);
		}

		for (byte b : numerosAleatorios) {
			System.out.print(b + " ");
		}

		System.out.println();

		if (esCreciente(numerosAleatorios)) {
			System.out.println("Orden creciente");
		} else if (esDecreciente(numerosAleatorios)) {
			System.out.println("Orden decreciente");
		} else {
			System.out.println("Desordenado");
		}
	}

}
