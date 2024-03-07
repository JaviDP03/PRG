package tema8.practica81;

import java.io.IOException;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombreFichero = "/home/usuario/objetos.bin";
		EscritorVehiculos salida;
		LectorVehiculos entrada;

		// Declaramos un array con varios objetos
		Vehiculo[] listaVehiculos = { new Coche("Seat", "Panda", 2500, 150, 78),
				new Coche("Opel", "Zafira", 2250, 200, 90), new Moto("Scooter", "C100", 750, 50, "SecureCasco"),
				new Moto("Faggio", "F600", 800, 70, "Fiat") };

		// Creamos los flujos de lectura y escritura
		salida = new EscritorVehiculos(nombreFichero);
		entrada = new LectorVehiculos(nombreFichero);

		try {
			// Escribir en el fichero
			salida.abrir();
			for (Vehiculo unVehiculo : listaVehiculos) {
				salida.escribir(unVehiculo);
			}
			salida.cerrar();

			System.out.println("Se han grabado los objetos en el fichero.");
			System.out.println("Puedes comprobar el archivo " + nombreFichero);
			System.out.println("Pulsa Intro para continuar...");
			teclado.nextLine();

			// Leer del fichero
			System.out.println("Leyendo del fichero " + nombreFichero);
			System.out.println("---------------------------------------------------------");
			entrada.abrir();

			Vehiculo vehiculoLeido = entrada.leer();
			while (vehiculoLeido != null) {
				// instanceof devuelve con true si la variable contiene un objeto
				// de la clase indicada.
				if (vehiculoLeido instanceof Coche) {
					System.out.print("Coche leído del fichero: ");
				} else if (vehiculoLeido instanceof Moto) {
					System.out.print("Moto leída del fichero: ");
				}

				System.out.println(vehiculoLeido);
				vehiculoLeido = entrada.leer();
			}

			entrada.cerrar();
		} catch (IOException e) {
			System.err.println("ERROR: No se puede leer/escribir en el fichero.");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR: No se reconoce la clase leída.");
		}

		teclado.close();
	}

}
