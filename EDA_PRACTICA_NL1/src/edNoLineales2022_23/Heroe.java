package edNoLineales2022_23;

import Grafo.Element;

// TODO: Auto-generated Javadoc
/**
 * Clase donde se implementa el elemento Heroe.
 *
 * @param <E> the element type
 */
public class Heroe<E> implements Element {

	/**
	 * Variable String nombreHeroe. Esta variable va a guardar el nombre del héroe.
	 */
	private String nombreHeroe;

	/**
	 * Variable entera numInteracciones.
	 * Esta variable guarda el número de interacciones entre un héroe y otro.
	 */
	private int numInteracciones;

	/**
	 * Variable booleana Visitado.
	 * Esta variable guarda si se ha visitado el héroe o no.
	 */
	private boolean visitado;

	/**
	 * Variable de tipo Heroe genérica parent.
	 * Esta variable guarda el antecesor del héroe.
	 */
	private Heroe<E> parent;

	/**
	 * Variable entera distancia.
	 * Esta variable guarda la distancia que existe entre un héroe y otro.
	 */
	private int distancia;

	/**
	 * Variable genérica elemento.
	 * Elemento genérico.
	 */
	private E element;

	/**
	 * Este es el método constructor que sirve para crear un objeto de tipo Heroe que contenga un nombre y
	 * un elemento genérico.
	 *
	 * @param nombreHeroe the nombre heroe
	 * @param element     the element
	 */
	public Heroe(String nombreHeroe, E element) {
		this.element = element;
		this.nombreHeroe = nombreHeroe;
		visitado = false;
		parent = null;
		distancia = 0;
	}

	/**
	 * Este método devuelve el valor ID almacenado en la variable nombreHeroe, que a su vez
	 * está almacenado en un objeto de tipo Heroe.
	 *
	 * @return the id
	 */
	public String getID() {
		return nombreHeroe.toString();
	}

	/**
	 * Este método modifica el valor almacenado en la variable nombreHeroe, que a su
	 * vez está almacenado en un objeto de tipo Heroe.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombreHeroe = nombre;
	}

	/**
	 * Este método modifica el valor almacenado en la variable visitado, que a su
	 * vez está almacenado en un objeto de tipo Heroe.
	 *
	 * @param visited the new visited
	 */
	public void setVisited(boolean visited) {
		this.visitado = visitado;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable visitado, que a su vez
	 * está almacenado en un objeto de tipo Heroe.
	 *
	 * @return the visited
	 */
	public boolean getVisited() {
		return visitado;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable parent, que a su vez
	 * está almacenado en un objeto de tipo Heroe.
	 *
	 * @return the parent
	 */
	public Heroe<E> getParent() {
		return parent;
	}

	/**
	 * Este método modifica el valor almacenado en la variable parent, que a su
	 * vez está almacenado en un objeto de tipo Heroe.
	 *
	 * @param parent the new parent
	 */
	public void setParent(Heroe<E> parent) {
		this.parent = parent;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable genérica element, que a su vez
	 * está almacenado en un objeto de tipo Heroe.
	 *
	 * @return the element
	 */
	public E getElement() {
		return element;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable distancia, que a su vez
	 * está almacenado en un objeto de tipo Heroe.
	 *
	 * @return the distance
	 */
	public int getDistance() {
		return distancia;
	}

	/**
	 * Este método modifica el valor almacenado en la variable distancia, que a su
	 * vez está almacenado en un objeto de tipo Heroe.
	 *
	 * @param d the new distance
	 */
	public void setDistance(int d) {
		distancia = d;
	}

	/**
	 * Este método compara si dos nombres y dos elementos son iguales.
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
	
	/**
	 * Gets the nombre heroe.
	 * @return the nombre heroe
	 */
	
	public String getnombreHeroe() {
		return nombreHeroe;
	}
}