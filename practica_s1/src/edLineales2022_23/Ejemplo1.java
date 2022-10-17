package edLineales2022_23;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> pila = new StaticStack<Integer>(6);
		
		System.out.println("Pila Estática: ");
		pila.push(3);
		pila.push(67);
		pila.push(45);
		pila.push(9);
		pila.push(28);
		pila.push(33);
		
		for(int i = pila.size(); i >= 0; i--) {
			System.out.print(pila.pop() + " ");
			if(pila.isEmpty()) {
				break;
			}
		}
		
		pila = new PilaDinamicaRJC<Integer>();
		System.out.println("\nPila Dinámica: ");
		
		pila.push(3);
		pila.push(67);
		pila.push(45);
		pila.push(9);
		pila.push(28);
		pila.push(33);
		
		for(int i = pila.size(); i >= 0; i--) {
			System.out.print(pila.pop() + " ");
			if(pila.isEmpty()) {
				break;
			}
		}

	}

}
