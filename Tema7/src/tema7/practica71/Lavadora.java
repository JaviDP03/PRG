package tema7.practica71;

public class Lavadora {
	public static void lavarNormal(Lavable algoLavable, String detergente) {
		System.out.println("Lavando en agua fría...");
		algoLavable.aplicarProducto(detergente);
		algoLavable.frotar();
		algoLavable.enjuagar();
	}

	public static void lavarExtra(Lavable algoLavable, String detergente) {
		System.out.println("Lavando en agua caliente...");
		System.out.println("Ajustando temperatura a " + algoLavable.getMaxTempAgua());

		algoLavable.aplicarProducto(detergente);

		if (algoLavable.getAdmiteLejia())
			System.out.println("Añadiendo lejía sin piedad...");
		else
			System.out.println("Este objeto Lavable no admite lejía");

		algoLavable.frotar();
		algoLavable.enjuagar();
	}
}
