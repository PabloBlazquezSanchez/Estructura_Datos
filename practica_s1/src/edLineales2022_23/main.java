package edLineales2022_23;

public class main{
	
	public static void main (String[] args) {
		
		StaticStack <Integer> stack = new StaticStack <Integer> (2);
 
        stack.push(1);      // inserting 1 in the stack
        stack.push(2);      // inserting 2 in the stack
 
        stack.pop();        // removing the top element (2)
        stack.pop();        // removing the top element (1)
 
        stack.push(3);      // inserting 3 in the stack
        stack.push(4); 
        stack.push(5);// inserting 3 in the stack
 
        System.out.println("El elemento top es " + stack.top());
        System.out.println("La longitud de la pila es " + stack.size());
 
        stack.pop();        // removing the top element (3)
 
        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("La pila esta vacia");
        }
        else {
            System.out.println("La pila no esta vacia");
        }
        System.out.println("El elemento top es " + stack.top());
    }
}