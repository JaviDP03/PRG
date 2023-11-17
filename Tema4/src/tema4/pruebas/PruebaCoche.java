package tema4.pruebas;

public class PruebaCoche {
	public static void main(String[] args) {
		Coche c1 = new Coche(10, 10, 100);
		Coche c2 = new Coche(1, 1, 50);
		Coche c3 = new Coche(20, 20, 77);
		
		String info;
		
		c1.litrosCombustible = 18;
		info = c1.comoCadena();
		
		System.out.println(info);
		
		c1.avanzar();
		System.out.println(c1.comoCadena());
	}
}
