package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Clase donde se implementa el elemento t�rmino
 */
public class Termino {

	/**Variable que guarda la definici�n.*/
	private String definicion;

	/** Variable que guarda el nombre.*/
	private String nombre;

	/**
	 * Este m�todo sirve para crear una variable de tipo Termino que contenga un
	 * nombre y una definici�n.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
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
	 * Este m�todo devuelve el valor almacenado en la variable definicion, que a su
	 * vez est� almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return the definicion
	 */
	public String getDefinicion() {
		return definicion;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable definicion, que a su
	 * vez est� almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param definicion the new definicion
	 */
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable nombre, que a su vez
	 * est� almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable nombre, que a su vez
	 * est� almacenado en una variable de tipo Termino.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
