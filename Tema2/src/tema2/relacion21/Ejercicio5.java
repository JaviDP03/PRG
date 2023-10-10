package tema2.relacion21;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir deberá estar almacenada 
		 * previamente en una variable.*/
		
		double pesetas = 50632.78;
		double euros = pesetas * 0.0060;
		
		System.out.printf("%.2f pesetas son %.2f euros.", pesetas, euros);
	}

}
