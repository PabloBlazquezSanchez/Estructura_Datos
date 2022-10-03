package edLineales2022_23;

public interface StackRJC<R> { //Type Generico lo llamo R
	public void push(R element);
	public R pop() throws PilaVaciaException; //no puedes borrar y consultar si la pila esta vacia
	public R top() throws PilaVaciaException; //no puedes consultar ultimo elemento si la pila esta vacia
	public boolean isEmpty();
	public int size();
}
