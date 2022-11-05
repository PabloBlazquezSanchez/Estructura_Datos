package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
* Clase donde se implementa la excepción que ocurre cuando la pila (estática) está llena
 */
public class StackOverflowException extends RuntimeException{
	
	/**
	 * Instanciar la excepción de la pila (estática) llena (Stack Overflow)
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param mensajeerror el mensaje de error que se deberá mostrar para cuando se
	 * quiera lanzar una excepción
	 */
	public StackOverflowException (String mensajeerror) {
		super(mensajeerror);
	}
}