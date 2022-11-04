package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class Nodo.
 * 
 * @param <R> el tipo genérico
 */
public class Nodo<R> {

	/** Elemento de tipo genérico */
	private R element;	
	
	/** El siguiente nodo, es decir, es el siguiente elemento de la pila dinámica. */
	private Nodo<R> next;
	
	/**
	 * Método constructor del nodo. Aquí se crea; está compuesto del contenido del nodo
	 * y un enlace al siguiente
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param element el elemento del nodo
	 * @param next el enlace al siguiente nodo
	 */
	//CONSTRUCTOR
	public Nodo(R element, Nodo<R> next) {
		this.element = element;
		this.next = next;
	}

	/**
	 * Método de consulta que devolverá el elemento del nodo
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el elemento que se desea consultar
	 */
	//GETTERS Y SETTERS
	public R getElement() {
		return element;
	}

	/**
	 * Método de consulta que devolverá el enlace al siguiente nodo
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el enlace que se desea consultar
	 */
	public Nodo<R> getNext() {
		return next;
	}

	/**
	 * Método de actualización del elemento del nodo
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param element el nuevo elemento a actualizar
	 */
	public void setElement(R element) {
		this.element = element;
	}

	/**
	 * Método de actualización del enlace al siguiente nodo
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param next el nuevo enlace 
	 */
	public void setNext(Nodo<R> next) {
		this.next = next;
	}
	
}
