package edLineales2022_23;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * Clase Diccionario.
 */
public class Diccionario {

	/**  La lista diccionario donde se alamacenar�n los t�rminos. */
	static List<Termino> diccionario;

	/**
	 * 
	 * Este m�todo sirve para crear una variable de tipo Diccionario que contenga un
	 * termino.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 */
	public Diccionario() { // constr
		this.diccionario = new LinkedList<Termino>();
	}

	/**
	 * 
	 * Este m�todo a�ade un t�rmino a la variable de tipo diccionario. Comprueba si
	 * el diccionario est� vac�o y si lo est� a�ade el t�rmino. En caso contrario
	 * comprueba si el t�rmino ya existe en el diccionario.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param palabra Creado con los datos especificados por el usuario
	 */
	public void a�adirtermino(Termino palabra) {
		boolean clave = true;
		if (diccionario.isEmpty()) {
			diccionario.add(palabra);
			System.out.println("El t�rmino ha sido a�adido correctamente.");
		} else {
			for (Termino element : diccionario) {
				String nombre_revision = element.getNombre();
				if (nombre_revision.equals(palabra.getNombre())) {
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

	/**
	 * 
	 * Este m�todo elimina un t�rmino de la variable de tipo diccionario.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre Nombre del t�rmino escrito por el usuario
	 */
	public void eliminartermino(String nombre) {
		boolean clave = false;
		int index = 0;
		if (diccionario.isEmpty()) {
			System.out.println("El diccionario est� vac�o. No se puede borrar nada.");
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
			} else {
				System.out.println("No se ha encontrado ning�n t�rmino con dicho nombre");
			}

		}
	}

	/**
	 * 
	 * Este m�todo muestra por pantalla la definici�n de un t�rmino introducido por
	 * teclado y que, previamente, haya sido almacenado en la variable de tipo
	 * diccionario.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @param nombre Nombre del t�rmino escrito por el usuario
	 */
	public void deftermino(String nombre) {
		boolean clave = false;
		if (diccionario.isEmpty()) {
			System.out.println("El diccionario est� vac�o.");
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
			System.out.println("El t�rmino no se encuentra en el diccionario.");
		}

	}

	/**
	 * 
	 * Este m�todo devuelve el tama�o del diccionario en el momento de la llamada.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la
	 *         Cruz
	 * @version 1.0
	 *
	 * @return El n�mero de t�rminos del diccionario
	 */
	public int tamano() {
		return diccionario.size();

	}

}
