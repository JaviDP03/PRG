package tema2.relacion22;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Crea un programa con dos tipos de datos enumerados para las siguientes listas: (1) Otoño, Invierno, Primavera y Verano; 
		 * (2) África, América, Asia, Europa y Oceanía. Asigna de cada lista un valor a una variable y otro a otra variable. 
		 * Muestra por pantalla esos valores. Sin borrar lo anterior, vuelve a asignar en líneas por debajo dos nuevos valores y muéstralos por pantalla. */
		
		enum Estaciones {Otoño, Invierno, Primavera, Verano};
		enum Continentes {África, América, Asia, Europa, Oceanía};
		
		Estaciones estacion1 = Estaciones.Otoño;
		Continentes continente1 = Continentes.Europa;
		
		System.out.println("La estación en " + continente1 + " es " + estacion1 + ".");
		
		Estaciones estacion2 = Estaciones.Primavera;
		Continentes continente2 = Continentes.Oceanía;
		
		System.out.println("La estación en " + continente2 + " es " + estacion2 + ".");
	}

}
