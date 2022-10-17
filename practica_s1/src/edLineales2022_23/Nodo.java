package edLineales2022_23;

public class Nodo<R> {

	private R element;	
	private Nodo<R> next; //Siguiente elemento de la pila din�mica
	
	//CONSTRUCTOR
	public Nodo(R element, Nodo<R> next) {
		this.element = element;
		this.next = next;
	}

	//GETTERS Y SETTERS
	public R getElement() {
		return element;
	}

	public Nodo<R> getNext() {
		return next;
	}

	public void setElement(R element) {
		this.element = element;
	}

	public void setNext(Nodo<R> next) {
		this.next = next;
	}
	
	
}
