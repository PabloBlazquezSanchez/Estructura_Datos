package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class Nodo.
 *
 * @param <R> the generic type
 */
public class Nodo<R> {

	/** The element. */
	private R element;	
	
	/** The next. */
	private Nodo<R> next; //Siguiente elemento de la pila din�mica
	
	/**
	 * Instantiates a new nodo.
	 *
	 * @param element the element
	 * @param next the next
	 */
	//CONSTRUCTOR
	public Nodo(R element, Nodo<R> next) {
		this.element = element;
		this.next = next;
	}

	/**
	 * Gets the element.
	 *
	 * @return the element
	 */
	//GETTERS Y SETTERS
	public R getElement() {
		return element;
	}

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public Nodo<R> getNext() {
		return next;
	}

	/**
	 * Sets the element.
	 *
	 * @param element the new element
	 */
	public void setElement(R element) {
		this.element = element;
	}

	/**
	 * Sets the next.
	 *
	 * @param next the new next
	 */
	public void setNext(Nodo<R> next) {
		this.next = next;
	}
	
	
}
