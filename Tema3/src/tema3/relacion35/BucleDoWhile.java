package tema3.relacion35;

public class BucleDoWhile {
	public static void main(String[] args) {
		int i = 0;
		int j = 8;
		do {
			i++;
			j++;
		} while (i <= -1);
		System.out.println(j);
	}
}

// La salida es un 9 porque el bucle sólo se repite 1 vez debido al ser un do while y no cumplir la condición al final.