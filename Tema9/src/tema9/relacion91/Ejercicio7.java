package tema9.relacion91;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio7 {

	public static void main(String[] args) {
		Set<Carta> listaCartas = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			listaCartas.add(new Carta(Carta.listaTipos[(int) (Math.random() * 3) + 1],
					Carta.listaNumeraciones[(int) (Math.random() * 11) + 1]));
		}
		
		for (Carta carta : listaCartas) {
			System.out.println(carta);
		}
	}

}
