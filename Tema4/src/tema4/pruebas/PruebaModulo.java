package tema4.pruebas;

public class PruebaModulo {

	public static void main(String[] args) {
		int variable = 0;
		
		for (int i = 0; i < 1000; i++) {
			variable = (variable + 1) % 10;
			System.out.printf("Vuelta %d | Variable = %d\n", i, variable);
		}
	}

}
