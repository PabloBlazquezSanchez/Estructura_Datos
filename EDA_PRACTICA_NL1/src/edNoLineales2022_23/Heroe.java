package edNoLineales2022_23;

import Grafo.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class Heroe.
 *
 * @param <E> the element type
 */
public class Heroe<E> implements Element {

	/** The nombre heroe. */
	private String nombreHeroe;
	
	/** The num interacciones. */
	private int numInteracciones;
	
	/** The visitado. */
	private boolean visitado;
	
	/** The parent. */
	private Heroe<E> parent;
	
	/** The distancia. */
	private int distancia;
	
	/** The element. */
	private E element;

	/**
	 * Instantiates a new heroe.
	 *
	 * @param nombreHeroe the nombre heroe
	 * @param element the element
	 */
	public Heroe(String nombreHeroe, E element) {
		this.element = element;
		this.nombreHeroe = nombreHeroe;
		visitado = false;
		parent = null;
		distancia = 0;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getID() {
		return nombreHeroe.toString();
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombreHeroe = nombre;
	}

	/**
	 * Sets the visited.
	 *
	 * @param visited the new visited
	 */
	public void setVisited(boolean visited) {
		this.visitado = visitado;
	}

	/**
	 * Gets the visited.
	 *
	 * @return the visited
	 */
	public boolean getVisited() {
		return visitado;
	}

	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 */
	public Heroe<E> getParent() {
		return parent;
	}

	/**
	 * Sets the parent.
	 *
	 * @param parent the new parent
	 */
	public void setParent(Heroe<E> parent) {
		this.parent = parent;
	}

	/**
	 * Gets the element.
	 *
	 * @return the element
	 */
	public E getElement() {
		return element;
	}

	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public int getDistance() {
		return distancia;
	}

	/**
	 * Sets the distance.
	 *
	 * @param d the new distance
	 */
	public void setDistance(int d) {
		distancia = d;
	}

	/**
	 * Equals.
	 *
	 * @param n the n
	 * @return true, if successful
	 */
	public boolean equals(Heroe n) {
		return ((nombreHeroe.equals(n.getID())) && (element.equals(n.getElement())));
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return element.toString();
	}
}