package tema4.practica42;

public class Ejercicio2 {
	public static void main(String[] args) {
		TarjetaSim tarjeta;
		tarjeta = new TarjetaSim(600_111_222, 1234, 3);
		tarjeta.introducirPin(1111);
		tarjeta.introducirPin(2222);
		tarjeta.introducirPin(3333);
		tarjeta.introducirPin(4444);
		tarjeta.cambiarPin(1234, 3333);
		System.out.println("\nProbando otra SIM...");
		tarjeta = new TarjetaSim(600_333_444, 1234, 3);
		tarjeta.introducirPin(1111);
		tarjeta.introducirPin(2222);
		tarjeta.introducirPin(1234);
		System.out.println("¿Está bloqueada? " + tarjeta.estaBloqueada());
		System.out.println("Intentos disponibles: " + tarjeta.getIntentosDisponibles());
		System.out.println("\nCambiando PIN...");
		tarjeta.cambiarPin(1234, 3333);
		tarjeta.introducirPin(3333);
		System.out.println("¿Está bloqueada? " + tarjeta.estaBloqueada());
		System.out.println("Intentos disponibles: " + tarjeta.getIntentosDisponibles());
	}

}
