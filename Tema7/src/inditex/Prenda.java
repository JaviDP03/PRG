package inditex;

public abstract class Prenda implements Lavable {
	private int talla;
	private String color;
	private String composicion;
	private int codigo;
	private double precio;

	/**
	 * Construye una nueva prenda
	 * 
	 * @param talla       en formato numérico: 40, 41, 42...
	 * @param color       en formato texto: "Rojo", "Verde"...
	 * @param composicion en formato texto: "50% Aldodón, 48% Polyamida, 2% Elastán"
	 * @param codigo      es el número del código de barras
	 * @param precio      es el PVP en formato numérico con decimales
	 */
	public Prenda(int talla, String color, String composicion, int codigo, double precio) {
		super();
		this.talla = talla;
		this.color = color;
		this.composicion = composicion;
		this.codigo = codigo;
		this.precio = precio;
	}

	/**
	 * Permite averiguar la talla
	 * 
	 * @return un entero con la talla: 40, 41...
	 */
	public int getTalla() {
		return talla;
	}

	/**
	 * Permite averiguar el color principal de la prenda
	 * 
	 * @return una cadena de texto: "Rojo a cuadritos"
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Permite averiguar la composición
	 * 
	 * @return una cadena de texto: "50% Aldodón, 48% Polyamida, 2% Elastán"
	 */
	public String getComposicion() {
		return composicion;
	}

	/**
	 * Permite averiguar el código de barras
	 * 
	 * @return un número entero
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Permite conocer el precio de la prenda
	 * 
	 * @return un número real
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Asigna a la prenda un código de barras y un precio
	 * 
	 * @param codigo un número entero
	 * @param precio un número real
	 */
	public void etiquetar(int codigo, double precio) {
		this.codigo = codigo;
		this.precio = precio;
	}

	/**
	 * Dobla la prenda
	 * 
	 */
	public void doblar() {
		System.out.println("Doblando de forma genérica esta prenda...");
	}

	@Override
	public String toString() {
		return "Prenda [talla=" + talla + ", color=" + color + ", composicion=" + composicion + ", codigo=" + codigo
				+ ", precio=" + precio + "]";
	}

}
