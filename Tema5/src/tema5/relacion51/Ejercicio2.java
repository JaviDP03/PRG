package tema5.relacion51;

/**
 * Crear una tabla (array) con 10 números aleatorios de tipo byte. Debemos
 * mostrarlos en el siguiente orden: el primero, el último, el segundo, el
 * penúltimo, el tercero, etc.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		byte[] numerosAleatorios = new byte[10];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (byte) (Math.random() * 255 - 128);
		}

		int inverso = numerosAleatorios.length - 1;
		for (int i = 0; i < numerosAleatorios.length / 2; i++) {
			System.out.printf("%d %d ", numerosAleatorios[i], numerosAleatorios[inverso]);
			inverso--;
		}
	}

}
