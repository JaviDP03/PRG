package tema9.ejemplos;

public class Caja {
	private Object objeto;

	public void guardar(Object objeto) {
		this.objeto = objeto;
	}

	public Object extraer() {
		return objeto;
	}

	public static void main(String[] args) {
		Caja miPaquete = new Caja();
		String unaCarta = "Contenido de la carta";
		String otraVariable;

		miPaquete.guardar(unaCarta);
		otraVariable = (String) miPaquete.extraer();

		System.out.println(otraVariable);
	}
}
