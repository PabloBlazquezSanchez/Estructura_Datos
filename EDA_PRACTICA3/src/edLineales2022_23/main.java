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
			System.out.println("Menú: \n" + "1.- Añadir un término al diccionario\r\n" + "2.- Eliminar un término\r\n"
					+ "3.- Localizar y presentar la definición correspondiente a un término o bien indicar que el término no está incluido en el diccionario\r\n"
					+ "4.- Indicar el número de términos definidos\r\n" + "5.- Salir\r\n"
					+ "Escriba el número de la opción que desea realizar: ");
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
				System.out.println("Error. Vuelva a escribir la opción otra vez.\n");
				break;
			}
		} while (opcion != 5);
	}

	private static void totalterminos() {
		System.out.println("El número total de términos que hay en el diccionario es: " + diccionario.size());

	}

	private static void anadirtermino() {
		String nombre;
		String definicion;
		Termino palabra;
		System.out.println("Escriba el nombre del término que quiera añadir:");
		nombre = filtrarTexto();
		System.out.println("Escriba la definición del término que quiera añadir:");
		definicion = filtrarTexto();
		palabra = new Termino(nombre, definicion);
		boolean clave = true;
		if (diccionario.isEmpty()) {
			diccionario.add(palabra);
			System.out.println("El término ha sido añadido correctamente.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				if (nombre_revision.equals(nombre)) {
					System.out.println("El término ya existe.");
					clave = false;
					break;
				} else {
					clave = true;
				}
			}

			if (clave) { // Hay que esperar que recorra toda la lista y así evitamos problemas de
							// concurrencia y comprobamos todos los terminos
				diccionario.add(palabra);
				System.out.println("El término ha sido añadido correctamente.");
			}
		}
	}

	private static void eliminartermino() {
		String nombre;
		boolean clave = false;
		System.out.println("Escriba el nombre término que quiera eliminar:");
		nombre = filtrarTexto();
		int index = 0;
		if (diccionario.isEmpty()) {
			System.out.println("La lista está vacía. No se puede borrar nada.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				index = diccionario.indexOf(element);
				if (nombre_revision.equals(nombre)) {
					System.out.println("El término ha sido borrado correctamente.");
					clave = true;

					break;
				} else {
					clave = false;
				}
			}

			if (clave) { // Hay que esperar que recorra toda la lista y así evitamos problemas de
				// concurrencia y comprobamos todos los terminos
				diccionario.remove(index);
			}else {
				System.out.println("No se ha encontrado ningún término con dicho nombre");
			}
			
		}
	}

	// Método que captura el dato introducido por teclado y comprueba si es un
	// número o un caracter
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