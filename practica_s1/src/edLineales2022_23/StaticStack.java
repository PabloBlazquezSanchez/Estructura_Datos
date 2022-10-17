package edLineales2022_23;

public class StaticStack<R extends Object> implements Stack<R> {
	private int longitud, cima;
	private R[] S;

	public StaticStack(int longitud) {
		this.longitud = longitud;
		this.cima = -1;
		S = (R[]) new Object[longitud]; // usamos molde Object (limitacion java)
	}

	public void push(R element) {
		if (size() == longitud) {
			// throw new StackOverflowExceptionRJC("Stack Overflow.");
			R[] newStack = (R[]) new Object[this.longitud * 2];
			for (int i = 0; i < longitud; i++) {
				newStack[i] = this.S[i];
			}
			this.S = newStack;
			this.longitud *= 2;
		}
		S[++cima] = element;
	}

	
	public R pop() throws EmptyStackExceptionRJC {
		R element;
		if (isEmpty())
			throw new EmptyStackExceptionRJC("\n La pila está vacía.");
		else {
			element = S[cima--];
		}
		return element;
	}

	
	public R top() throws EmptyStackExceptionRJC {
		if (isEmpty())
			throw new EmptyStackExceptionRJC("\nLa pila está vacía.");
		else
			return S[cima];
	}

	
	public boolean isEmpty() {
		return size() == 0;
	}

	
	public int size() {
		return cima + 1;
	}
}
