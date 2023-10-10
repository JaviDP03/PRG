package pruebas;

public class Prueba1 {

	public static void main(String[] args) {
		int numeroAlumnos = 20;
		long premioLoteria = 2_200_000_000L;
		double radio, importe;
		final double IVA = 21;
		byte edad = 127;
		char letra = 'z'-1;
		String nombre = "Antonio José Manuel";
		
		numeroAlumnos = numeroAlumnos + 5;
		radio = 10.0/3;
		importe = 4E6;
		
		System.out.println(numeroAlumnos);
		System.out.println(radio);
		System.out.printf("%,.0f\n", importe);
		System.out.println(IVA);
		System.out.println(0xff);
		System.out.println(premioLoteria);
		System.out.println(edad);
		System.out.println(letra);
		System.out.println(nombre);
	}

}
