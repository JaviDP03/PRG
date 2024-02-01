package tema6.relacion64;

import java.util.Scanner;

public class EjercicioPassword {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Longitud del array
		System.out.println("Introduce la longitud de la lista de contraseñas:");
		Password[] listaContraseñas = new Password[Integer.parseInt(entrada.nextLine())];
		
		// Longitud de las contraseñas
		System.out.println("Introduce la longitud de las contraseñas:");
		int longitud = Integer.parseInt(entrada.nextLine());
		
		// Creación de las contraseñas
		for (int i = 0; i < listaContraseñas.length; i++) {
			listaContraseñas[i] = new Password(longitud);
		}
		
		// Creación del array boolean
		boolean[] listaContraseñasFuertes = new boolean[listaContraseñas.length];
		for (int i = 0; i < listaContraseñasFuertes.length; i++) {
			listaContraseñasFuertes[i] = listaContraseñas[i].esFuerte();
		}
		
		// Imprimir resultado
		for (int i = 0; i < listaContraseñas.length; i++) {
			System.out.printf("%s  %b\n", listaContraseñas[i], listaContraseñasFuertes[i]);
		}
		
		entrada.close();
	}

}
