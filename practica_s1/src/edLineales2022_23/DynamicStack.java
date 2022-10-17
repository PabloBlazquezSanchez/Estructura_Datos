package edLineales2022_23;

public class DynamicStack<R> implements Stack<R> {

	private Nodo<R> primero /* = null */; // top
	private int longitud = 0; // size

	/* Estos dos atributos serviran para todo y lo unico que necesitamos */

	/**
	 * CONSTRUCTOR - Crear el objeto Almacenamos el primer elemento de la pila NOTA:
	 * Usamos el constructor para asegurarnos que primero se refiere a null. En Java
	 * no har�a falta
	 */

	public DynamicStack() {
		primero = null;
	}

	public void push(R element) {
		Nodo<R> aux = new Nodo<R>(element, primero);
		primero = aux; // Refrescamos el primero o top
		longitud++;
	}

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

	public R top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("\nLa pila está actualmente vacía.");
		else {
			return primero.getElement();
		}
	}

	public boolean isEmpty() {
		return primero == null;
	}

	@Override
	public int size() {
		return longitud;
	}

}
