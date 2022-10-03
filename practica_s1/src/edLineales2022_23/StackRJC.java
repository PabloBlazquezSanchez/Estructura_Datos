package edLineales2022_23;

public interface StackRJC<R> { //Type Generico lo llamo R
	public void introducir(R element);
	public R sacar() throws PilaVaciaExcepcion; //no puedes borrar y consultar si la pila esta vacia
	public R cima() throws PilaVaciaExcepcion; //no puedes consultar ultimo elemento si la pila esta vacia
	public boolean estaVacia();
	public int longitud();
}
