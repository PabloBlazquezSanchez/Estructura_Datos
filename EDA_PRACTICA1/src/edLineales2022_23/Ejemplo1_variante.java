package edLineales2022_23;

public class Ejemplo1_variante{

	/**
	 * 
	 * En el m�todo principal se van a crear las pilas est�tica y din�mica,
	 * se insertar�n los n�meros a las mismas y, posteriormente se extraen
	 * los n�meros introducidos y se imprimen en pantalla.
	 *
	 * @param args the arguments
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
	 * Escribir.
	 * Este m�todo va a imprimir en pantalla los n�meros de la pila
	 * mientras los elimina de esta.
	 *
	 * @param p es la pila
	 */
	public static void escribir (Stack<Integer> p) {
		for(int i = p.size(); i > 0; i--) {
			System.out.print(p.pop() + " ");
		}
	}
	
	/**
	 * Pushes.
	 * Este m�todo va a introducir en la pila los n�meros con ayuda de la llamada
	 * al m�todo push, que se encuentra en las clases StaticStack y DynamicStack y
	 * en la interfaz Stack
	 *
	 * @param q es la pila
	 */
	public static void pushes (Stack<Integer> q) {
		int[] enteros = {3, 67, 45, 9, 28, 33};
		for(int i=0;i<enteros.length;i++) {
			q.push(enteros[i]);
		}
	}
}
