package tema2.pruebas;

public class Prueba3 {

	public static void main(String[] args) {
		String cadena1 = "En un lugar de la Mancha...";
		String cadena2 = "lugar";
		String cadena3 = "luga";
		String resultado;
		String resultado2;
		
		cadena3 += "r";
		
		resultado = cadena2.equals(cadena3) ? "Iguales" : "Distintas";
		resultado2 = cadena2.compareTo(cadena3) == 0 ? "Iguales" : "Distintas";
		
		System.out.println(cadena2 + " -- " + cadena3);
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(cadena1.length());
		System.out.println(cadena1.length());
		System.out.println(cadena1.toUpperCase());
	}

}
