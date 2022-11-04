package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class DynamicStack.
 *
 * @param <R> el tipo genérico
 */
public class DynamicStack<R> implements Stack<R> {

	/** El primer nodo de tipo genérico. */
	private Nodo<R> primero /* = null */; // top
	
	/** La longitud o tamaño de la pila = número de nodos. */
	private int longitud = 0; // size

	/* Estos dos atributos serviran para todo y lo unico que necesitamos */

	/**
	 * CONSTRUCTOR - Crear el objeto Almacenamos el primer elemento de la pila NOTA:
	 * Usamos el constructor para asegurarnos que primero se refiere a null. En Java
	 * no harï¿½a falta
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 */

	public DynamicStack() {
		primero = null;
	}

	/**
	 * Para insertar elementos en la pila dinámica, creamos un nodo auxiliar que
	 * contendrá el elemento a insertar (pushear). Este nuevo nodo tomará el rol
	 * de primer elemento en la pila (LIFO). Acto seguido, la longitud de la pila aumenta en 1
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param elemento a insertar
	 */
	
	public void push(R element) {
		Nodo<R> aux = new Nodo<R>(element, primero);
		primero = aux; // Refrescamos el primero o top
		longitud++;
	}

	/**
	 * Para sacar un elemento de la pila, primero verificamos si la pila está vacía.
	 * En caso afirmativo, se lanza una excepción y se detiene la operación; en caso
	 * negativo, el elemento a devolver será el actual primero, y el primero será
	 * ahora el siguiente nodo (ANTERIOR), pudiendo decrementar en 1 la longitud de la pila.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento a extraer
	 * @throws EmptyStackException excepción que comprueba si la pila está vacía
	 */
	public R pop() throws EmptyStackException {
		R element;
		if (isEmpty() /* || primero == null */)
			throw new EmptyStackException("\nLa pila estÃ¡ actualmente vacÃ­a.");
		else {
			element = primero.getElement();
			primero = primero.getNext();
			longitud--;
		}
		return element;
	}

	/**
	 * El siguiente método también devuelve el último elemento de la pila.
	 * A diferencia del método pop(), no borramos dicho elemento; será
	 * un método de consulta. No se efectuará la operación si la pila está vacía
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el elemento a consultar
	 * @throws EmptyStackException excepción que comprueba si la pila está vacía
	 * */
	public R top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("\nLa pila estÃ¡ actualmente vacÃ­a.");
		else {
			return primero.getElement();
		}
	}

	/**
	 * Comprobamos si la pila está o no vacía, a través del contenido del primer nodo
	 * (existe elemento en él o no "==null")
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return variable booleana que marca si existe o no un primer elemento
	 */
	public boolean isEmpty() {
		return primero == null;
	}	
	/**
	 * Para conocer el tamaño de la pila dinámica, simplemente devolvemos la variable
	 * global que va almacenando el tamaño de la pila, ya que es el número de nodos existentes
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el tamaño de la pila
	 */
	public int size() {
		return longitud;
	}
	
}
