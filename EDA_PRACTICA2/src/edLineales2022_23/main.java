package edLineales2022_23;

import java.util.InputMismatchException;
import java.util.Scanner;
public class main{
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
			opcion = (int) filtrarEscritura();
			switch (opcion) {
			case 1:
				break;
			case 2:
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
	
	
	
	//Método que captura el dato introducido por teclado y comprueba si es un número o un carácter
	public static long filtrarEscritura() {
		long numero = 0;
		Scanner lectura = new Scanner(System.in);
		try {
			numero = lectura.nextLong();
		} catch (InputMismatchException ime) { //Detecta si el dato introducido no es un número y lanza un mensaje de error
			System.out.println("Sólo puede escribir números. Inténtelo de nuevo: ");
			numero = filtrarEscritura(); //Vuelve a solicitar el dato
		}
		return numero;
	}
	
	
}