package tema4.pruebas;

public class PruebaCoche {
	public static void main(String[] args) {
		Coche c1 = new Coche(100, 10, 10);
		Coche c2 = new Coche(50, 1, 1);
		Coche c3 = new Coche(77, 20, 20);
		
		String info;
				
		System.out.println(c1);
		
		c1.setSentido(Coche.SentidoMarcha.ATRAS);
		System.out.println(c1.getSentido());
		
		System.out.printf("El objeto es: %s\n", c1);
	}
}
