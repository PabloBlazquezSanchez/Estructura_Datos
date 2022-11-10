package edLineales2022_23;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class Diccionario.
 */
public class Diccionario {
	
	/** The diccionario. */
	static List<Termino> diccionario;

	/**
	 * Instantiates a new diccionario.
	 */
	public Diccionario() { // constr
		this.diccionario = new LinkedList<Termino>();
	}

	/**
	 * Añadirtermino.
	 *
	 * @param palabra the palabra
	 */
	public void añadirtermino(Termino palabra) {
		boolean clave = true;
		if (diccionario.isEmpty()) {
			diccionario.add(palabra);
			System.out.println("El término ha sido añadido correctamente.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				if (nombre_revision.equals(palabra.getNombre())) {
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

	/**
	 * Eliminartermino.
	 *
	 * @param nombre the nombre
	 */
	public void eliminartermino(String nombre) {
		boolean clave = false;
		int index = 0;
		if (diccionario.isEmpty()) {
			System.out.println("El diccionario está vacío. No se puede borrar nada.");
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
			} else {
				System.out.println("No se ha encontrado ningún término con dicho nombre");
			}

		}
	}

	/**
	 * Deftermino.
	 *
	 * @param nombre the nombre
	 */
	public void deftermino(String nombre) {
		boolean clave = false;
		if (diccionario.isEmpty()) {
			System.out.println("El diccionario está vacío.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				if (nombre_revision.equals(nombre)) {
					System.out.println(nombre + ": " + element.getDefinicion());
					clave = false;
					break;
				} else {
					clave = true;
				}
			}
		}
		if (clave) {
			System.out.println("El término no se encuentra en el diccionario.");
		}

	}

	/**
	 * Tamano.
	 *
	 * @return the int
	 */
	public int tamano() {
		return diccionario.size();

	}

}
