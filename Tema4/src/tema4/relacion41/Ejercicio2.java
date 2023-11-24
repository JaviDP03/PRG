package tema4.relacion41;

public class Ejercicio2 {

	public static void main(String[] args) {
		CuentaBancaria unaCuenta;
		unaCuenta = new CuentaBancaria(1, "Pepe", 556.76, "2%");
		
		System.out.println(unaCuenta);
		
		unaCuenta.ingreso(100);
		System.out.println(unaCuenta.getSaldo() + "€");
		
		unaCuenta.reintegro(322.14);
		System.out.println(unaCuenta.getSaldo() + "€");
		
		unaCuenta.numerosRojos();
	}

}
