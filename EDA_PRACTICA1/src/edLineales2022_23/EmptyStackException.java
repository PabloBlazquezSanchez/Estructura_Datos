package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
* Clase donde se implementa la excepción que ocurre cuando la pila está vacía
 */
public class EmptyStackException extends RuntimeException{
	
	/**
	 * Instanciar la excepción de la pila vacía
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param mensajeerror el mensaje de error que se deberá mostrar para cuando se
	 * quiera lanzar una excepción
	 */
	public EmptyStackException (String mensajeerror) {
		super(mensajeerror); //HEREDA, DE AHI EL SUPER
	}
}