package edLineales2022_23;

public abstract class PilaDinamicaRJC<R> implements Pila<R> {
	
	private NodoRJC primero;
	
	public PilaDinamicaRJC () {
		primero=null;
		/**
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
		 * */
		
		/*
		NodoRJC elemento = new NodoRJC (element);
		if(primero==null) primero=elemento;
		else {
			NodoRJC aux; //no local al siguiente bucle
			for (aux=primero;aux.getSiguiente()!=null;aux=aux.getSiguiente()) { aux.setSiguiente(elemento); }
		}
		*/
		
		NodoRJC aux = new NodoRJC (element,siguiente);
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
		 * */
		
		for(NodoRJC aux=primero; aux!=null; aux=aux.getSiguiente()) { System.out.println(aux.getElement());}
		return null;
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
		 * */
		return null;
	}

	@Override
	public boolean isEmpty() {
		/**
		Algorithm isEmpty()
			return top = null
		  end_Algorithm
		 * */
		return false;
	}

	@Override
	public int size() {
		/**
		Algorithm size()
			return size
		  end_Algorithm
		 * */
		return 0;
	}
	
}
