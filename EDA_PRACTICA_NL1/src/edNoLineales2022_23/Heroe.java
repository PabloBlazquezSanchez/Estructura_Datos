package edNoLineales2022_23;

public class Heroe {
	
	private String nombreHeroe;
	private String nombreHeroeRelacionado;
	private int numInteracciones;


	public Heroe(String nombreHeroe, String nombreHeroeRelacionado, int numInteracciones) {
		this.nombreHeroe = nombreHeroe;
		this.nombreHeroeRelacionado = nombreHeroeRelacionado;
		this.numInteracciones = numInteracciones;
	}


	public int getNumInteracciones() {
		return numInteracciones;
	}


	public void setNumInteracciones(int numInteracciones) {
		this.numInteracciones = numInteracciones;
	}


	public String getNombreHeroe() {
		return nombreHeroe;
	}


	public void setNombreHeroe(String nombreHeroe) {
		this.nombreHeroe = nombreHeroe;
	}


	public String getNombreHeroeRelacionado() {
		return nombreHeroeRelacionado;
	}


	public void setNombreHeroeRelacionado(String nombreHeroeRelacionado) {
		this.nombreHeroeRelacionado = nombreHeroeRelacionado;
	}


	@Override
	public String toString() {
		return "H�roe: " + nombreHeroe + " | H�roe relacionado: " + nombreHeroeRelacionado + 
				" | N�mero de interacciones: " + numInteracciones;
	}


}
