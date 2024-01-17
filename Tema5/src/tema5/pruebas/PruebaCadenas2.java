package tema5.pruebas;

public class PruebaCadenas2 {

	public static void main(String[] args) {
		// StringBuilder es mutable. Es decir, se puede alterar al contrario que String.
		StringBuilder cadena;

		// Lo tengo que construir con su constructor específico
		cadena = new StringBuilder("En un lugar de La Mancha");

		// Tenemos disponibles diversos métodos que permiten manipular la cadena
		cadena.append(" de cuyo nombre no quiero acordarme");
		cadena.insert(12, "desconocido ");
		cadena.delete(2, 5);
		cadena.replace(27, 33, "Disco");

		System.out.println(cadena);

	}

}
