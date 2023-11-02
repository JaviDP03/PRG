package tema3.relacion33;

public class Ejercicio3 {
	/**
	 * El sorteo de la ONCE, la Lotería Nacional y otras apuestas más usan un
	 * sistema de números que se compone de cinco dígitos del 0 al 9, para generar
	 * números entre 00000 y 99999. Realiza un programa que genere una secuencia de
	 * 5 números aleatorios usando un bucle for() donde en cada iteración se genere
	 * un dígito distinto. Presenta esos 5 números consecutivamente en la misma
	 * línea.
	 */

	public static void main(String[] args) {
		// Resultado
		for (int i = 0; i < 5; i++) {
			System.out.print((int) (Math.random() * 100000) + " | ");
		}

	}

}
