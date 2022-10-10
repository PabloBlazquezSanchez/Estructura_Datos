package edLineales2022_23;

public interface Stack <J> {
	
	     	/**
		   * Inserts an element at the top of the stack.
		   * @param e the element to be inserted
		   */
		public J push(int numero);
		
		/**
		   * Removes and returns the top element from the stack.
		   * @return element removed (or null if empty)
		   */
		
		public J pop() throws EmptyStackExceptionRJC;
		
		/**
		   * Returns, but does not remove, the element at the top of the stack.
		   * @return top element in the stack (or null if empty)
		   */
		public J top() throws EmptyStackExceptionRJC;
		
		/**
		   * Tests whether the stack is empty.
		   * @return true if the stack is empty, false otherwise
		   */
		public boolean isEmpty();
		/**
		   * Returns the number of elements in the stack.
		   * @return number of elements in the stack
		   */
		public int size();
		


		}

