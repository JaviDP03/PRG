package practica91;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
	// Propiedades de la instancia
	private String fichero;
	private List<Producto> listaProductos = new ArrayList<>();

	// Constructor
	public Repositorio(String fichero) {
		this.fichero = fichero;
	}

	// Métodos
	public void leerFichero() {
		try {
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fichero));

			while (entrada != null) {
				listaProductos.add((Producto) entrada.readObject());
			}

			entrada.close();
		} catch (Exception e) {
			e.printStackTrace();
			
			listaProductos.add(new Producto(1, "Huevo", 1.22));
			listaProductos.add(new Producto(2, "Harina", 2.50));
			listaProductos.add(new Producto(3, "Macarrones", 2.29));
			listaProductos.add(new Producto(4, "Solomillo", 7.80));
			listaProductos.add(new Producto(5, "Coca-Cola", 2.99));
			listaProductos.add(new Producto(6, "Pizza", 3.12));
			listaProductos.add(new Producto(7, "Lechuga", 2.49));
			listaProductos.add(new Producto(8, "Pepinillos", 0.79));
			listaProductos.add(new Producto(9, "Tomate", 1.10));
			listaProductos.add(new Producto(10, "Chorizo", 2.03));
		}
	}

	public void grabarFichero() throws FileNotFoundException, IOException {
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero));

		for (Producto producto : listaProductos) {
			salida.writeObject(producto);
		}

		salida.close();
	}

	public void crear(Producto unProducto) {
		listaProductos.add(verificarId(unProducto));
	}

	public void borrar(Producto unProducto) {
		listaProductos.remove(unProducto);
	}

	public void borrarPorId(String id) {

	}

	public Producto buscarPorId(int id) {
		for (Producto producto : listaProductos) {
			if (id == producto.getId()) {
				return producto;
			}
		}

		return null;
	}

	public Producto buscarPorNombre(String nombre) {
		for (Producto producto : listaProductos) {
			if (nombre.equals(producto.getNombre())) {
				return producto;
			}
		}

		return null;
	}

	public List<Producto> buscarTodos() {
		return listaProductos;
	}

	public void actualizar(Producto productoActualizado) {
		listaProductos.remove(buscarPorId(productoActualizado.getId()));
		listaProductos.add(productoActualizado);

	}

	public Producto verificarId(Producto unProducto) {
		boolean esIgual = false;
		while (!esIgual) {
			for (Producto producto : listaProductos) {
				if (unProducto.getId() == producto.getId()) {
					esIgual = true;
				}
			}

			if (esIgual) {
				unProducto.setId(unProducto.getId() + 1);
			}
		}

		return unProducto;
	}
}
