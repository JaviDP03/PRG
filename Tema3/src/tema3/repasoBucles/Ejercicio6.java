package tema3.repasoBucles;

public class Ejercicio6 {
	/**
	 * Del siguiente String "La lluvia en Sevilla es una maravilla" cuenta cuantas
	 * vocales hay en total (recorre el String con charAt)
	 */
	public static void main(String[] args) {
		// Introducción de variables
		String oracion;
		char letra;
		int contador;
		
		// Inicialización
		oracion = "La lluvia en Sevilla es una maravilla";
		
		contador = 0;

		// Resultado
		for (int i = 0; i < oracion.length(); i++) {
			letra = oracion.toLowerCase().charAt(i);
			
			switch (letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				contador++;
				break;
			}
		}
		
		System.out.println("La oración tiene " + contador + " vocales");

	}

}
