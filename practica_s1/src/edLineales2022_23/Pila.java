package edLineales2022_23;

public interface Pila<R> { //Type Generico lo llamo R
	public void introducir(R elemento);
	public R sacar() throws PilaVaciaExcepcion; //no puedes borrar y consultar si la pila esta vacia
	public R cima() throws PilaVaciaExcepcion; //no puedes consultar ultimo elemento si la pila esta vacia
	public boolean estaVacia();
	public int longitud();
}
