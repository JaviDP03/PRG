package tema6.practica2.utilidades;

public class Generador {
	// Propiedades de la instancia
	private static String[] listaNombres = { "Sal", "Pimiento", "Chorizo", "Harina", "Levadura", "Tomate", "Pepino", "Aceite" };

	// Métodos
	public static String nuevoCodigo() {
		char letra = (char) (Math.random() * 25 + 65);
		int numero1 = (int) (Math.random() * 10);
		int numero2 = (int) (Math.random() * 10);
		int numero3 = (int) (Math.random() * 10);

		return String.format("%s-%d%d%d", letra, numero1, numero2, numero3);
	}

	public static String nuevoNombre() {
		int numeroAleatorio = (int) (Math.random() * 8);

		return listaNombres[numeroAleatorio];
	}

	public static int nuevoPeso() {
		return (int) (Math.random() * 201 + 1);
	}
}
