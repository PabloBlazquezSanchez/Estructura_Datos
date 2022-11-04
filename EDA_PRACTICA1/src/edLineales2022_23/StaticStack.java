package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticStack.
 *
 * @param <R> el tipo genérico
 */
public class StaticStack<R> implements Stack<R> {

	/** La "cima" (peek o top) y la longitud de la pila. */
	private int longitud, cima;

	/** El array "S" de tipo genérico. */
	private R[] S;

	/**
	 * Instanciar una nueva pila estática a través del método constructor (crear pila).
	 * Es importante inicializar la cima a -1 (por definición de Static Stack ADT)
	 * y usar un molde "Object" para poder inicializar el array que hará de pila,
	 * ya que el lenguaje Java posee  una limitación ya que no se pueden crear de
	 * manera directa un array de genéricos.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param longitud el tamaño de la pila
	 */
	public StaticStack(int longitud) {
		this.longitud = longitud;
		this.cima = -1;
		S = (R[]) new Object[longitud]; // molde Object (lim. java)
	}

	/**
	 * Push.
	 * Se introduce un elemento a la pila. Para ello, se usa un preincremento en el peek "cima"
	 * con el fin de escribir el elemento en la posición correcta del array pila.
	 * Pero antes, se comprueba si el método size() devuelve el mismo tamaño que la variable
	 * longitud. De esta manera, podemos controlar si existe un "Stack Overflow", por lo que
	 * se duplica el tamaño del array S, renombrándolo a "newStack", y, a través de un bucle,
	 * se van introduciendo los elementos que persisten en el anterior array en el nuevo.
	 * Por último, el array S pasa a ser newStack, y el valor de la variables longitud se duplica.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param element el elemento a introducir en la pila
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
	 * Este método extrae del array S (pila) el elemento que señala "cima", por lo que
	 * primero se comprueba si la pila está vacía. En caso afirmativo, se lanza una
	 * excepción, indicando que la pila no tiene ningún elemento, y se detiene la operación.
	 * Si no está vacía, usando un decremento postfijo en "cima", se guarda el elemento
	 * proveniente del array, con el peek en su posición (al acabar la operación baja en 1) 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el elemento de tipo genérico a extraer
	 * @throws EmptyStackException the empty stack exception
	 */
	public R pop() throws EmptyStackException {
		R element;
		if (isEmpty())
			throw new EmptyStackException("\n La pila está vacía.");
		else {
			element = S[cima--];
		}
		return element;
	}

	/**
	 * Devuelve el número de elementos en la pila, para ello se suma al elemento
	 * cima una unidad debido a que la posición de un elemento dentro de un array
	 * comienza a partir del 0 y no del 1.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el número de elementos de la pila.
	 */

	public int size() {
		return cima + 1;
	}

	/**
	 * Comprueba si la pila está vacía, para ello utiliza el método size(). Si este
	 * método le devuelva 0, significa que la pila está vacía ya que no habrá ningún
	 * elemento en ella. En caso contrario, significará que tiene algún elemento.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return true si la pila está vacía, false en caso contrario
	 */

	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Este método devuelve, pero no elimina, el elemento que se encuentre en la
	 * parte superior de la pila. Para ello, accede a la posición del array donde se
	 * encuentre el ultimo elemento a través de la variable cima.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento superior de la pila (o nada si está vacía la pila)
	 * @throws EmptyStackException the empty stack exception
	 */

	public R top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("\nLa pila está vacía.");
		else
			return S[cima];
	}

}
