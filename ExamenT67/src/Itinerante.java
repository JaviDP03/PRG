/**
 * Interfaz Itinerante que indica las acciones de un vendedor para desplazarse a
 * su trabajo.
 */
public interface Itinerante {
	/**
	 * Permite obtener la localidad que toca en cierto día de la semana.
	 * 
	 * @param dia
	 * @return localidad
	 * @throws Exception
	 */
	public String getDestino(char dia) throws Exception;

	/**
	 * Permite asignar la localidad y el día que acudirá.
	 * 
	 * @param dia
	 * @param localidad
	 * @throws Exception
	 */
	public void setDestino(char dia, String localidad) throws Exception;

}
