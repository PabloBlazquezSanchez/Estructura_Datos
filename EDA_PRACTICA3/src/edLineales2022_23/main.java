package edLineales2022_23;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class main {
	static int ID = 0;
	static List<Termino> diccionario = new LinkedList<Termino>();

	public static void main(String[] args) {
		mostrarMenu();
	}

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
				anadirtermino();
				break;
			case 2:
				eliminartermino();
				break;
			case 3:
				break;
			case 4:
				totalterminos();
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

	private static void totalterminos() {
		System.out.println("El n�mero total de t�rminos que hay en el diccionario es: " + diccionario.size());

	}

	private static void anadirtermino() {
		String nombre;
		String definicion;
		Termino palabra;
		System.out.println("Escriba el nombre del t�rmino que quiera a�adir:");
		nombre = filtrarTexto();
		System.out.println("Escriba la definici�n del t�rmino que quiera a�adir:");
		definicion = filtrarTexto();
		palabra = new Termino(nombre, definicion);
		boolean clave = true;
		if (diccionario.isEmpty()) {
			diccionario.add(palabra);
			System.out.println("El t�rmino ha sido a�adido correctamente.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				if (nombre_revision.equals(nombre)) {
					System.out.println("El t�rmino ya existe.");
					clave = false;
					break;
				} else {
					clave = true;
				}
			}

			if (clave) { // Hay que esperar que recorra toda la lista y as� evitamos problemas de
							// concurrencia y comprobamos todos los terminos
				diccionario.add(palabra);
				System.out.println("El t�rmino ha sido a�adido correctamente.");
			}
		}
	}

	private static void eliminartermino() {
		String nombre;
		boolean clave = false;
		System.out.println("Escriba el nombre t�rmino que quiera eliminar:");
		nombre = filtrarTexto();
		int index = 0;
		if (diccionario.isEmpty()) {
			System.out.println("La lista est� vac�a. No se puede borrar nada.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				index = diccionario.indexOf(element);
				if (nombre_revision.equals(nombre)) {
					System.out.println("El t�rmino ha sido borrado correctamente.");
					clave = true;

					break;
				} else {
					clave = false;
				}
			}

			if (clave) { // Hay que esperar que recorra toda la lista y as� evitamos problemas de
				// concurrencia y comprobamos todos los terminos
				diccionario.remove(index);
			}else {
				System.out.println("No se ha encontrado ning�n t�rmino con dicho nombre");
			}
			
		}
	}

	// M�todo que captura el dato introducido por teclado y comprueba si es un
	// n�mero o un caracter
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