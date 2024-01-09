package tema5.relacion51;

/**
 * Escoger 5 números aleatorios de tipo byte (desde -128 a 127), almacenarlos en
 * un array y mostrarlos en orden inverso al asignado
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		byte[] numerosAleatorios = new byte[5];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = (byte) (Math.random() * 256 - 128);
		}

		for (int i = numerosAleatorios.length - 1; i >= 0; i--) {
			System.out.println(numerosAleatorios[i]);
		}
	}

}
