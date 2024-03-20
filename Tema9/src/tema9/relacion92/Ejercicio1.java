package tema9.relacion92;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, Float> listaProductos = new HashMap<>();
		Map<String, Integer> listaComprados = new HashMap<>();
		String producto = "";
		int cantidad = 0;

		listaProductos.put("avena", 2.21f);
		listaProductos.put("garbanzos", 2.39f);
		listaProductos.put("tomate", 1.59f);
		listaProductos.put("jengibre", 3.13f);
		listaProductos.put("quinoa", 4.50f);
		listaProductos.put("guisantes", 1.60f);

		while (!producto.equals("fin")) {
			System.out.print("Producto: ");
			producto = teclado.nextLine();

			if (listaProductos.containsKey(producto)) {
				System.out.print("Cantidad: ");
				cantidad = Integer.parseInt(teclado.nextLine());
				if (listaComprados.containsKey(producto)) {
					listaComprados.replace(producto, listaComprados.get(producto) + cantidad);
				} else {
					listaComprados.put(producto, cantidad);
				}
			} else {
				if (!producto.equals("fin")) {
					System.out.println("El producto no existe");
				}
			}
		}

		System.out.println("Producto	Precio 		Cantidad 	 Subtotal");
		System.out.println("----------------------------------------------------------");
		for (String prod : listaComprados.keySet()) {
			System.out.printf("%s%13.2f%16d%17.2f", prod, listaProductos.get(prod), listaComprados.get(prod),
					listaProductos.get(prod) * listaComprados.get(prod));
		}

	}

}
