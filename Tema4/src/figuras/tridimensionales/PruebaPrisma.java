package figuras.tridimensionales;

public class PruebaPrisma {

	public static void main(String[] args) {
		Prisma r1 = new Prisma(5, 2, 11, 5, 10, 7);
		
		System.out.println(r1);
		System.out.printf("%.2f m3", r1.calcularVolumen());
	}

}
