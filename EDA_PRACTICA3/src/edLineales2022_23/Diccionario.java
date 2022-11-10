package edLineales2022_23;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * Clase Diccionario.
 */
public class Diccionario {

	/**  La lista diccionario donde se alamacenarán los términos. */
	static List<Termino> diccionario;

	/**
	 * 
	 * Este método sirve para crear una variable de tipo Diccionario que contenga un
	 * termino.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 */
	public Diccionario() { // constr
		this.diccionario = new LinkedList<Termino>();
	}

	/**
	 * 
	 * Este método añade un término a la variable de tipo diccionario. Comprueba si
	 * el diccionario está vacío y si lo está añade el término. En caso contrario
	 * comprueba si el término ya existe en el diccionario.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param palabra Creado con los datos especificados por el usuario
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
	 * 
	 * Este método elimina un término de la variable de tipo diccionario.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre Nombre del término escrito por el usuario
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
	 * 
	 * Este método muestra por pantalla la definición de un término introducido por
	 * teclado y que, previamente, haya sido almacenado en la variable de tipo
	 * diccionario.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre Nombre del término escrito por el usuario
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
	 * 
	 * Este método devuelve el tamaño del diccionario en el momento de la llamada.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return El número de términos del diccionario
	 */
	public int tamano() {
		return diccionario.size();

	}

}
