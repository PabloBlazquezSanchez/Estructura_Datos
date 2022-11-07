package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Clase donde se implementa el elemento término
 */
public class Termino {

	/**Variable que guarda la definición.*/
	private String definicion;

	/** Variable que guarda el nombre.*/
	private String nombre;

	/**
	 * Este método sirve para crear una variable de tipo Termino que contenga un
	 * nombre y una definición.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre     the nombre
	 * @param definicion the definicion
	 */
	public Termino(String nombre, String definicion) {
		this.definicion = definicion;
		this.nombre = nombre;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable definicion, que a su
	 * vez está almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return the definicion
	 */
	public String getDefinicion() {
		return definicion;
	}

	/**
	 * Este método modifica el valor almacenado en la variable definicion, que a su
	 * vez está almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param definicion the new definicion
	 */
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable nombre, que a su vez
	 * está almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Este método modifica el valor almacenado en la variable nombre, que a su vez
	 * está almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
