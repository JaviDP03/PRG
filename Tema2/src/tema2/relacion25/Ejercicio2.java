package tema2.relacion25;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Termina el ejercicio calculando los años que han transcurrido desde el año de nacimiento al año actual (variable anyoHoy en el código) y 
//		muestra los cuatro datos: nombre, año de nacimiento, año actual y años transcurridos.
		
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int dia, mes, año;
		Date hoy = new Date();
        SimpleDateFormat formatoAño = new SimpleDateFormat("yyyy");
        int anyoHoy = Integer.parseInt(formatoAño.format(hoy));
        
		
		System.out.println("Dime tu nombre:");
		nombre = entrada.nextLine();
		
		System.out.println("Dime tu fecha de nacimiento (dd mm aaaa):");
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		año = entrada.nextInt();
				
		System.out.printf("Te llamas %s y naciste en %d. Estamos en %d, así que han transcurrido %d años.", nombre, año, anyoHoy, anyoHoy-año);

		entrada.close();	
	}

}
