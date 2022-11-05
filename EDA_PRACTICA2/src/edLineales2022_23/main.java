package edLineales2022_23;

import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class main{
	static int ID = 0;
	static Queue<Acciones> cartera = new LinkedBlockingQueue<Acciones>(); //COLA CARTERA DONDE SE GUARDAN LAS ACCIONES

	public static void main(String[] args)  {
	mostrarMenu();
}
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Menú: \n" + "1. Comprar acciones\r\n"
					+ "2. Vender acciones\r\n"
					+ "3. Ganancia de capital hasta el momento\r\n"
					+ "4. Salir\r\n"
					+ "Escriba el número de la opción que desea realizar: ");
			opcion = filtrarEscritura();
			switch (opcion) {
			case 1:
				compraracciones();
				break;
			case 2:
				venderacciones();
				break;
			case 3:
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
		
	private static void compraracciones() {
		int nacciones;
		int precio;
		/*Crear una acción*/
		System.out.println("Escribe el número de las acciones que quieras comprar:");
		nacciones=filtrarEscritura();
		System.out.println("Escribe el precio de las acciones que quieras comprar:");
		precio=filtrarEscritura();
		ID+=1; //prioridad
		Acciones acciones= new Acciones(ID,precio,nacciones);
		cartera.add(acciones);//la cola es "cartera"
		System.out.println("Acciones añadidas correctamente.\n");
		
	}
	/**
	 * Para poder vender una acción, se pide el precio y nº acciones (variables locales)
	 * de las acciones a vender (ambos datos pasan por un filtro de escritura). El precio servirá
	 * únicamente para calcular el beneficio.
	 * Acto seguido se declara una variable auxiliar de tipo Acciones cuyo valor será el "peek"
	 * de la cola "cartera", que tendrá una función de puntero. Así, podremos modificar la cola
	 * cómodamente, ya que si en un elemento de la cola hay menos acciones de las que se quieren
	 * vender, el número de las acciones (local) se restará a las acciones de la "cartera", y después
	 * se elimina dicho elemento de la cartera. Pero si hay más acciones en la cartera de las solicitadas,
	 * simplemente se restan como el caso anterior.
	 * Todo esto se repetirá en bucle (do-while) hasta que el número de acciones (local) sea cero.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * */
	
	private static void venderacciones() {
		int nacciones;
		int precio;
		/*"Matar" la accion*/
		System.out.println("Escribe el número de las acciones que quieras vender:");
		nacciones=filtrarEscritura();
		System.out.println("Escribe el precio al que vas a vender las acciones:");
		precio=filtrarEscritura();
		do {
			Acciones aux=cartera.peek(); //variable auxiliar de tipo acciones. Es como un ""puntero""
			if(aux.getNacciones()<=nacciones) {
				nacciones-=aux.getNacciones();
				cartera.remove(aux);
			}
			else {
				nacciones-=aux.getNacciones();
			}
		} while(nacciones==0);
		
	}

	/**
	 *Para evitar que al introducir un número se introduzca un carácter no deseado,
	 *se ha diseñado un pequeño método recursivo que detecta, a través de la excepción
	 *incluida en la API de Java "Input Mismatch Exception", si el carácter escrito por teclado
	 *no es un número. De ser así, se lanza el mensaje de error y se vuelve a pedir el número, llamando
	 *a la función recursiva. El ciclo acaba cuando se introduce un número, el cual se devolverá.
	 * @return número entero utilzable en cualquier método del programa
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * */
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