package tema2.relacion25;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Amplia de nuevo el ejercicio anterior para calcular todos los días transcurridos desde el día de nacimiento al día actual. 
//		Hay que mostrar el nombre, el dia (dd-mm-aaaa) de nacimiento, el día actual (mismo formato) y el total de días transcurridos.
		
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int dia, mes, año;
		Date hoy = new Date();
        SimpleDateFormat formatoAño = new SimpleDateFormat("yyyy");
        int añoHoy = Integer.parseInt(formatoAño.format(hoy));
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
		
		System.out.printf("Te llamas %s y naciste el %02d-%02d-%d. Hoy es %02d-%02d-%d, así que han transcurrido %d días.", 
				nombre, dia, mes, año, diaHoy, mesHoy, añoHoy, (añoHoy-año)*365+(mesHoy-mes)*30+(diaHoy-dia));
		
		entrada.close();
	}

}
