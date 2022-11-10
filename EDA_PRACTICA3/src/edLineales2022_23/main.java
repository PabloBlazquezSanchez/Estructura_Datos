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
	 * Este m�todo muestra por pantalla un men� con distintas opciones para realizar
	 * una acci�n. En este mismo m�todo se van a llamar a los distintos m�todos de
	 * la clase Diccionario seg�n la opci�n que se haya seleccionado.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 * 
	 */
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Men�: \n" + "1.- A�adir un t�rmino al diccionario\r\n" + "2.- Eliminar un t�rmino\r\n"
					+ "3.- Localizar y presentar la definici�n correspondiente a un t�rmino o bien indicar que el t�rmino no est� incluido en el diccionario\r\n"
					+ "4.- Indicar el n�mero de t�rminos definidos\r\n" + "5.- Salir\r\n"
					+ "Escriba el n�mero de la opci�n que desea realizar: ");
			opcion = filtrarNumero();
			switch (opcion) {
			case 1:
				System.out.println("Escriba el nombre del t�rmino que quiera a�adir:");
				String nombre = filtrarTexto();
				System.out.println("Escriba la definici�n del t�rmino que quiera a�adir:");
				String definicion = filtrarTexto();
				Termino palabra = new Termino(nombre, definicion);
				diccionario.a�adirtermino(palabra);
				break;
			case 2:
				System.out.println("Escriba el nombre t�rmino que quiera eliminar:");
				String nombre_comprobar = filtrarTexto();
				diccionario.eliminartermino(nombre_comprobar);
				break;
			case 3:
				System.out.println("Introduzca a continuaci�n el t�rmino del que desea conocer la definici�n:");
				String nombre_def = filtrarTexto();
				diccionario.deftermino(nombre_def);
				break;
			case 4:
				System.out.println("El n�mero total de t�rminos que hay en el diccionario es: " + diccionario.tamano());
				break;
			case 5:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opci�n otra vez.\n");
				break;
			}
		} while (opcion != 5);
	}

	// M�todo que captura el dato introducido por teclado y comprueba si es un
	// n�mero o un caracter
	/**
	 * Filtrar numero.
	 * 
	 * Este m�todo captura el dato introducido por teclado y analiza si se ha
	 * introducido un caracter o un n�mero. Si se introduce un caracter lanza un
	 * mensaje de error.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
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
		} catch (InputMismatchException ime) { // Detecta si el dato introducido no es un n�mero y lanza un mensaje de
												// error
			System.out.println("S�lo puede escribir n�meros. Int�ntelo de nuevo: ");
			numero = filtrarNumero(); // Vuelve a solicitar el dato
		}
		return numero;
	}

	/**
	 * Filtrar texto.
	 * 
	 * Este m�todo captura el dato introducido por teclado y analiza si se ha
	 * introducido un caracter o un n�mero. Si se introduce un n�mero lanza un
	 * mensaje de error.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
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
		} catch (InputMismatchException ime) { // Detecta si el dato introducido no es un n�mero y lanza un mensaje de
												// error
			System.out.println("Error. Int�ntelo de nuevo: ");
			texto = filtrarTexto(); // Vuelve a solicitar el dato
		}
		return texto;
	}

}