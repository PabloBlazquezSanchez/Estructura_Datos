package edLineales2022_23;

public class StaticStack<R extends Object> implements Pila<R>{
	private int longitud, cima;
	private R[] S; //usamos molde Object (limitacion java)
	//private R [] S;
	
	

	public StaticStack(int longitud) {
		this.longitud = longitud;
		this.cima = -1;
		S = (R[]) new Object[longitud];
	}

	@Override
	public void push(R element) {
		if(size()==longitud) {
			//throw new StackOverflowExceptionRJC("Stack Overflow.");
			R[] nS = (R[]) new Object[this.longitud * 2];
			for (int i = 0; i < longitud; i++) {nS[i] = this.S[i];}
			this.S = nS;
			this.longitud *= 2;
		}
		S[++cima]=element;
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
