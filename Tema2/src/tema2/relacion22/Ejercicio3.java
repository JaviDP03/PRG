package tema2.relacion22;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Para tipos de datos carácter tenemos un tipo de dato primitivo y otro referencia. 
		 * Crea cuatro variables de tipo carácter primitivo, inicializándolas a los valores -h-, -o-, -l- y -a-. 
		 * A continuación, crea una variable String con valor inicial -mundo-. Muestra por pantalla las cuatro variables de tipo primitivo y por detrás la variable String. */
		
		char letra1 = 'h';
		char letra2 = 'o';
		char letra3 = 'l';
		char letra4 = 'a';
		String texto = "mundo";
		
		System.out.printf("%s%s%s%s %s", letra1, letra2, letra3, letra4, texto);
	}

}
