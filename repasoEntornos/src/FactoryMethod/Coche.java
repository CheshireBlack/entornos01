package FactoryMethod;

/**
 * VehÃ­culo creado en la Fabrica <b>(coche)</b>
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
	 * Método para insertar matrícula
	 * @param matricula Introduces la matrícula para el vehículo
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
