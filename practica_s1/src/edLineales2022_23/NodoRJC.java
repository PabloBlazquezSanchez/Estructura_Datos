package edLineales2022_23;

public class NodoRJC <R> {
	NodoRJC siguiente; //Siguiente elemento de la pila dinámica
	R element;
	
	//METODOS DE CONSULTA Y ACTUALIZACIÓN
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
