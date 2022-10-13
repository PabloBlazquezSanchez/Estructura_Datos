package edLineales2022_23;

public class StaticStack<R> implements Pila<R>{
	private int longitud, cima;
	private R[] S = (R[]) new Object[longitud]; //usamos molde Object (limitacion java)
	
	

	public StaticStack(int longitud) {
		this.longitud = longitud;
		this.cima = -1;
	}

	@Override
	public void push(R element) {
		if(size()==longitud) {
			R[] newStack = (R[]) new Object[this.longitud * 2];
			for (int i = 0; i < longitud; i++) {newStack[i] = this.S[i];}
			this.S = newStack;
			this.longitud *= 2;
		}
		//S[++cima]=element;
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
