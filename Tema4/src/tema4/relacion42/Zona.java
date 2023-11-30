package tema4.relacion42;

public class Zona {
	int numeroEntradasDisponibles;

	public Zona(int numeroEntradasDisponibles) {
		this.numeroEntradasDisponibles = numeroEntradasDisponibles;
	}

	public int getnumeroEntradasDisponibles() {
		return numeroEntradasDisponibles;
	}

	/**
	 * Vende un número de entradas. Comprueba si quedan entradas libres antes de
	 * realizar la venta. Devuelve el número de entradas que se han podido vender.
	 */
	int vender(int numeroEntradas) {
		int resultado = 0;
		if (this.numeroEntradasDisponibles == 0) {
			resultado = 0;
		} else if (this.numeroEntradasDisponibles < numeroEntradas) {
			this.numeroEntradasDisponibles = 0;
			resultado = this.numeroEntradasDisponibles;
		} else if (this.numeroEntradasDisponibles >= numeroEntradas) {
			this.numeroEntradasDisponibles -= numeroEntradas;
			resultado = numeroEntradas;
		}
		
		return resultado;
	}
}