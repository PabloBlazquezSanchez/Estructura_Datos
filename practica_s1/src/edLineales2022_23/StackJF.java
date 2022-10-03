package edLineales2022_23;

public interface StackJF {
		public void push(T element);
		public T pop() throws EmptyStackException;
		public T top() throws EmptyStackException;
		public boolean isEmpty();
		public int size();
}