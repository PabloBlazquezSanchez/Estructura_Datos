package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticStack.
 *
 * @param <R> el tipo gen�rico
 */
public class StaticStack<R> implements Stack<R> {

	/** La "cima" (peek o top) y la longitud de la pila. */
	private int longitud, cima;

	/** El array "S" de tipo gen�rico. */
	private R[] S;

	/**
	 * Instanciar una nueva pila est�tica a trav�s del m�todo constructor (crear pila).
	 * Es importante inicializar la cima a -1 (por definici�n de Static Stack ADT)
	 * y usar un molde "Object" para poder inicializar el array que har� de pila,
	 * ya que el lenguaje Java posee  una limitaci�n ya que no se pueden crear de
	 * manera directa un array de gen�ricos.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param longitud el tama�o de la pila
	 */
	public StaticStack(int longitud) {
		this.longitud = longitud;
		this.cima = -1;
		S = (R[]) new Object[longitud]; // molde Object (lim. java)
	}

	/**
	 * Push.
	 * Se introduce un elemento a la pila. Para ello, se usa un preincremento en el peek "cima"
	 * con el fin de escribir el elemento en la posici�n correcta del array pila.
	 * Pero antes, se comprueba si el m�todo size() devuelve el mismo tama�o que la variable
	 * longitud. De esta manera, podemos controlar si existe un "Stack Overflow", por lo que
	 * se duplica el tama�o del array S, renombr�ndolo a "newStack", y, a trav�s de un bucle,
	 * se van introduciendo los elementos que persisten en el anterior array en el nuevo.
	 * Por �ltimo, el array S pasa a ser newStack, y el valor de la variables longitud se duplica.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
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
	 * Este m�todo extrae del array S (pila) el elemento que se�ala "cima", por lo que
	 * primero se comprueba si la pila est� vac�a. En caso afirmativo, se lanza una
	 * excepci�n, indicando que la pila no tiene ning�n elemento, y se detiene la operaci�n.
	 * Si no est� vac�a, usando un decremento postfijo en "cima", se guarda el elemento
	 * proveniente del array, con el peek en su posici�n (al acabar la operaci�n baja en 1) 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el elemento de tipo gen�rico a extraer
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
