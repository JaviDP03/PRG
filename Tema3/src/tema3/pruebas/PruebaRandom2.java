package tema3.pruebas;

public class PruebaRandom2 {
	/**
	 * Sacar 10 números aleatorios del -128 al 127
	 */
	public static void main(String[] args) {
		byte numeroAleatorio;

		for (int i = 0; i < 10; i++) {
			numeroAleatorio = (byte) (Math.random() * 256 - 128);
			System.out.printf("%d\n", numeroAleatorio);
		}
	}

}
