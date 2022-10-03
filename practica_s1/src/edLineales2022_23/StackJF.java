package edLineales2022_23;

public interface StackJF <T> {
		public void push(T element);
		public T pop() throws PilaVaciaException;
		public T top() throws EmptyStackException;
		public boolean isEmpty();
		public int size();
}