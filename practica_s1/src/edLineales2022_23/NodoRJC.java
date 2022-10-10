package edLineales2022_23;

public class NodoRJC <R> {
	NodoRJC <R> siguiente; //Siguiente elemento de la pila din�mica
	R element;
	
	//CONSTRUCTOR
	public NodoRJC(R element ,NodoRJC<R> nodo) {
		nodo = siguiente;
		this.element = element;
	}
	//METODOS DE CONSULTA Y ACTUALIZACI�N
	public NodoRJC getSiguiente() {
		return siguiente;
	}
	public R getElement() {
		return element;
	}
	public void setSiguiente(NodoRJC siguiente) {
		this.siguiente = siguiente;
	}
	public void setElement(R element) {
		this.element = element;
	}
}
