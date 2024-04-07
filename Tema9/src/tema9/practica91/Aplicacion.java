package tema9.practica91;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase Aplicación que simula el funcionamiento principal con un menú de
 * opciones.
 */
public class Aplicacion {
	// Propiedades de clase
	private static Scanner teclado = new Scanner(System.in);
	private static Repositorio r1 = new Repositorio("productos.bin");

	// Main
	public static void main(String[] args) {
		int opcion;

		System.out.println("Cargando productos del fichero...");
		if (r1.leerFichero()) {
			System.out.println(r1.buscarTodos().size() + " productos cargados con éxito\n");
		} else {
			System.out.println("Error: No se ha podido leer el fichero");
			System.out.println("Cargando productos autogenerados...");
			System.out.println(r1.buscarTodos().size() + " productos cargados con éxito\n");
		}

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
			System.out.println("8) Realizar pedido");
			System.out.println("0) Grabar cambios y finalizar");

			opcion = Integer.parseInt(teclado.nextLine());

			switch (opcion) {
			case 1:
				System.out.println(listarProductos(r1) + "\n");
				break;
			case 2:
				System.out.println(buscarPorId(r1) + "\n");
				break;
			case 3:
				System.out.println(buscarPorNombre(r1) + "\n");
				break;
			case 4:
				añadirProducto(r1);
				System.out.println();
				break;
			case 5:
				modificarProducto(r1);
				System.out.println();
				break;
			case 6:
				borrarPorId(r1);
				System.out.println();
				break;
			case 7:
				System.out.println("Se han borrado " + borrarPorNombre(r1) + " productos");
				break;
			case 8:
				System.out.println(realizarPedido(r1));
				break;
			default:
				break;
			}
		} while (opcion != 0);

		teclado.close();
		System.out.println("Saliendo del programa...\n");

		if (r1.grabarFichero()) {
			System.out.println("Fichero grabado con éxito");
		} else {
			System.out.println("Error: No se ha podido grabar el fichero");
		}

	}

	// Opción 1
	public static String listarProductos(Repositorio repo) {
		repo.buscarTodos().sort(new ComparadorNombre());

		return formatearLista(repo.buscarTodos().toString());
	}

	// Opción 2
	public static String buscarPorId(Repositorio repo) {
		int id;
		Producto productoSeleccionado;

		System.out.print("Elija una opción: ");
		id = Integer.parseInt(teclado.nextLine());
		productoSeleccionado = repo.buscarPorId(id);

		if (productoSeleccionado == null) {
			return "Error: No se pudo encontrar el producto";
		} else {
			return productoSeleccionado.toString();
		}
	}

	// Opción 3
	public static String buscarPorNombre(Repositorio repo) {
		String nombre;

		System.out.print("Indique el nombre: ");
		nombre = teclado.nextLine();

		return formatearLista(repo.buscarPorNombre(nombre).toString());
	}

	// Opción 4
	public static void añadirProducto(Repositorio repo) {
		String nombre;
		double precio;

		System.out.print("Indique el nombre del producto: ");
		nombre = teclado.nextLine();

		System.out.print("Indique el precio del producto: ");
		precio = Double.parseDouble(teclado.nextLine());

		repo.crear(new Producto(1, nombre, precio));
		System.out.println(
				"Producto añadido con el ID: " + repo.buscarTodos().get(repo.buscarTodos().size() - 1).getId());
	}

	// Opción 5
	public static void modificarProducto(Repositorio repo) {
		int id;
		String nombre;
		double precio;

		System.out.print("Indique el ID: ");
		id = Integer.parseInt(teclado.nextLine());
		System.out.println("Modificar: " + repo.buscarPorId(id));

		System.out.print("Indique el nuevo nombre: ");
		nombre = teclado.nextLine();

		System.out.print("Indique el nuevo precio: ");
		precio = Double.parseDouble(teclado.nextLine());

		repo.actualizar(new Producto(id, nombre, precio));

		System.out.println("Producto modificado: " + repo.buscarPorId(id));
	}

	// Opción 6
	public static void borrarPorId(Repositorio repo) {
		int id;

		System.out.print("Indique el ID: ");
		id = Integer.parseInt(teclado.nextLine());

		if (repo.borrarPorId(id)) {
			System.out.println("Producto borrado");
		} else {
			System.out.println("Error: No se pudo borrar el producto o no es posible encontrarlo.");
		}

	}

	// Opción 7
	public static int borrarPorNombre(Repositorio repo) {
		String nombre;

		System.out.println("Indique el nombre: ");
		nombre = teclado.nextLine();

		return repo.borrarPorNombre(nombre);
	}

	// Opción 8
	public static String realizarPedido(Repositorio repo) {
		StringBuilder carrito = new StringBuilder();
		int id, cantidad;
		Producto productoSeleccionado;
		double subtotal;
		double total = 0;

		carrito.append("Producto\tPrecio Cantidad Subtotal\n");
		carrito.append("----------------------------------------\n");

		System.out.println(listarProductos(repo));

		System.out.print("Indique un ID: ");
		id = Integer.parseInt(teclado.nextLine());

		while (id != -1) {
			System.out.print("Indique una cantidad: ");
			cantidad = Integer.parseInt(teclado.nextLine());

			productoSeleccionado = repo.buscarPorId(id);
			if (productoSeleccionado == null) {
				System.out.println("Error: No se pudo encontrar el producto");
			} else {
				subtotal = cantidad * productoSeleccionado.getPrecio();
				total += subtotal;

				carrito.append(String.format("%-18s%.2f%9d%9.2f\n", productoSeleccionado.getNombre(),
						productoSeleccionado.getPrecio(), cantidad, subtotal));
			}

			System.out.print("Indique un ID: ");
			id = Integer.parseInt(teclado.nextLine());
		}

		System.out.println();
		carrito.append("----------------------------------------\n");
		carrito.append(String.format("TOTAL: %.2f€\n", total));

		System.out.print("¿Desea una copia de la factura? (s/n): ");
		if (teclado.nextLine().equalsIgnoreCase("s")) {
			try {
				BufferedWriter salida = new BufferedWriter(new FileWriter("factura.txt"));

				salida.write(carrito.toString());

				salida.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println();

		return carrito.toString();
	}

	// Auxiliar
	public static String formatearLista(String lista) {
		lista = lista.replace("[Producto", "Producto");
		lista = lista.replace("]]", "]");
		lista = lista.replace(", Producto", "\nProducto");

		return lista;
	}
}
