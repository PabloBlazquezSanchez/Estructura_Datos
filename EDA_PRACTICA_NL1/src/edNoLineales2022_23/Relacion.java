package edNoLineales2022_23;

import Grafo.Element;

public class Relacion <E> implements Element{
	private Integer nLineas;
	private int peso;

	public Relacion(int n, int p) {
		nLineas = n;
		peso = p;
	}

	public int getPeso() {
		return peso;
	}

	public String getID() {
		return nLineas.toString();
	}

}