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
			System.out.println("Men�: \n" + "1. Comprar acciones\r\n"
					+ "2. Vender acciones\r\n"
					+ "3. Ganancia de capital hasta el momento\r\n"
					+ "4. Salir\r\n"
					+ "Escriba el n�mero de la opci�n que desea realizar: ");
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
				System.out.println("Error. Vuelva a escribir la opci�n otra vez.\n");
				break;
			}
		} while (opcion != 4);
	}
		
	private static void compraracciones() {
		int nacciones;
		int precio;
		/*Crear una acci�n*/
		System.out.println("Escribe el n�mero de las acciones que quieras comprar:");
		nacciones=filtrarEscritura();
		System.out.println("Escribe el precio de las acciones que quieras comprar:");
		precio=filtrarEscritura();
		ID+=1; //prioridad
		Acciones acciones= new Acciones(ID,precio,nacciones);
		cartera.add(acciones);//la cola es "cartera"
		System.out.println("Acciones a�adidas correctamente.\n");
		
	}
	/**
	 * Para poder vender una acci�n, se pide el precio y n� acciones (variables locales)
	 * de las acciones a vender (ambos datos pasan por un filtro de escritura). El precio servir�
	 * �nicamente para calcular el beneficio.
	 * Acto seguido se declara una variable auxiliar de tipo Acciones cuyo valor ser� el "peek"
	 * de la cola "cartera", que tendr� una funci�n de puntero. As�, podremos modificar la cola
	 * c�modamente, ya que si en un elemento de la cola hay menos acciones de las que se quieren
	 * vender, el n�mero de las acciones (local) se restar� a las acciones de la "cartera", y despu�s
	 * se elimina dicho elemento de la cartera. Pero si hay m�s acciones en la cartera de las solicitadas,
	 * simplemente se restan como el caso anterior.
	 * Todo esto se repetir� en bucle (do-while) hasta que el n�mero de acciones (local) sea cero.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * */
	
	private static void venderacciones() {
		int nacciones;
		int precio;
		/*"Matar" la accion*/
		System.out.println("Escribe el n�mero de las acciones que quieras vender:");
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
	 *Para evitar que al introducir un n�mero se introduzca un car�cter no deseado,
	 *se ha dise�ado un peque�o m�todo recursivo que detecta, a trav�s de la excepci�n
	 *incluida en la API de Java "Input Mismatch Exception", si el car�cter escrito por teclado
	 *no es un n�mero. De ser as�, se lanza el mensaje de error y se vuelve a pedir el n�mero, llamando
	 *a la funci�n recursiva. El ciclo acaba cuando se introduce un n�mero, el cual se devolver�.
	 * @return n�mero entero utilzable en cualquier m�todo del programa
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * */
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