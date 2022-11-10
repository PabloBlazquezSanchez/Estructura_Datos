package edLineales2022_23;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class main.
 */
public class main {

	/** The id. */
	static int ID = 0;

	/** The diccionario. */
	static Diccionario diccionario = new Diccionario();

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		mostrarMenu();
	}

	/**
	 * Mostrar menu.
	 * 
	 * Este método muestra por pantalla un menú con distintas opciones para realizar
	 * una acción. En este mismo método se van a llamar a los distintos métodos de
	 * la clase Diccionario según la opción que se haya seleccionado.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 * 
	 */
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Menú: \n" + "1.- Añadir un término al diccionario\r\n" + "2.- Eliminar un término\r\n"
					+ "3.- Localizar y presentar la definición correspondiente a un término o bien indicar que el término no está incluido en el diccionario\r\n"
					+ "4.- Indicar el número de términos definidos\r\n" + "5.- Salir\r\n"
					+ "Escriba el número de la opción que desea realizar: ");
			opcion = filtrarNumero();
			switch (opcion) {
			case 1:
				System.out.println("Escriba el nombre del término que quiera añadir:");
				String nombre = filtrarTexto();
				System.out.println("Escriba la definición del término que quiera añadir:");
				String definicion = filtrarTexto();
				Termino palabra = new Termino(nombre, definicion);
				diccionario.añadirtermino(palabra);
				break;
			case 2:
				System.out.println("Escriba el nombre término que quiera eliminar:");
				String nombre_comprobar = filtrarTexto();
				diccionario.eliminartermino(nombre_comprobar);
				break;
			case 3:
				System.out.println("Introduzca a continuación el término del que desea conocer la definición:");
				String nombre_def = filtrarTexto();
				diccionario.deftermino(nombre_def);
				break;
			case 4:
				System.out.println("El número total de términos que hay en el diccionario es: " + diccionario.tamano());
				break;
			case 5:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opción otra vez.\n");
				break;
			}
		} while (opcion != 5);
	}

	// Método que captura el dato introducido por teclado y comprueba si es un
	// número o un caracter
	/**
	 * Filtrar numero.
	 * 
	 * Este método captura el dato introducido por teclado y analiza si se ha
	 * introducido un caracter o un número. Si se introduce un caracter lanza un
	 * mensaje de error.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return the int
	 */

	public static int filtrarNumero() {
		int numero = 0;
		Scanner lectura = new Scanner(System.in);
		try {
			numero = lectura.nextInt();
		} catch (InputMismatchException ime) { // Detecta si el dato introducido no es un número y lanza un mensaje de
												// error
			System.out.println("Sólo puede escribir números. Inténtelo de nuevo: ");
			numero = filtrarNumero(); // Vuelve a solicitar el dato
		}
		return numero;
	}

	/**
	 * Filtrar texto.
	 * 
	 * Este método captura el dato introducido por teclado y analiza si se ha
	 * introducido un caracter o un número. Si se introduce un número lanza un
	 * mensaje de error.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return the string
	 */
	public static String filtrarTexto() {
		String texto;
		Scanner lectura = new Scanner(System.in);
		try {
			texto = lectura.next();
		} catch (InputMismatchException ime) { // Detecta si el dato introducido no es un número y lanza un mensaje de
												// error
			System.out.println("Error. Inténtelo de nuevo: ");
			texto = filtrarTexto(); // Vuelve a solicitar el dato
		}
		return texto;
	}

}