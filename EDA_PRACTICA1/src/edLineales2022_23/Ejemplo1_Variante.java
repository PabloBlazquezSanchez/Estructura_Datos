package edLineales2022_23;

public class Ejemplo1_variante{

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
			pushes(pila);
			System.out.println("Pila Estática: ");
			escribir(pila);
			
			pila = new DynamicStack<Integer>();
			pushes(pila);
			System.out.println("\nPila Dinámica: ");
			escribir(pila);
	}
		
	/**
	 * Este método va a imprimir en pantalla los números de la pila
	 * mientras los elimina de esta.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param p es la pila
	 */
	public static void escribir (Stack<Integer> p) {
		for(int i = p.size(); i > 0; i--) {
			System.out.print(p.pop() + " ");
		}
	}
	
	/**
	 * Este método va a introducir en la pila los números con ayuda de la llamada
	 * al método push, que se encuentra en las clases StaticStack y DynamicStack y
	 * en la interfaz Stack
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param q es la pila
	 */
	public static void pushes (Stack<Integer> q) {
		int[] enteros = {3, 67, 45, 9, 28, 33};
		for(int i=0;i<enteros.length;i++) {
			q.push(enteros[i]);
		}
	}
}
