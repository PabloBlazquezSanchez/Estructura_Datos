package edNoLineales2022_23;

import Grafo.Element;

public class Heroe<E> implements Element {

	private String nombreHeroe;
	private int numInteracciones;
	private boolean visitado;
	private Heroe<E> parent;
	private int distancia;
	private E element;

	public Heroe(String nombreHeroe, E element) {
		this.element = element;
		this.nombreHeroe = nombreHeroe;
		visitado = false;
		parent = null;
		distancia = 0;
	}

	
	public String getID() {
		return nombreHeroe.toString();
	}

	public void setNombre(String nombre) {
		this.nombreHeroe = nombre;
	}

	
	public void setVisited(boolean visited) {
		this.visitado = visitado;
	}


	public boolean getVisited() {
		return visitado;
	}


	public Heroe<E> getParent() {
		return parent;
	}


	public void setParent(Heroe<E> parent) {
		this.parent = parent;
	}


	public E getElement() {
		return element;
	}

	public int getDistance() {
		return distancia;
	}

	public void setDistance(int d) {
		distancia = d;
	}


	public boolean equals(Heroe n) {
		return ((nombreHeroe.equals(n.getID())) && (element.equals(n.getElement())));
	}


	public String toString() {
		return element.toString();
	}
}