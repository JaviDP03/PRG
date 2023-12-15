package figuras.planas;

public class PruebaRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(5, 2, 5, 9);
		
		System.out.println(r1);
		System.out.printf("%.2f m2", r1.calcularArea());
	}

}
