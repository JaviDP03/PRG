package inditex;

public class Plancha {
	// Método que plancha normal una prenda planchable.
	public static void plancharNormal(Planchable algoPlanchable, String aditivo) {
		System.out.println("Se está planchando normal con una temperatura de " + algoPlanchable.getMaxTempPlancha() + " ºC");

		System.out.println(
				algoPlanchable.getRequiereApresto() ? "Se está utilizando apresto." : "No se está utilizando apresto.");

		if (aditivo != null) {
			algoPlanchable.rociar(aditivo);
		}

		algoPlanchable.quitarArrugas();
	}

	// Método que plancha con vapor una prenda planchable.
	public static void plancharVapor(Planchable algoPlanchable, String aditivo) {
		System.out.println("Se está planchando a vapor con una temperatura de " + algoPlanchable.getMaxTempPlancha() + " ºC");
		
		System.out.println(algoPlanchable.getRequiereApresto() ? "Se está utilizando apresto." : "No se está utilizando apresto.");
		
		if (aditivo != null) {
			algoPlanchable.rociar(aditivo);
		}
		
		algoPlanchable.quitarArrugas();
	}
}
