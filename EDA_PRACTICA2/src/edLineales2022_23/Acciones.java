package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * The Class Acciones.
 */
public class Acciones {

	/** The precio. */
	private int precio;
	
	/** The nacciones. */
	private int nacciones;
	
	/** The id. */
	private int ID;
	
	/**
	 * Instantiates a new acciones.
	 *
	 * @param ID the id
	 * @param precio the precio
	 * @param nacciones the nacciones
	 */
	public Acciones(int ID,int precio,int nacciones){
		this.precio=precio;
		this.nacciones=nacciones;
		this.ID=ID;
	}

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Gets the nacciones.
	 *
	 * @return the nacciones
	 */
	public int getNacciones() {
		return nacciones;
	}

	/**
	 * Sets the nacciones.
	 *
	 * @param nacciones the new nacciones
	 */
	public void setNacciones(int nacciones) {
		this.nacciones = nacciones;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Sets the id.
	 *
	 * @param iD the new id
	 */
	public void setID(int iD) {
		ID = iD;
	}
}
