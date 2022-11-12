package edLineales2022_23;

// TODO: Auto-generated Javadoc
/**
 * Clase Accion.
 */
public class Accion {

	/** Precio de las acción */
	private int precio;
	
	/** Número de acción. */
	private int nacciones;
	
	/** ID de importancia de acción*/
	private int ID;
	
	/**
	 * Este metodo sirve para crear una variable de tipo Accion que contenga un ID,
	 * un precio y un número de acciones.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @param ID el ID
	 * @param precio el precio por acción
	 * @param nacciones el número de acciones del paquete (elemento de la cola)
	 */
	public Accion(int ID,int precio,int nacciones){
		this.precio=precio;
		this.nacciones=nacciones;
		this.ID=ID;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable precio, que a su vez está
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Este método modifica el valor almacenado en la variable precio, que a su vez está
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @param precio el precio actualizado
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable nacciones, que a su vez está
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @return el número de acciones
	 */
	public int getNacciones() {
		return nacciones;
	}

	/**
	 * Este método modifica el valor almacenado en la variable nacciones, que a su vez está
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @param nacciones el número de acciones actualizado
	 */
	public void setNacciones(int nacciones) {
		this.nacciones = nacciones;
	}

	/**
	 * Este método devuelve el valor almacenado en la variable ID, que a su vez está
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @return el ID de prioridad
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Este método modifica el valor almacenado en la variable ID, que a su vez está
	 * almacenado en una variable de tipo Accion.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jiménez de la Cruz
	 * @version 1.0
	 *
	 * @param iD el ID actualizado
	 */
	public void setID(int iD) {
		ID = iD;
	}
}
