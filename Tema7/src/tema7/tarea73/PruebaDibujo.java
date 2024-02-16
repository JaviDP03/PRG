package tema7.tarea73;

public class PruebaDibujo {

	public static void main(String[] args) {
		Dibujo[] listaRectangulos = new Rectangulo[3];
		listaRectangulos[0] = new Rectangulo(4, 2, 7, 5);
		listaRectangulos[1] = new Rectangulo(1, 2, 5, 6);
		listaRectangulos[2] = new Rectangulo(6, 1, 3, 9);
		
		System.out.println(listaRectangulos[0].calcularPerimetro());
		System.out.println(listaRectangulos[1].calcularSuperficie());
		listaRectangulos[2].desplazar(1, 2);
		System.out.println(listaRectangulos[2]);
	}

}
