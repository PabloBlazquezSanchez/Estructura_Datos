package edLineales2022_23;

public class Ejemplo1_variantissima{

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		
			Stack<Integer> pila = new StaticStack<Integer>(6);
			pushes(pila);
			System.out.println("Pila Est�tica: ");
			escribir(pila);
			
			pila = new DynamicStack<Integer>();
			pushes(pila);
			System.out.println("\nPila Din�mica: ");
			escribir(pila);
	}
		
	public static void escribir (Stack<Integer> p) {
		for(int i = p.size(); i > 0; i--) {
			System.out.print(p.pop() + " ");
		}
	}
	
	public static void pushes (Stack<Integer> q) {
		int[] enteros = {3, 67, 45, 9, 28, 33};
		for(int i=0;i<enteros.length;i++) {
			q.push(enteros[i]);
		}
	}
}
