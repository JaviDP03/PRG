package practica91;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		Repositorio r1 = new Repositorio("productos.bin");
		r1.leerFichero();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("-------------------------------------------------");
			System.out.println("1) Listar todos los productos (orden alfabético)");
			System.out.println("2) Buscar por id");
			System.out.println("3) Buscar por nombre");
			System.out.println("4) Añadir producto");
			System.out.println("5) Modificar producto");
			System.out.println("6) Borrar producto por id");
			System.out.println("7) Borrar producto por nombre");
			System.out.println("0) Grabar cambios y finalizar");

			opcion = Integer.parseInt(teclado.nextLine());

			switch (opcion) {
			case 1:
				System.out.println(listarProductos(r1));
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:

				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				break;
			}
		} while (opcion != 0);

		teclado.close();
	}

	// Opción 1
	public static String listarProductos(Repositorio repo) {
		return repo.buscarTodos().toString();
	}

	// Opción 4
	public static void añadirProducto(Repositorio repo) {

	}

}
