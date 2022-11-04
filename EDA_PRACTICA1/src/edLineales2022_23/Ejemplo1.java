package edLineales2022_23;

public class Ejemplo1 {

	/**
	 * En el método principal se van a crear las pilas estática y dinámica,
	 * se insertarán los números a las mismas y, posteriormente se extraen
	 * los números introducidos y se imprimen en pantalla.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param args los argumentos propios del método principal
	 */
	public static void main(String[] args) {
		Stack<Integer> pila = new StaticStack<Integer>(6);

		System.out.println("Pila Estática: ");
		pila.push(3);
		pila.push(67);
		pila.push(45);
		pila.push(9);
		pila.push(28);
		pila.push(33);

		for (int i = pila.size(); i > 0; i--) {
			System.out.print(pila.pop() + " ");
		}

		pila = new DynamicStack<Integer>();
		System.out.println("\nPila Dinámica: ");

		pila.push(3);
		pila.push(67);
		pila.push(45);
		pila.push(9);
		pila.push(28);
		pila.push(33);

		for (int i = pila.size(); i > 0; i--) {
			System.out.print(pila.pop() + " ");
		}

	}
}
