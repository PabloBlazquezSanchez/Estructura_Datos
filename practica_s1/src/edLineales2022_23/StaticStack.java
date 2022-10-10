package edLineales2022_23;

public class StaticStack<R> implements Pila<R>{
	private int longitud, cima;
	private R[] S = (R[]) new Object[longitud]; //usamos molde Object (limitacion java)
	
	

	public StaticStack(int longitud, R[] S) {
		this.longitud = longitud;
		this.cima = -1;
		this.S = S;
	}

	@Override
	public void push(R element) {
		if(size()==longitud) { /*|| cima == longitud - 1*/ throw new EmptyStackExceptionRJC("\nStack Overflow."); }
		else {
			cima++;
			S[cima]=element;
			//tal vez S[++cima]=element;?
		}
	}

	@Override
	public R pop() throws EmptyStackExceptionRJC {
		R element;
		if(isEmpty()) throw new EmptyStackExceptionRJC("\nThe stack is empty.");
		else {
			element = S[cima];
			cima--;
		}
		return element;
	}

	@Override
	public R top() throws EmptyStackExceptionRJC {
		if(isEmpty()) throw new EmptyStackExceptionRJC("\nThe stack is empty.");
		else return S[cima];
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return cima+1;
	}
}
