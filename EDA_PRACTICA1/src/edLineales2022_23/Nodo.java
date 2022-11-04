package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class Nodo.
 * 
 * @param <R> el tipo gen�rico
 */
public class Nodo<R> {

	/** Elemento de tipo gen�rico */
	private R element;	
	
	/** El siguiente nodo, es decir, es el siguiente elemento de la pila din�mica. */
	private Nodo<R> next;
	
	/**
	 * M�todo constructor del nodo. Aqu� se crea; est� compuesto del contenido del nodo
	 * y un enlace al siguiente
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
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
	 * M�todo de consulta que devolver� el elemento del nodo
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el elemento que se desea consultar
	 */
	//GETTERS Y SETTERS
	public R getElement() {
		return element;
	}

	/**
	 * M�todo de consulta que devolver� el enlace al siguiente nodo
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el enlace que se desea consultar
	 */
	public Nodo<R> getNext() {
		return next;
	}

	/**
	 * M�todo de actualizaci�n del elemento del nodo
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param element el nuevo elemento a actualizar
	 */
	public void setElement(R element) {
		this.element = element;
	}

	/**
	 * M�todo de actualizaci�n del enlace al siguiente nodo
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param next el nuevo enlace 
	 */
	public void setNext(Nodo<R> next) {
		this.next = next;
	}
	
}
