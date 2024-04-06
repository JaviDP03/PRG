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
			listaProductos = (List<Producto>) entrada.readObject();
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

		salida.writeObject(listaProductos);

		salida.close();
	}

	public void crear(Producto unProducto) {
		listaProductos.add(verificarId(unProducto));
	}

	public void borrar(Producto unProducto) {
		listaProductos.remove(unProducto);
	}

	public void borrarPorId(int id) {
		listaProductos.remove(buscarPorId(id));
	}

	public int borrarPorNombre(String nombre) {
		List<Producto> listaBorrados = new ArrayList<>();
		int contadorBorrados = 0;

		listaBorrados = buscarPorNombre(nombre);
		for (Producto producto : listaBorrados) {
			listaProductos.remove(producto);
			contadorBorrados++;
		}

		return contadorBorrados;
	}

	public Producto buscarPorId(int id) {
		for (Producto producto : listaProductos) {
			if (id == producto.getId()) {
				return producto;
			}
		}

		return null;
	}

	public List<Producto> buscarPorNombre(String nombre) {
		List<Producto> listaBuscados = new ArrayList<>();
		for (Producto producto : listaProductos) {
			if (producto.getNombre().toLowerCase().contains(nombre)) {
				listaBuscados.add(producto);
			}
		}

		return listaBuscados;
	}

	public List<Producto> buscarTodos() {
		return listaProductos;
	}

	public void actualizar(Producto productoActualizado) {
		borrarPorId(productoActualizado.getId());
		crear(productoActualizado);

	}

	public Producto verificarId(Producto unProducto) {
		for (Producto producto : listaProductos) {
			if (unProducto.getId() == producto.getId()) {
				unProducto.setId(unProducto.getId() + 1);
			} else {
				break;
			}
		}

		return unProducto;
	}

}
