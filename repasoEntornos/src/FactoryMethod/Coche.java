package FactoryMethod;

/**
 * Vehículo creado en la Fabrica <b>(coche)</b>
 * @author rasob
 *
 */
public class Coche implements Transporte {
	
	private String matricula;
	
	public Coche(String matricula) {
		super();
		this.matricula = matricula;
	}

	/**
	 * Arranca el coche
	 */
	@Override
	public void arrancar() {
		System.out.println("Arracando el coche...");
	}

	/**
	 * Detiene el coche
	 */
	@Override
	public void detener() {
		System.out.println("Deteniendo el coche...");
	}

	/**
	 * Muestra que es el tipo es un coche
	 */
	@Override
	public String tipo() {
		return "Coche";
	}
	
	/**
	 * M�todo para insertar matr�cula
	 * @param matricula Introduces la matr�cula para el veh�culo
	 */
	@Override
	public void matricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + "]";
	}

}
