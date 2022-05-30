package FactoryMethod;

/**
 * Clase principal para crear los Transportes e implementar el tipo de los vehículos a crear
 * @author rasob
 *
 */
public class Aplicacion {
	
	/**
	 * Método main
	 * @param args ...
	 */
	public static void main(String[] args) {
		
		Transporte p1 = Fabrica.construir("Moto","111111111");
		Transporte p2 = Fabrica.construir("Coche","222222222");
		Transporte p3 = Fabrica.construir("hola","adios");
		
		p1.arrancar();
		p2.detener();
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
