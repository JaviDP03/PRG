package tema9.relacion92;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Map<String, String> diccionarioCapitales = new HashMap<>();
		String pais;

		diccionarioCapitales.put("España", "Madrid");
		diccionarioCapitales.put("Portugal", "Lisboa");
		diccionarioCapitales.put("Francia", "París");

		do {
			System.out.print("Escribe el nombre de una país y te diré su capital: ");
			pais = teclado.nextLine();

			if (diccionarioCapitales.containsKey(pais)) {
				System.out.printf("La capital de %s es %s\n", pais, diccionarioCapitales.get(pais));
			} else {
				if (!pais.equalsIgnoreCase("salir")) {
					System.out.printf("No conozco la respuesta, ¿cuál es la capital de %s?: ", pais);
					diccionarioCapitales.put(pais, teclado.nextLine());
					System.out.println("Gracias por enseñarme nuevas capitales");
				}
			}
		} while (!pais.equalsIgnoreCase("salir"));

		teclado.close();
	}

}
