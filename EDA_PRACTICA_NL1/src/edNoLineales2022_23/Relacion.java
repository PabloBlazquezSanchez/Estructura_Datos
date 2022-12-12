package edNoLineales2022_23;

import Grafo.Element;

/**
 * Esta clase guarda las interacciones entre personajes.
 * 
 * @param <E> tipo generico "E"
 */
public class Relacion<E> implements Element {

	/** Es un Integer que será usado como llave para el vértice o arista.*/
	private Integer nLineas;

	/** Es un int que representa el peso de la relación que hay entre dos héroes*/
	private int peso;

	/**
	 * Es el método constructor que nos permite crear el objeto Relación a partir del peso y el ID
	 * 
	 * @param n El ID
	 * @param p El peso de la relación
	 */
	public Relacion(int n, int p) {
		nLineas = n;
		peso = p;
	}

	/**
	 * Método que devuelve el peso de las interacciones entre héroes.
	 * 
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Método que devuelve el número ID que nos permite identificar la relación
	 * entre héroes.
	 * 
	 * @return nLineas
	 */
	public String getID() {
		return nLineas.toString();
	}

}