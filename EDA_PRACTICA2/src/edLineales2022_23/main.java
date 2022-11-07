package edLineales2022_23;

import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class main.
 */
public class main{
	
	/** The id. */
	static int ID = 0;
	
	/** The cartera. */
	static Cartera cartera = new Cartera();
	
	/** The beneficio. */
	static int beneficio = 0;
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)  {
	mostrarMenu();
}
	
	/**
	 * Mostrar menu.
	 */
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Men�: \n" + "1. Comprar acciones\r\n"
					+ "2. Vender acciones\r\n"
					+ "3. Ganancia de capital hasta el momento\r\n"
					+ "4. Salir\r\n"
					+ "Escriba el n�mero de la opci�n que desea realizar: ");
			opcion = filtrarEscritura();
			switch (opcion) {
			case 1:
				System.out.println("Acciones a comprar: ");
				int accionescomprar=filtrarEscritura();
				System.out.println("Precio acciones a comprar: ");
				int precioaccicomprar=filtrarEscritura();
				ID+=1;
				cartera.compraracciones(ID,precioaccicomprar,accionescomprar);
				break;
			case 2:
				int naccionesvender,precioventa;
				System.out.println("Escribe el n�mero de las acciones que quieras vender:");
				naccionesvender=filtrarEscritura();
				System.out.println("Escribe el precio de las acciones que quieras vender:");
				precioventa=filtrarEscritura();
				cartera.venderacciones(naccionesvender);
				break;
			case 3:
				break;
			case 4:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opci�n otra vez.\n");
				break;
			}
		} while (opcion != 4);
	}

	/**
	 * Para evitar que al introducir un n�mero se introduzca un car�cter no deseado,
	 * se ha dise�ado un peque�o m�todo recursivo que detecta, a trav�s de la excepci�n
	 * incluida en la API de Java "Input Mismatch Exception", si el car�cter escrito por teclado
	 * no es un n�mero. De ser as�, se lanza el mensaje de error y se vuelve a pedir el n�mero, llamando
	 * a la funci�n recursiva. El ciclo acaba cuando se introduce un n�mero, el cual se devolver�.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return n�mero entero utilzable en cualquier m�todo del programa
	 */
	public static int filtrarEscritura() {
		int numero = 0;
		Scanner lectura = new Scanner(System.in);
		try {
			numero = lectura.nextInt();
		} catch (InputMismatchException ime) { //Detecta si el dato introducido no es un n�mero y lanza un mensaje de error
			System.out.println("S�lo puede escribir n�meros. Int�ntelo de nuevo: ");
			numero = filtrarEscritura(); //Vuelve a solicitar el dato
		}
		return numero;
	}
}