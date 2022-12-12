package edNoLineales2022_23;

import Grafo.Element;

/**
 * Esta clase guarda las interacciones entre personajes.
 * 
 * @param <E> tipo generico "E"
 */
public class Relacion<E> implements Element {

	/** Es un Integer que ser� usado como llave para el v�rtice o arista.*/
	private Integer nLineas;

	/** Es un int que representa el peso de la relaci�n que hay entre dos h�roes*/
	private int peso;

	/**
	 * Es el m�todo constructor que nos permite crear el objeto Relaci�n a partir del peso y el ID
	 * 
	 * @param n El ID
	 * @param p El peso de la relaci�n
	 */
	public Relacion(int n, int p) {
		nLineas = n;
		peso = p;
	}

	/**
	 * M�todo que devuelve el peso de las interacciones entre h�roes.
	 * 
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * M�todo que devuelve el n�mero ID que nos permite identificar la relaci�n
	 * entre h�roes.
	 * 
	 * @return nLineas
	 */
	public String getID() {
		return nLineas.toString();
	}

}