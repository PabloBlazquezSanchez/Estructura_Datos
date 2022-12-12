package edNoLineales2022_23;

import Grafo.Element;

// TODO: Auto-generated Javadoc
/**
 * Clase Relacion
 *
 * @param <E> tipo generico "E"
 */
public class Relacion<E> implements Element {

	/** numero de lineas de la relacion */
	private Integer nLineas;

	/** The peso. */
	private int peso;

	/**
	 * Instantiates a new relacion.
	 *
	 * @param n the n
	 * @param p the p
	 */
	public Relacion(int n, int p) {
		nLineas = n;
		peso = p;
	}

	/**
	 * Gets the peso.
	 *
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getID() {
		return nLineas.toString();
	}

}