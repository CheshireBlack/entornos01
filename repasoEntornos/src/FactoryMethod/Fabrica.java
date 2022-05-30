package FactoryMethod;

/**
 * Con la clase Fabrica se crean los tipos de vehíulo
 * @author rasob
 *
 */
public class Fabrica {

	/**
	 * Clase para crear vehículos en esta fábrica
	 * @param tipo Le insertas el tipo de vehículo a crear en la fábrica
	 * @return Devuelve el objeto que se ha creado en la fábrica (coche o moto)
	 */
	public static Transporte construir(String tipo, String matricula) {

		switch (tipo) {
		case "Moto":
			return new Moto(matricula);
		case "Coche":
			return new Coche(matricula);
		default:
			System.out.println("No se encuentra dicho objeto en la f�brica");
			return null;
		}

	}

}
