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
	 * Variable String nombreHeroe. Esta variable va a guardar el nombre del h�roe.
	 */
	private String nombreHeroe;

	/**
	 * Variable booleana visited.
	 * Esta variable guarda si se ha visitado el h�roe o no.
	 */
	private boolean visited;

	/**
	 * Variable de tipo Heroe gen�rica parent.
	 * Esta variable guarda el antecesor del h�roe.
	 */
	private Heroe<E> parent;

	/**
	 * Variable entera distancia.
	 * Esta variable guarda la distancia que existe entre un h�roe y otro.
	 */
	private int distancia;

	/**
	 * Variable gen�rica elemento.
	 * Elemento gen�rico.
	 */
	private E element;

	/**
	 * Este es el m�todo constructor que sirve para crear un objeto de tipo Heroe que contenga un nombre y
	 * un elemento gen�rico.
	 *
	 * @param nombreHeroe the nombre heroe
	 * @param element     the element
	 */
	public Heroe(String nombreHeroe, E element) {
		this.element = element;
		this.nombreHeroe = nombreHeroe;
		visited = false;
		parent = null;
		distancia = 0;
	}

	/**
	 * Este m�todo devuelve el valor ID almacenado en la variable nombreHeroe, que a su vez
	 * est� almacenado en un objeto de tipo Heroe.
	 *
	 * @return the id
	 */
	public String getID() {
		return nombreHeroe.toString();
	}
	

	/**
	 * Este m�todo modifica el valor almacenado en la variable nombreHeroe, que a su
	 * vez est� almacenado en un objeto de tipo Heroe.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombreHeroe = nombre;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable nombreHeroe, que a su vez
	 * est� almacenado en un objeto de tipo Heroe.
	 * 
	 * @return the nombre heroe
	 */
	
	public String getnombreHeroe() {
		return nombreHeroe;
	}
	/**
	 * Este m�todo modifica el valor almacenado en la variable visitado, que a su
	 * vez est� almacenado en un objeto de tipo Heroe.
	 *
	 * @param visited the new visited
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	/**
	 * Este m�todo devuelve el valor almacenado en la variable visitado, que a su vez
	 * est� almacenado en un objeto de tipo Heroe.
	 *
	 * @return the visited
	 */
	public boolean getVisited() {
		return visited;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable parent, que a su vez
	 * est� almacenado en un objeto de tipo Heroe.
	 *
	 * @return the parent
	 */
	public Heroe<E> getParent() {
		return parent;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable parent, que a su
	 * vez est� almacenado en un objeto de tipo Heroe.
	 *
	 * @param parent the new parent
	 */
	public void setParent(Heroe<E> parent) {
		this.parent = parent;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable gen�rica element, que a su vez
	 * est� almacenado en un objeto de tipo Heroe.
	 *
	 * @return the element
	 */
	public E getElement() {
		return element;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable distancia, que a su vez
	 * est� almacenado en un objeto de tipo Heroe.
	 *
	 * @return the distance
	 */
	public int getDistance() {
		return distancia;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable distancia, que a su
	 * vez est� almacenado en un objeto de tipo Heroe.
	 *
	 * @param d the new distance
	 */
	public void setDistance(int d) {
		distancia = d;
	}

	/**
	 * Este m�todo compara si dos nombres y dos elementos son iguales.
	 *
	 * @param n the n
	 * @return true, if successful
	 */
	public boolean equals(Heroe n) {
		return ((nombreHeroe.equals(n.getID())) && (element.equals(n.getElement())));
	}

	/**
	 * El m�todo toString imprime el valor de todas las variables contenida
	 * en un objeto de tipo Heroe en una sola cadena de texto.
	 *
	 * @return the string
	 */
	public String toString() {
		return element.toString();
	}
	

	
	
}