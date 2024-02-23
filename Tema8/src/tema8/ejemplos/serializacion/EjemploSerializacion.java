package tema8.ejemplos.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EjemploSerializacion {

	public static void main(String[] args) {
		Prenda[] listaPrendas = new Prenda[4];

		listaPrendas[0] = new Camiseta(42, "Roja", "100% Algodón", 2, 21.50, false);
		listaPrendas[1] = new Pantalon(42, "Gris", "100% Algodón", 3, 22.50, false);
		listaPrendas[2] = new Camiseta(42, "Blanca", "100% Algodón", 2, 21.50, false);
		listaPrendas[3] = new Pantalon(42, "Azul", "100% Algodón", 3, 22.50, false);

		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("salida.bin"));

			salida.writeObject(listaPrendas);
			salida.write(5);
			salida.writeObject("Hola");

			salida.close();

			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("salida.bin"));

			listaPrendas = (Prenda[]) entrada.readObject();
			System.out.println(entrada.readInt());
			System.out.println((String) entrada.readObject());

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
