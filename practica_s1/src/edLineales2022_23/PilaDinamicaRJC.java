package edLineales2022_23;

public class PilaDinamicaRJC<R> implements Pila<R> {
	
	private NodoRJC<R> primero /* = null*/; //top
	private int longitud = 0; //size
	
	/*Estos dos atributos serviran para todo y lo unico que necesitamos*/
	
	public PilaDinamicaRJC () {
		primero=null;
		
		/**
		CONSTRUCTOR - Crear el objeto
		Almacenamos el primer elemento de la pila
		NOTA: Usamos el constructor para asegurarnos que primero se refiere a null. En Java no haría falta
		*/
	}

	@Override
	public void push(R element) {
		/**
		Algorithm push(element)
			aux = new node with (element, top)
			top = aux
			size = size + 1
			end_Algorithm
		*/
		NodoRJC<R> aux = new NodoRJC<R> (element,primero);
		primero = aux; //Refrescamos el primero o top
		longitud++;
	}

	@Override
	public R pop() throws EmptyStackExceptionRJC {
		/**
		Algorithm pop()
		if isEmpty() then
		  signal an error
		else
		  element = get element of top
		  top = get next node of top
		  size = size - 1
		end_if
		return element
		end_Algorithm
		*/
		
		R element;
		if(isEmpty() /*|| primero == null*/) throw new EmptyStackExceptionRJC("\nThe stack is actually empty.");
		else {
			element = primero.getElement();
			primero = primero.getNext();
			longitud--;
		}
		return element;
	}

	@Override
	public R top() throws EmptyStackExceptionRJC {
		/**
		Algorithm top()
			if isEmpty() then
			  signal an error
			else
			  return the element of top
			 end_if
			end_Algorithm
		*/
		
		if(isEmpty()) throw new EmptyStackExceptionRJC("\nThe stack is actually empty.");
		else {
			return primero.getElement();
		}
	}

	@Override
	public boolean isEmpty() {
		/**
		Algorithm isEmpty()
			return top = null
		  end_Algorithm
		 * */
		return primero == null;
	}

	@Override
	public int size() {
		/**
		Algorithm size()
			return size
		  end_Algorithm
		 * */
		return longitud;
	}
	
}
