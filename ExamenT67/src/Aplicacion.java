/**
 * Clase Aplicacion para probar las clases ya creadas.
 */
public class Aplicacion {

	public static void main(String[] args) {
		// Crear array de empleados
		Empleado[] listaEmpleados = new Empleado[4];

		// Introducir vendedores
		listaEmpleados[0] = new Vendedor("Manolo", "Informática", 6);
		listaEmpleados[1] = new VendedorItinerante("Jesús", "Electrónica", 10);
		listaEmpleados[2] = new Vendedor("Paco", "Mobiliaria");
		listaEmpleados[3] = new VendedorItinerante("Marta", "Bricolaje");

		// Listar los empleados del array
		listarEmpleados(listaEmpleados);

		System.out.println();

		/*
		 * Planificar la semana de los dos vendedores itinerantes, usando try y catch
		 * para manejar una posible excepción
		 */
		try {
			Planificador.planificarSemana((Itinerante) listaEmpleados[1]);
			Planificador.planificarSemana((Itinerante) listaEmpleados[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();

		// Listar los empleados del array
		listarEmpleados(listaEmpleados);
	}

	/**
	 * Método que lista el contenido de un array de tipo Empleado
	 * 
	 * @param lista
	 */
	public static void listarEmpleados(Empleado[] lista) {
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
	}

}
