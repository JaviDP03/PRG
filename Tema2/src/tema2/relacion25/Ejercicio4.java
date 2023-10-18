package tema2.relacion25;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Amplia el ejercicio 2 para indicar al usuario si la fecha de nacimiento es de un día y mes que ya ha pasado en el año actual o no, usando el operador terciario ?.
		
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int dia, mes, año;
		Date hoy = new Date();
        SimpleDateFormat formatoAño = new SimpleDateFormat("yyyy");
        int anyoHoy = Integer.parseInt(formatoAño.format(hoy));
        SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
        int mesHoy = Integer.parseInt(formatoMes.format(hoy));
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd");
        int diaHoy = Integer.parseInt(formatoDia.format(hoy));
		
		System.out.println("Dime tu nombre:");
		nombre = entrada.nextLine();
		
		System.out.println("Dime tu fecha de nacimiento (dd mm aaaa):");
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		año = entrada.nextInt();
		
		String cumpleaños;
		cumpleaños = (mesHoy > mes) || (diaHoy > dia) ? "HA PASADO YA" : "NO HA PASADO AÚN";
		
		System.out.printf("Te llamas %s y naciste en %d. Estamos en %d, así que han transcurrido %d años. Tu cumpleaños %s en este año %d.", 
				nombre, año, anyoHoy, anyoHoy-año, cumpleaños, anyoHoy);
		
		entrada.close();
	}

}
