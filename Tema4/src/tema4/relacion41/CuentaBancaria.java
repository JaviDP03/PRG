package tema4.relacion41;

public class CuentaBancaria {
	// Propiedades de la instancia
	private int numeroCuenta;
	private String titular;
	private double saldo;
	private String interesAnual;

	// Métodos de la instancia
	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 * @param interesAnual
	 */
	public CuentaBancaria(int numeroCuenta, String titular, double saldo, String interesAnual) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}

	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
				+ ", interesAnual=" + interesAnual + "]";
	}

	/**
	 * @return numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return interesAnual
	 */
	public String getInteresAnual() {
		return interesAnual;
	}

	/**
	 * @param interesAnual
	 */
	public void setInteresAnual(String interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	/**
	 * Ingreso de dinero al saldo de la cuenta
	 * @param dineroIngreso
	 */
	public void ingreso (double dineroIngreso) {
		saldo += dineroIngreso;
	}
	
	/**
	 * Reintegro de dinero al saldo de la cuenta
	 * @param dineroReintegro
	 */
	public void reintegro (double dineroReintegro) {
		saldo -= dineroReintegro;
	}
	
	public void numerosRojos() {
		if (saldo < 0) {
			System.out.println("Está en números rojos");
		} else {
			System.out.println("No está en números rojos");
		}
	}
}
