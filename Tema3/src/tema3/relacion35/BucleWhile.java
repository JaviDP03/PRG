package tema3.relacion35;

public class BucleWhile {
	public static void main(String[] args) {
		int i = 0;
		int j = 6;
		while (i < 0) {
			i++;
			j++;
		}
		System.out.println(j);
	}
}

// La salida es un 6 ya que la variable i que se usa para el bucle no cumple la condición así que este nunca se ejecuta y la variable j queda con el mismo valor inicial.