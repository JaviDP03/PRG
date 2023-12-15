package figuras.planas;

public class PruebaCirculo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(5, 7, 2);
		
		System.out.println(c1);
		System.out.printf("%.2f m2", c1.calcularArea());
	}

}
