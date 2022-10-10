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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R top() throws EmptyStackExceptionRJC {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
