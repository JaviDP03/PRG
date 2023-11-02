package tema3.pruebas;

public class PruebaRandom3 {
	/**
	 * Sacar 10 números aleatorios del 78 al 137
	 */
	public static void main(String[] args) {
		int numeroAleatorio;

		for (int i = 0; i < 10; i++) {
			numeroAleatorio = (int) (Math.random() * 60 + 78);
			System.out.printf("%d\n", numeroAleatorio);
		}
	}

}
