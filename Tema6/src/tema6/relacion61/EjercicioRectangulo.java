package tema6.relacion61;

public class EjercicioRectangulo {

	public static void main(String[] args) {
		// Creación de rectángulos
		Rectangulo r1 = new Rectangulo();
		System.out.println(r1);

		Rectangulo r2 = new Rectangulo("rectangulo2");
		System.out.println(r2);
		
		Rectangulo r3 = new Rectangulo(5, 3);
		System.out.println(r3);
		
		Rectangulo r4 = new Rectangulo(2, 10, "rectangulo4");
		System.out.println(r4);
		
		Rectangulo r5 = new Rectangulo(5, 5, 8, 1);
		System.out.println(r5);
		
		Rectangulo r6 = new Rectangulo(1, 7, 2, 5, "rectangulo6");
		System.out.println(r6);
		
		// Uso de métodos
		System.out.println(Rectangulo.obtenerNumeroDeRectangulos());
		
		System.out.println(r2.getNombre());
		
		r1.setNombre("rectangulo1");
		
		System.out.println(r4.calcularSuperficie());
		
		System.out.println(r3.calcularPerimetro());
		
		r6.desplazar(4, 7);
	}

}
