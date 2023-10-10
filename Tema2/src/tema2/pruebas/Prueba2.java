package tema2.pruebas;

public class Prueba2 {

	public static void main(String[] args) {
		int puntos = 1000;
		int vidaContrincante = 0;
		boolean heSidoDisparado = false;
		String resultado;
		
		resultado = heSidoDisparado == false && (puntos >= 1000 || vidaContrincante == 0) ? "GANO" : "PIERDO";
		
		System.out.println(resultado);
	}

}
