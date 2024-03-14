package tema9.relacion91;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio8 {

	public static void main(String[] args) {
		Set<Carta> listaCartas = new TreeSet<>();

		for (int i = 0; i < 10; i++) {
			listaCartas.add(new Carta(Carta.listaTipos[(int) (Math.random() * 4)],
					Carta.listaNumeraciones[(int) (Math.random() * 12)]));
		}

		for (Carta carta : listaCartas) {
			System.out.println(carta);
		}
	}

}
