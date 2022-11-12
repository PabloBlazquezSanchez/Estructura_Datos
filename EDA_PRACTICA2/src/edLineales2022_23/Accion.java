package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Clase Accion.
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
	 * @param ID el ID
	 * @param precio el precio por acci�n
	 * @param nacciones el n�mero de acciones del paquete (elemento de la cola)
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
	 * @param precio el precio actualizado
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
	 * @return el n�mero de acciones
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
	 * @param nacciones el n�mero de acciones actualizado
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
	 * @return el ID de prioridad
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
	 * @param iD el ID actualizado
	 */
	public void setID(int iD) {
		ID = iD;
	}
}
