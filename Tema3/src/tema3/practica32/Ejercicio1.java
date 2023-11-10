package tema3.practica32;

public class Ejercicio1 {
	/**
	 * Escribe un programa que genere fechas al azar con el formato 25 de enero de
	 * 2013. Se tendrán en cuenta las siguientes restricciones: 
	 * - El día será un número del 1 al 28, 29, 30 o 31 (según el mes). 
	 * - El mes aparecerá en formato escrito: enero, febrero, marzo... 
	 * - El año debe variar entre 1960 y 2060.
	 */
	public static void main(String[] args) {
		// Introducción de variables
		int dia, mes, año;

		// Inicialización
		mes = (int) (Math.random() * 12 + 1);
		año = (int) (Math.random() * 101 + 1960);
		
		// Resultado
		switch (mes) {
		case 1:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de enero de %d", dia, año);
			break;
			
		case 2:
			dia = (int) (Math.random()*28+1);
			System.out.printf("%d de febrero de %d", dia, año);
			break;
			
		case 3:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de marzo de %d", dia, año);
			break;
			
		case 4:
			dia = (int) (Math.random()*30+1);
			System.out.printf("%d de abril de %d", dia, año);
			break;
			
		case 5:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de mayo de %d", dia, año);
			break;
			
		case 6:
			dia = (int) (Math.random()*30+1);
			System.out.printf("%d de junio de %d", dia, año);
			break;
			
		case 7:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de julio de %d", dia, año);
			break;
			
		case 8:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de agosto de %d", dia, año);
			break;
			
		case 9:
			dia = (int) (Math.random()*30+1);
			System.out.printf("%d de septiembre de %d", dia, año);
			break;
			
		case 10:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de octubre de %d", dia, año);
			break;
		case 11:
			dia = (int) (Math.random()*30+1);
			System.out.printf("%d de noviembre de %d", dia, año);
			break;
			
		case 12:
			dia = (int) (Math.random()*31+1);
			System.out.printf("%d de diciembre de %d", dia, año);
			break;
		}
		
	}

}
