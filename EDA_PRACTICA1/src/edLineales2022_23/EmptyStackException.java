package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
* Clase donde se implementa la excepci�n que ocurre cuando la pila est� vac�a
 */
public class EmptyStackException extends RuntimeException{
	
	/**
	 * Instanciar la excepci�n de la pila vac�a
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param mensajeerror el mensaje de error que se deber� mostrar para cuando se
	 * quiera lanzar una excepci�n
	 */
	public EmptyStackException (String mensajeerror) {
		super(mensajeerror); //HEREDA, DE AHI EL SUPER
	}
}