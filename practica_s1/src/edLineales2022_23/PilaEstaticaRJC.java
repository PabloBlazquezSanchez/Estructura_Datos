package edLineales2022_23;

public class PilaEstaticaRJC<R> implements Pila<R>{
	/* https://www.geeksforgeeks.org/generic-class-hierarchies-in-java/ */
	
	int t = -1, N=0; //N must be defined a priori and cannot be changed
	R [] S = (R[]) new Object[N];

	@Override
	public void push(R element) {
		/**
		Algorithm push(element)
		if t = N-1 then
		  signal an error
		else
		  t = t + 1
		  S[t] = element
		 end_if
		end_Algorithm
		 * */
		if(t==N-1) {
			throw new EmptyStackExceptionRJC("\nStack Overflow.");
			/**
		Trying to push a new element into a full stack causes an implementation-specific exception (the use of the stack should not
		depend on the implementation).
			*/
		}
		else {
			t++;
			S[t]=element;
		}
	}

	@Override
	public R pop() throws EmptyStackExceptionRJC {
		/**
		Algorithm pop()
		if isEmpty() then
		  signal an error
		else
		  element = S[t]
		  t = t - 1
		 end_if
		return element
		end_Algorithm
		 * */
		R element;
		if(isEmpty()/*|| t < 0 || t == -1*/) throw new EmptyStackExceptionRJC("\nThe Stack is actually empty.");
		else {
			element = S[t];
			t--;
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
		  return S[t]
		 end_if
		end_Algorithm
		 * */
		if(isEmpty()) throw new EmptyStackExceptionRJC("\nThe Stack is actually empty.");
		else return S[t];
	}

	@Override
	public boolean isEmpty() {
		/**
		Algorithm isEmpty()
		 return t < 0
		end_Algorithm
		 * */
		return t < 0;
	}

	@Override
	public int size() {
		/**
		Algorithm size()
		 return t + 1
		end_Algorithm
		 * */
		return t+1;
	}
	
	/**
	Redimensionar el array? Podríamos probar con los ArrayList:
	
	import java.util.ArrayList;
	
	private List<Generic Type> S = new ArrayList<Generic Type>();
	S.add(<<int>>)
	S.remove(<<int>>)
	
	el int podría ser el top "t" e ir cambiándolo con ++ o -- para que se comporte como una pila 
	*/
}
