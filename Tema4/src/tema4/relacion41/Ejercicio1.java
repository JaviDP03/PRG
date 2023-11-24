package tema4.relacion41;

public class Ejercicio1 {

	public static void main(String[] args) {
		CocheAlquiler unCoche;
		unCoche = new CocheAlquiler("3524GXV", "Fiat", "Panda", 4, "Negro", 12000, "Si");
		
		System.out.println(unCoche);
		
		unCoche.setMatricula("4259PFH");
		System.out.println(unCoche);
	}

}
