package tema9.ejemplos;

import java.time.LocalDate;

public class CajaGenerica<T> {
	private T objeto;

	public void guardar(T objeto) {
		this.objeto = objeto;
	}

	public T extraer() {
		return objeto;
	}

	public static void main(String[] args) {
		CajaGenerica<String> miPaquete = new CajaGenerica<>();
		CajaGenerica<LocalDate> miPaquete2 = new CajaGenerica<>();

		String unaCarta = "Contenido de la carta";
		String otraVariable;

		miPaquete.guardar(unaCarta);
		miPaquete2.guardar(LocalDate.of(2023, 10, 7));
		otraVariable = miPaquete.extraer();

		System.out.println(otraVariable);
	}
}
