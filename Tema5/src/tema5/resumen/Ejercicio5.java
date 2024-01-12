package tema5.resumen;

import javax.swing.JOptionPane;

/**
 * Crea un array de 2 elementos de tipo cadena para pedirle al usuario sus dos
 * apellidos. La introducción de datos será a través de ventanas de entrada de
 * datos (usa la clase JoptionPane vista en el código de
 * EjemplosConversionStringANumero.java).
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		String[] apellidos = new String[2];
		
		apellidos[0] = JOptionPane.showInputDialog("Introduce tu primer apellido:");
		apellidos[1] = JOptionPane.showInputDialog("Introduce tu segundo apellido:");
		JOptionPane.showMessageDialog(null, "Tus apellidos son: " + apellidos[0] + " " + apellidos[1]);
	}

}
