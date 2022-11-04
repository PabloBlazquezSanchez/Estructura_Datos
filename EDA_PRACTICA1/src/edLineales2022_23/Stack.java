package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Interfaz de la pila
 *
 * @param <T> el tipo genérico
 */
public interface Stack<T> {

	/**
	 * Este método inserta un elemento en la parte superior de la pila.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param element Es el elemento que se debe de insertar.
	 */

	public void push(T element);

	/**
	 * Este método elimina y devuelve el elemento que se encuentre en la parte
	 * superior de la pila.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento eliminado (o nada si estÃ¡ vacÃ­a la pila)
	 * @throws EmptyStackException the empty stack exception
	 */

	public T pop() throws EmptyStackException;

	/**
	 * Este método devuelve, pero no elimina, el elemento que se encuentre en la
	 * parte superior de la pila.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento superior de la pila (o nada si está vacía la pila)
	 * @throws EmptyStackException the empty stack exception
	 */

	public T top() throws EmptyStackException;

	/**
	 * Comprueba si la pila está vacía.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return true si la pila está vacía, false en caso contrario
	 */

	public boolean isEmpty();

	/**
	 * Devuelve el número de elementos en la pila.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el número de elementos de la pila
	 */
	public int size();

}
