package tema9.relacion91;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

	public static void main(String[] args) {
		List<Moneda> listaMonedas = new ArrayList<>();
		Moneda monedaTemporal;
		int contador = 1;

		listaMonedas.add(generarMoneda());
		while (contador < 6) {
			monedaTemporal = generarMoneda();
			if (listaMonedas.get(contador - 1).getNombre().equals(monedaTemporal.getNombre())
					|| listaMonedas.get(contador - 1).getOrientacion().equals(monedaTemporal.getOrientacion())) {
				listaMonedas.add(monedaTemporal);

				contador++;
			}
		}

		for (Moneda moneda : listaMonedas) {
			System.out.println(moneda);
		}

	}

	public static Moneda generarMoneda() {
		Moneda monedaTemporal = new Moneda(null, null);
		int numeroAleatorioMoneda = 0;
		int numeroAleatorioLado = 0;

		numeroAleatorioMoneda = (int) (Math.random() * 8 + 1);
		numeroAleatorioLado = (int) (Math.random() * 2 + 1);

		switch (numeroAleatorioMoneda) {
		case 1:
			monedaTemporal.setNombre("1 céntimo");
			break;
		case 2:
			monedaTemporal.setNombre("2 céntimos");
			break;
		case 3:
			monedaTemporal.setNombre("5 céntimos");
			break;
		case 4:
			monedaTemporal.setNombre("10 céntimos");
			break;
		case 5:
			monedaTemporal.setNombre("20 céntimos");
			break;
		case 6:
			monedaTemporal.setNombre("50 céntimos");
			break;
		case 7:
			monedaTemporal.setNombre("1 euro");
			break;
		case 8:
			monedaTemporal.setNombre("2 euros");
			break;
		}

		switch (numeroAleatorioLado) {
		case 1:
			monedaTemporal.setOrientacion("cara");
			break;
		case 2:
			monedaTemporal.setOrientacion("cruz");
			break;
		}

		return monedaTemporal;
	}
}
