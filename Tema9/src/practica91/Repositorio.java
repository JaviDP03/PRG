package practica91;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Repositorio que gestiona los productos a través de una lista. También
 * controla el acceso a estos.
 */
public class Repositorio {
	// Propiedades de la instancia
	private String fichero;
	private List<Producto> listaProductos = new ArrayList<>();

	/**
	 * Constructor
	 * 
	 * @param fichero que almacena la lista de productos.
	 */
	public Repositorio(String fichero) {
		this.fichero = fichero;
	}

	// Métodos principales
	/**
	 * Método leer fichero que lee los objetos Producto de un fichero indicado en el
	 * constructor.
	 * 
	 * @return true o false, dependiendo si hay errores al leer el fichero.
	 */
	public boolean leerFichero() {
		try {
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(fichero));

			listaProductos = (List<Producto>) entrada.readObject();

			entrada.close();

			return true;
		} catch (Exception e) {
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

			return false;
		}
	}

	/**
	 * Método grabarFichero que guarda los datos de la lista en el archivo del
	 * constructor.
	 * 
	 * @return true o false, dependiendo si hay errores al grabar el fichero o no.
	 */
	public boolean grabarFichero() {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(fichero));

			salida.writeObject(listaProductos);

			salida.close();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método crear que recibe un producto por parámetro y lo añade a la lista,
	 * usando el método auxiliar verificarId para no repetir el id del producto.
	 * 
	 * @param unProducto
	 */
	public void crear(Producto unProducto) {
		listaProductos.add(verificarId(unProducto));
	}

	/**
	 * Método borrar que elimina un producto introducido por parámetro.
	 * 
	 * @param unProducto, objeto a borrar.
	 * @return true o false si consigue borrar el producto o no.
	 */
	public boolean borrar(Producto unProducto) {
		return listaProductos.remove(unProducto);
	}

	/**
	 * Método borrarPorId que recibe un id por párametro y elimina el producto de la
	 * lista.
	 * 
	 * @param id para borrar el objeto.
	 * @return true o false si consigue borrar el producto o no.
	 */
	public boolean borrarPorId(int id) {
		return listaProductos.remove(buscarPorId(id));
	}

	/**
	 * Método borrarPorNombre que recibe un String con el nombre y elimina el
	 * producto/s de la lista.
	 * 
	 * @param nombre, String con el conjunto de carácteres del producto/s.
	 * @return
	 */
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

	/**
	 * Método buscarPorId que buscar un producto según el id introducido por
	 * parámetro.
	 * 
	 * @param id del producto a buscar.
	 * @return el objeto o null, dependiendo si lo encuentra o no.
	 */
	public Producto buscarPorId(int id) {
		for (Producto producto : listaProductos) {
			if (id == producto.getId()) {
				return producto;
			}
		}

		return null;
	}

	/**
	 * Método buscarPorNombre que buscar según un String por parámetro y devuelve lo
	 * que coincida.
	 * 
	 * @param nombre, nombre concreto o similitudes.
	 * @return una lista con las coincidencias.
	 */
	public List<Producto> buscarPorNombre(String nombre) {
		List<Producto> listaBuscados = new ArrayList<>();
		for (Producto producto : listaProductos) {
			if (producto.getNombre().toLowerCase().contains(nombre)) {
				listaBuscados.add(producto);
			}
		}

		return listaBuscados;
	}

	/**
	 * Método buscarTodos que devuelve todos los productos.
	 * 
	 * @return una lista con todos los productos.
	 */
	public List<Producto> buscarTodos() {
		return listaProductos;
	}

	public void actualizar(Producto productoActualizado) {
		borrarPorId(productoActualizado.getId());
		crear(productoActualizado);

	}

	// Métodos auxiliares
	/**
	 * Método verificarId que garantiza que el id del producto no se repita.
	 * 
	 * @param unProducto, objeto Producto para verificar su id.
	 * @return un objeto Producto con un id no repetido.
	 */
	public Producto verificarId(Producto unProducto) {
		int idNuevo = unProducto.getId();
		boolean verificador = false;

		while (!verificador) {
			verificador = true;
			for (int i = 0; i < listaProductos.size(); i++) {
				if (idNuevo == listaProductos.get(i).getId()) {
					verificador = false;
					idNuevo++;
				}
			}
		}

		unProducto.setId(idNuevo);
		return unProducto;
	}

}
