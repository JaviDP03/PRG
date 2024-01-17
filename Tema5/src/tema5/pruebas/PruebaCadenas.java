package tema5.pruebas;

public class PruebaCadenas {

	public static void main(String[] args) {
		String c1 = "Una cadena";
		String c2 = new String("Otra cadena");
		String c3 = "Un trozo " + "otro trozo";

		System.out.println(c3);

		c3 = "Hola ".concat("Don Pepito");

		System.out.println(c3);

		c3 = "Hola";
		c3 = c3.concat(" Manuel");

		System.out.println(c3);

		c3 = "Edad: " + 5;

		System.out.println(c3);

		c3.length(); // Longitud de la cadena (número de caracteres)
		c3.charAt(0); // Devuelve el carácter en la posición indicada
		System.out.println(c3.substring(3)); // Devuelve la subcadena desde la posición indicada
		System.out.println(c3.substring(2, 5)); // Devuelve la subcadena entre las posiciones indicadas

		// Conversión entre cadena y otros tipos de datos
		// valueOf() toma una cadena y la convierte el primitivo de la clase que recibe
		// la llamada
		int a = Integer.valueOf("5");
		double b = Double.valueOf(5.0);
		boolean c = Boolean.valueOf("true");

		// Los métodos parse son una mejora de los métodos valueOf porque permiten
		// manejar excepciones
		a = Integer.parseInt("5");
		b = Double.parseDouble("5.0");
		c = Boolean.parseBoolean("true");

		// Conversión de primitivos a String
		c3 = "" + 5;
		c3 = "" + 5.0;
		c3 = "" + true;

		Integer entero = 5;
		c3 = entero.toString();

		// Método String.format()
		// Funciona de manera similar a printf();
		c3 = String.format("Entero = %d, Doble = %.2f, Booleana = %s\n", a, b, c);
		System.out.println(c3);

		// equals(), equalsIgnoreCase() para comparar. No usar nunca == con String.

		// compareTo(), compareToIgnoreCase()
		// Comparación lexicográfica (orden alfabético)
		System.out.println("arahal".compareTo("ecija")); // < 0
		System.out.println("ecija".compareTo("ecija")); // = 0
		System.out.println("ecija".compareTo("arahal")); // > 0

		// trim() recorta espacios en blanco antes y después
		c3 = "   \t\t  hola \t\t     \t";
		System.out.printf("[%s]\n", c3.trim());

		// indexOf() me dice en qué posición está una cadena
		c3 = "En un lugar de la Mancha de cuyo";
		System.out.println("Posición: " + c3.indexOf("Mancha"));
		System.out.println("Posición: " + c3.indexOf("de", 18));

		// contains()
		System.out.println(c3.contains("Quijote"));

		// startsWith() y endsWith()
		System.out.println(c3.startsWith("En"));
		System.out.println(c3.endsWith("cuyo"));

		// replace()
		System.out.println(c3.replace("Mancha", "Disco"));
	}

}
