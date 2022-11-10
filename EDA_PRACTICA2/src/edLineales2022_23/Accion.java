package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Clase acci�n
 */
public class Accion {

	/** Precio de las acci�n */
	private int precio;
	
	/** N�mero de acci�n. */
	private int nacciones;
	
	/** ID de importancia de acci�n*/
	private int ID;
	
	/**
	 * Este metodo sirve para crear una variable de tipo Accion que contenga un ID,
	 * un precio y un n�mero de acciones.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @param ID the id
	 * @param precio the precio
	 * @param nacciones the nacciones
	 */
	public Accion(int ID,int precio,int nacciones){
		this.precio=precio;
		this.nacciones=nacciones;
		this.ID=ID;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable precio, que a su vez est�
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable precio, que a su vez est�
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable nacciones, que a su vez est�
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @return the nacciones
	 */
	public int getNacciones() {
		return nacciones;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable nacciones, que a su vez est�
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @param nacciones the new nacciones
	 */
	public void setNacciones(int nacciones) {
		this.nacciones = nacciones;
	}

	/**
	 * Este m�todo devuelve el valor almacenado en la variable ID, que a su vez est�
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @return the id
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Este m�todo modifica el valor almacenado en la variable ID, que a su vez est�
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jim�nez de la Cruz
	 * @version 1.0
	 *
	 * @param iD the new id
	 */
	public void setID(int iD) {
		ID = iD;
	}
}
