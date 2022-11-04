package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class DynamicStack.
 *
 * @param <R> el tipo gen�rico
 */
public class DynamicStack<R> implements Stack<R> {

	/** El primer nodo de tipo gen�rico. */
	private Nodo<R> primero /* = null */; // top
	
	/** La longitud o tama�o de la pila = n�mero de nodos. */
	private int longitud = 0; // size

	/* Estos dos atributos serviran para todo y lo unico que necesitamos */

	/**
	 * CONSTRUCTOR - Crear el objeto Almacenamos el primer elemento de la pila NOTA:
	 * Usamos el constructor para asegurarnos que primero se refiere a null. En Java
	 * no har�a falta
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 */

	public DynamicStack() {
		primero = null;
	}

	/**
	 * Para insertar elementos en la pila din�mica, creamos un nodo auxiliar que
	 * contendr� el elemento a insertar (pushear). Este nuevo nodo tomar� el rol
	 * de primer elemento en la pila (LIFO). Acto seguido, la longitud de la pila aumenta en 1
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
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
	 * Para sacar un elemento de la pila, primero verificamos si la pila est� vac�a.
	 * En caso afirmativo, se lanza una excepci�n y se detiene la operaci�n; en caso
	 * negativo, el elemento a devolver ser� el actual primero, y el primero ser�
	 * ahora el siguiente nodo (ANTERIOR), pudiendo decrementar en 1 la longitud de la pila.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return elemento a extraer
	 * @throws EmptyStackException excepci�n que comprueba si la pila est� vac�a
	 */
	public R pop() throws EmptyStackException {
		R element;
		if (isEmpty() /* || primero == null */)
			throw new EmptyStackException("\nLa pila está actualmente vacía.");
		else {
			element = primero.getElement();
			primero = primero.getNext();
			longitud--;
		}
		return element;
	}

	/**
	 * El siguiente m�todo tambi�n devuelve el �ltimo elemento de la pila.
	 * A diferencia del m�todo pop(), no borramos dicho elemento; ser�
	 * un m�todo de consulta. No se efectuar� la operaci�n si la pila est� vac�a
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el elemento a consultar
	 * @throws EmptyStackException excepci�n que comprueba si la pila est� vac�a
	 * */
	public R top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("\nLa pila está actualmente vacía.");
		else {
			return primero.getElement();
		}
	}

	/**
	 * Comprobamos si la pila est� o no vac�a, a trav�s del contenido del primer nodo
	 * (existe elemento en �l o no "==null")
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return variable booleana que marca si existe o no un primer elemento
	 */
	public boolean isEmpty() {
		return primero == null;
	}	
	/**
	 * Para conocer el tama�o de la pila din�mica, simplemente devolvemos la variable
	 * global que va almacenando el tama�o de la pila, ya que es el n�mero de nodos existentes
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return el tama�o de la pila
	 */
	public int size() {
		return longitud;
	}
	
}
