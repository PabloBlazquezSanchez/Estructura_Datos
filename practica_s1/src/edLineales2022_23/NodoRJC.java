package edLineales2022_23;

public class NodoRJC<R> {

	private R element;	
	private NodoRJC<R> next; //Siguiente elemento de la pila dinámica
	
	//CONSTRUCTOR
	public NodoRJC(R element, NodoRJC<R> next) {
		this.element = element;
		this.next = next;
	}

	//GETTERS Y SETTERS
	public R getElement() {
		return element;
	}

	public NodoRJC<R> getNext() {
		return next;
	}

	public void setElement(R element) {
		this.element = element;
	}

	public void setNext(NodoRJC<R> next) {
		this.next = next;
	}
	
	
}
