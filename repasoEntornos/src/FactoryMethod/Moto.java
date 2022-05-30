package FactoryMethod;

/**
 * Se crea el vehículo Moto en la Fabrica
 * @author rasob
 *
 */
public class Moto implements Transporte {
	
	private String matricula;

	public Moto(String matricula) {
		super();
		this.matricula = matricula;
	}

	/**
	 * Arranca la moto
	 */
	@Override
	public void arrancar() {
		System.out.println("Arrancando la moto...");
	}

	/**
	 * Detiene la moto
	 */
	@Override
	public void detener() {
		System.out.println("Deteniendo la moto...");
	}

	/**
	 * Muestra el tipo de vehículo (moto)
	 */
	@Override
	public String tipo() {
		return "Moto";
	}

	@Override
	public void matricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + "]";
	}
	
	

}
