package edLineales2022_23;

import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class main{
	static int ID = 0;
	static Queue<Acciones> cartera = new LinkedBlockingQueue<Acciones>();

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
		System.out.println("Escribe el n�mero de las acciones que quieras comprar:");
		nacciones=filtrarEscritura();
		System.out.println("Escribe el precio de las acciones que quieras comprar:");
		precio=filtrarEscritura();
		ID=ID+1;
		Acciones acciones= new Acciones(ID,precio,nacciones);
		cartera.add(acciones);
		System.out.println("Acciones a�adidas correctamente.\n");
		
	}
	//M�todo que captura el dato introducido por teclado y comprueba si es un n�mero o un caracter
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