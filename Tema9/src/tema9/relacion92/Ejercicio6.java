package tema9.relacion92;

public class Ejercicio6 {

	public static void main(String[] args) {
		ListaCitas lista = new ListaCitas();

		lista.añadirCita("20:00", "Manuel");
		lista.añadirCita("10:00", "María");
		lista.añadirCita("16:00", "Lucía");
		lista.añadirCita("11:00", "Pepe");
		lista.añadirCita("19:00", "Francisco");
		lista.añadirCita("13:00", "Marta");
		lista.añadirCita("09:00", "Manolo");
		lista.añadirCita("12:00", "Eustaquio");
		lista.añadirCita("18:00", "José");
		lista.añadirCita("17:00", "Nacho");

		lista.cancelarCita("19:00", "Francisco");
		lista.cancelarCita("10:00", "María");
		
		System.out.println(lista.consultarCita("12:00"));
		
		System.out.println(lista);
	}

}
