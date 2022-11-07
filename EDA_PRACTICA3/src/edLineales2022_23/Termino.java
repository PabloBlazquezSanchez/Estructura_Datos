package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class Termino.
 */
public class Termino {

/** The definicion. */
private String definicion;

/** The nombre. */
private String nombre;

/**
 * Instantiates a new termino.
 *
 * @param nombre the nombre
 * @param definicion the definicion
 */
public Termino(String nombre, String definicion) {
	this.definicion = definicion;
	this.nombre = nombre;
}

/**
 * Gets the definicion.
 *
 * @return the definicion
 */
public String getDefinicion() {
	return definicion;
}

/**
 * Sets the definicion.
 *
 * @param definicion the new definicion
 */
public void setDefinicion(String definicion) {
	this.definicion = definicion;
}

/**
 * Gets the nombre.
 *
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * Sets the nombre.
 *
 * @param nombre the new nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
