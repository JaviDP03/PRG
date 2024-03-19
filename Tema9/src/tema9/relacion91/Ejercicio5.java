package tema9.relacion91;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá "Ha accedido al área restringida". El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá "Lo siento, no tiene acceso al área restringida". Los
 * nombres de usuario con sus correspondientes contraseñas deben estar
 * almacenados en una estructura de la clase HashMap.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Map<String, String> listaUsuarios = new HashMap<>();
		int contadorIntentos = 0;
		String usuario, contraseña;
		
		listaUsuarios.put("pepito", "PepitoEsElMejor");
		
		do {
			System.out.println("Introduce tu usuario y contraseña:");
			System.out.print("Usuario: ");
			usuario = entrada.nextLine();
			
			System.out.print("Contraseña: ");
			contraseña = entrada.nextLine();
			
			if (listaUsuarios.containsKey(usuario)) {
				if (listaUsuarios.get(usuario).equals(contraseña)) {
					System.out.println("Ha accedido al área restringida");
					break;
				} else {
					System.out.println("Usuario o Contraseña incorrecto/s");
					contadorIntentos++;
				}
			} else {
				System.out.println("Usuario o Contraseña incorrecto/s");
				contadorIntentos++;
			}
		} while (contadorIntentos != 3);
		
		if (contadorIntentos == 3) {
			System.out.println("Lo siento, no tiene acceso al área restringida");
		}
		
		entrada.close();
	}

}
