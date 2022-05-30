package FactoryMethod;


/**
 * Interfaz para implementar en los transportes de la f√°brica
 * @author rasob
 * @version 1.0.0
 *
 */
public interface Transporte {
	
	/**
	 * Se arranca el veh√≠culo
	 */
	public void arrancar();
	
	/**
	 * Se detiene el veh√≠culo
	 */
	public void detener();
	
	/**
	 * Metodo para mostrar el tipo
	 * @return el tipo de veh√≠culo
	 */
	public String tipo();
	
	/**
	 * Este mÈtodo no devuelve nada pero permite introducir la m·tricula.
	 * @param matricula Introduce la m·tricula correspondiente al vehÌculo.
	 */
	public void matricula(String matricula);
}
