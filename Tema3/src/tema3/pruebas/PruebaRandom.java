package tema3.pruebas;

public class PruebaRandom {
	/**
	 * Sacar 10 números aleatorios del 1 al 20
	 */
	public static void main(String[] args) {
		int numeroAleatorio;

		for (int i = 0; i < 10; i++) {
			numeroAleatorio = (int) (Math.random() * 20 + 1);
			System.out.printf("%d\n", numeroAleatorio);
		}
	}

}
