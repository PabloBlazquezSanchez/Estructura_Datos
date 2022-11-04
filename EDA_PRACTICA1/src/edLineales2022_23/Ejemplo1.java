package edLineales2022_23;

public class Ejemplo1 {

	/**
	 * En el m�todo principal se van a crear las pilas est�tica y din�mica,
	 * se insertar�n los n�meros a las mismas y, posteriormente se extraen
	 * los n�meros introducidos y se imprimen en pantalla.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param args los argumentos propios del m�todo principal
	 */
	public static void main(String[] args) {
		Stack<Integer> pila = new StaticStack<Integer>(6);

		System.out.println("Pila Est�tica: ");
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
		System.out.println("\nPila Din�mica: ");

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
