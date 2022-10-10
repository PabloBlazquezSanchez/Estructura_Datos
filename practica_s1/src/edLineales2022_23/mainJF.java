package edLineales2022_23;

public class mainJF {

	    public static void main (String[] args)
	    {
	        StackJF stack = new StaticStackJF(2);
	 
	        stack.push(1);      // inserting 1 in the stack
	        stack.push(2);      // inserting 2 in the stack
	 
	        stack.pop();        // removing the top element (2)
	        stack.pop();        // removing the top element (1)
	 
	        stack.push(3);      // inserting 3 in the stack
	        stack.push(4); 
	        stack.push(5);// inserting 3 in the stack
	 
	        System.out.println("El elemento top es " + stack.top());
	        System.out.println("El tamaño de la pila es " + stack.size());
	 
	        stack.pop();        // removing the top element (3)
	 
	        // check if the stack is empty
	        if (stack.isEmpty()) {
	            System.out.println("La pila está vacia");
	        }
	        else {
	            System.out.println("La pila no está vacia");
	        }
	        System.out.println("El elemento top es " + stack.top());
	    }
	}
