package edLineales2022_23;

public interface Pila<R> { //Type Generico lo llamo R
	public void push(R element);
	public <R> R pop() throws EmptyStackExceptionRJC; //no puedes borrar y consultar si la pila esta vacia
	public <R> R top() throws EmptyStackExceptionRJC; //no puedes consultar ultimo elemento si la pila esta vacia
	public boolean isEmpty();
	public int size();
}
