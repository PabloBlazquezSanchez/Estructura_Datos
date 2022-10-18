package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class DynamicStack.
 *
 * @param <R> the generic type
 */
public class DynamicStack<R> implements Stack<R> {

	/** The primero. */
	private Nodo<R> primero /* = null */; // top
	
	/** The longitud. */
	private int longitud = 0; // size

	/* Estos dos atributos serviran para todo y lo unico que necesitamos */

	/**
	 * CONSTRUCTOR - Crear el objeto Almacenamos el primer elemento de la pila NOTA:
	 * Usamos el constructor para asegurarnos que primero se refiere a null. En Java
	 * no har�a falta
	 */

	public DynamicStack() {
		primero = null;
	}

	/**
	 * Push.
	 *
	 * @param element the element
	 */
	public void push(R element) {
		Nodo<R> aux = new Nodo<R>(element, primero);
		primero = aux; // Refrescamos el primero o top
		longitud++;
	}

	/**
	 * Pop.
	 *
	 * @return the r
	 * @throws EmptyStackException the empty stack exception
	 */
	public R pop() throws EmptyStackException {
		R element;
		if (isEmpty() /* || primero == null */)
			throw new EmptyStackException("\nLa pila está actualmente vacía.");
		else {
			element = primero.getElement();
			primero = primero.getNext();
			longitud--;
		}
		return element;
	}

	/**
	 * Top.
	 *
	 * @return the r
	 * @throws EmptyStackException the empty stack exception
	 */
	public R top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("\nLa pila está actualmente vacía.");
		else {
			return primero.getElement();
		}
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return primero == null;
	}

	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return longitud;
	}

}
