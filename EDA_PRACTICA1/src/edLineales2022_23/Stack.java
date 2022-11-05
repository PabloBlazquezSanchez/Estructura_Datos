package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Interfaz de la pila
 *
 * @param <T> el tipo gen�rico
 */
public interface Stack<T> {

	/**
	 * Este m�todo inserta un elemento en la parte superior de la pila.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param element Es el elemento que se debe de insertar.
	 */

	public void push(T element);

	/**
	 * Este m�todo elimina y devuelve el elemento que se encuentre en la parte
	 * superior de la pila.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento eliminado (o nada si está vacía la pila)
	 * @throws EmptyStackException the empty stack exception
	 */

	public T pop() throws EmptyStackException;

	/**
	 * Este m�todo devuelve, pero no elimina, el elemento que se encuentre en la
	 * parte superior de la pila.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento superior de la pila (o nada si est� vac�a la pila)
	 * @throws EmptyStackException the empty stack exception
	 */

	public T top() throws EmptyStackException;

	/**
	 * Comprueba si la pila est� vac�a.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return true si la pila est� vac�a, false en caso contrario
	 */

	public boolean isEmpty();

	/**
	 * Devuelve el n�mero de elementos en la pila.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el n�mero de elementos de la pila
	 */
	public int size();

}
