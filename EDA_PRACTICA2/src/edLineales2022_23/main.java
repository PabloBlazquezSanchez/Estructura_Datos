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
	
	/** El ID de prioridad de cada elemento de la cola cartera. */
	static int ID = 0;
	
	/** La cartera (objeto tipo cartera) */
	static Cartera cartera = new Cartera();
	
	/** The beneficio. */
	//static int beneficio = 0;
	
	
	/**
	 * El método principal.
	 * Está compuesto únicamente de un llamamiento a la función para mostrar el menú
	 * @param args los argumentos
	 */
	public static void main(String[] args)  {
	mostrarMenu();
}
	
	/**
	 * Mostrar menu.
	 * 
	 * Este método es una serie de "cases-switch", en el que cada opción (1-4) representará una función que hará
	 * el programa. El caso default será un número no admitido y los carácteres no admitidos se tratan en el método
	 * filtrarescritura().
	 * 
	 * El menú se ejecutará en bucle, y este terminará con la opción 4, que corresponde a salir del programa.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 */
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Menú: \n"
					+ "1. Comprar acciones\r\n"
					+ "2. Vender acciones\r\n"
					+ "3. Ganancia de capital hasta el momento\r\n"
					+ "4. Salir\r\n"
					+ "Escriba el número de la opción que desea realizar: ");
			opcion = filtrarEscritura();
			switch (opcion) {
			case 1:
				System.out.println("Escribe el número de las acciones que quieras comprar: ");
				int accionescomprar=filtrarEscritura();
				System.out.println("Escribe el precio de las acciones que quieras comprar: ");
				int precioaccicomprar=filtrarEscritura();
				ID+=1;
				cartera.compraracciones(ID,precioaccicomprar,accionescomprar);
				break;
			case 2:
				int naccionesvender,precioventa;
				System.out.println("Escribe el número de las acciones que quieras vender:");
				naccionesvender=filtrarEscritura();
				System.out.println("Escribe el precio de las acciones que quieras vender:");
				precioventa=filtrarEscritura();
				cartera.venderacciones(naccionesvender,precioventa);
				break;
			case 3:
				System.out.println("El beneficio total que se ha obtenido es un total de "+cartera.devolverbeneficio());
				break;
			case 4:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opción otra vez.\n");
				break;
			}
		} while (opcion != 4);
	}

	/**
	 * Para evitar que al introducir un número se introduzca un carácter no deseado,
	 * se ha diseñado un pequeño método recursivo que detecta, a través de la excepción
	 * incluida en la API de Java "Input Mismatch Exception", si el carácter escrito por teclado
	 * no es un número. De ser así, se lanza el mensaje de error y se vuelve a pedir el número, llamando
	 * a la función recursiva. El ciclo acaba cuando se introduce un número, el cual se devolverá.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return número entero utilzable en cualquier método del programa
	 */
	public static int filtrarEscritura() {
		int numero = 0;
		Scanner lectura = new Scanner(System.in);
		try {
			numero = lectura.nextInt();
		} catch (InputMismatchException ime) { //Detecta si el dato introducido no es un número y lanza un mensaje de error
			System.out.println("Sólo puede escribir números. Inténtelo de nuevo: ");
			numero = filtrarEscritura(); //Vuelve a solicitar el dato
		}
		return numero;
	}
}