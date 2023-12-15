package figuras.tridimensionales;

public class PruebaEsfera {
	
	public static void main(String[] args) {
		Esfera e1 = new Esfera(8, 2, 6, 7);
		
		System.out.println(e1);
		System.out.printf("%.2f m3", e1.calcularVolumen());
	}
}
