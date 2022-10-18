package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticStack.
 *
 * @param <R> the generic type
 */
public class StaticStack<R> implements Stack<R> {

	/** The cima. */
	private int longitud, cima;

	/** The s. */
	private R[] S;

	/**
	 * Instantiates a new static stack.
	 *
	 * @param longitud the longitud
	 */
	public StaticStack(int longitud) {
		this.longitud = longitud;
		this.cima = -1;
		S = (R[]) new Object[longitud]; // usamos molde Object (limitacion java)
	}

	/**
	 * Push.
	 *
	 * @param element the element
	 */
	public void push(R element) {
		if (size() == longitud) {
			// throw new StackOverflowExceptionRJC("Stack Overflow.");
			R[] newStack = (R[]) new Object[this.longitud * 2];
			for (int i = 0; i < longitud; i++) {
				newStack[i] = this.S[i];
			}
			this.S = newStack;
			this.longitud *= 2;
		}
		S[++cima] = element;
	}

	/**
	 * Pop.
	 *
	 * @return the r
	 * @throws EmptyStackException the empty stack exception
	 */
	public R pop() throws EmptyStackException {
		R element;
		if (isEmpty())
			throw new EmptyStackException("\n La pila est� vac�a.");
		else {
			element = S[cima--];
		}
		return element;
	}

	/**
	 * Devuelve el n�mero de elementos en la pila, para ello se suma al elemento
	 * cima una unidad debido a que la posici�n de un elemento dentro de un array
	 * comienza a partir del 0 y no del 1.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el n�mero de elementos de la pila.
	 */

	public int size() {
		return cima + 1;
	}

	/**
	 * Comprueba si la pila est� vac�a, para ello utiliza el m�todo size(). Si este
	 * m�todo le devuelva 0, significa que la pila est� vac�a ya que no habr� ning�n
	 * elemento en ella. En caso contrario, significar� que tiene alg�n elemento.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return true si la pila est� vac�a, false en caso contrario
	 */

	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Este m�todo devuelve, pero no elimina, el elemento que se encuentre en la
	 * parte superior de la pila. Para ello, accede a la posici�n del array donde se
	 * encuentre el ultimo elemento a trav�s de la variable cima.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento superior de la pila (o nada si est� vac�a la pila)
	 * @throws EmptyStackException the empty stack exception
	 */

	public R top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("\nLa pila est� vac�a.");
		else
			return S[cima];
	}

}
