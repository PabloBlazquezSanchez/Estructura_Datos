package edLineales2022_23;

public class Acciones {

	private int precio;
	private int nacciones;
	private String mescompra;
	
	public Acciones(String mescompra,int precio,int nacciones){
		this.precio=precio;
		this.nacciones=nacciones;
		this.mescompra=mescompra;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getNacciones() {
		return nacciones;
	}

	public void setNacciones(int nacciones) {
		this.nacciones = nacciones;
	}

	public String getMescompra() {
		return mescompra;
	}

	public void setMescompra(String mescompra) {
		this.mescompra = mescompra;
	}
}
