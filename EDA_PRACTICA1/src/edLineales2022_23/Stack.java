package edLineales2022_23;

public interface Stack<T> {

	/**
	 * Este método inserta un elemento en la parte superior de la pila.
	 * 
	 * @param element Es el elemento que se debe de insertar.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @date Octubre 10, 2022
	 * @version 1.0
	 */

	public void push(T element);

	/**
	 * Este método elimina y devuelve el elemento que se encuentre en la parte
	 * superior de la pila.
	 * 
	 * @return elemento eliminado (o nada si está vacía la pila)
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @date Octubre 10, 2022
	 * @version 1.0
	 */

	public T pop() throws EmptyStackException;

	/**
	 * Este método devuelve, pero no elimina, el elemento que se encuentre en la
	 * parte superior de la pila.
	 * 
	 * @return elemento superior de la pila (o nada si está vacía la pila)
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @date Octubre 10, 2022
	 * @version 1.0
	 */

	public T top() throws EmptyStackException;

	/**
	 * Comprueba si la pila está vacía.
	 * 
	 * @return true si la pila está vacía, false en caso contrario
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @date Octubre 10, 2022
	 * @version 1.0
	 */

	public boolean isEmpty();

	/**
	 * Devuelve el número de elementos en la pila.
	 * 
	 * @return el número de elementos de la pila
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @date Octubre 10, 2022
	 * @version 1.0
	 */
	public int size();

}
