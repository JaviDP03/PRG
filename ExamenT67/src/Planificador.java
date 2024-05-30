/**
 * Clase Planificador que realiza la planificación semanal.
 */
public class Planificador {
	private static String[] listaLocalidades = { "Écija", "Estepa", "Cañada", "Sevilla", "Carmona" };

	/**
	 * Método que recibe un objeto de tipo Itinerante y planifica su semana
	 * 
	 * @param unIntinerante
	 * @throws Exception
	 */
	public static void planificarSemana(Itinerante unIntinerante) throws Exception {
//			try {
				unIntinerante.setDestino('L', listaLocalidades[(int) (Math.random() * 5)]);
				unIntinerante.setDestino('M', listaLocalidades[(int) (Math.random() * 5)]);
				unIntinerante.setDestino('X', listaLocalidades[(int) (Math.random() * 5)]);
				unIntinerante.setDestino('J', listaLocalidades[(int) (Math.random() * 5)]);
				unIntinerante.setDestino('V', listaLocalidades[(int) (Math.random() * 5)]);

				unIntinerante.setDestino('S', listaLocalidades[(int) (Math.random() * 5)]);
//			} catch (Exception e) {
//
//				e.printStackTrace();
//			}
	}

}
