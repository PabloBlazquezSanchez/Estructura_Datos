package edLineales2022_23;

public class Acciones {

	private int precio;
	private int nacciones;
	private int ID;
	
	public Acciones(int ID,int precio,int nacciones){
		this.precio=precio;
		this.nacciones=nacciones;
		this.ID=ID;
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
