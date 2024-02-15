package tema7.tarea71;

public class Tarea71 {

	public static void main(String[] args) {
		Rectangulo[] listaRectangulos = new Rectangulo[6];
		try {			
			listaRectangulos[0] = new Rectangulo(3, 2, 8, 5);
			System.out.println(listaRectangulos[0]);
			
			listaRectangulos[1] = new Rectangulo(2, 1, 6, 5);
			System.out.println(listaRectangulos[1]);
			
			listaRectangulos[2] = new Rectangulo(6, 4, 8, 9);
			System.out.println(listaRectangulos[2]);
			
			listaRectangulos[3] = new Rectangulo(3, 3, 5, 5);
			System.out.println(listaRectangulos[3]);
			
			listaRectangulos[4] = new Rectangulo(1, 1, 5, 6);
			System.out.println(listaRectangulos[4]);
			
			listaRectangulos[5] = new Rectangulo(7, 2, 9, 9);
			System.out.println(listaRectangulos[5]);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
