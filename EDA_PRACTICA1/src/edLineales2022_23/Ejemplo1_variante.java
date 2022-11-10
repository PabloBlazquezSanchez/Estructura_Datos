package edLineales2022_23;

public class Ejemplo1_variante{

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
			pushes(pila);
			System.out.println("Pila Est�tica: ");
			escribir(pila);
			
			pila = new DynamicStack<Integer>();
			pushes(pila);
			System.out.println("\nPila Din�mica: ");
			escribir(pila);
	}
		
	/**
	 * Este m�todo va a imprimir en pantalla los n�meros de la pila
	 * mientras los elimina de esta.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
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
	 * Este m�todo va a introducir en la pila los n�meros con ayuda de la llamada
	 * al m�todo push, que se encuentra en las clases StaticStack y DynamicStack y
	 * en la interfaz Stack
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
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
