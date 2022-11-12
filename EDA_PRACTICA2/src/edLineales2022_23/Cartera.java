package edLineales2022_23;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class Cartera.
 */
public class Cartera {

	/** La cartera que es una cola de tipo <Accion> */
	Queue<Accion> cartera;

	/**
	 * Se instancia una nueva cartera (M�todo Constructor)
	 */
	public Cartera() { // constr
		this.cartera = new LinkedBlockingQueue<Accion>();
	}

	/** Variable entera que har� de contador del n�mero total de acciones de la cola cartera */
	private int totalaccionescartera = 0;

	/**El beneficio total*/
	private int beneficio = 0;
	
	/**
	 * Compraracciones.
	 * 
	 * El m�todo se encarga de crear (o comprar) una acci�n y a�adirla a la cartera.
	 *
	 * Para poder comprar acciones, se crea una acci�n de tipo <Accion>, cuyos par�metros ser� el
	 * ID de prioridad de cada elemento de la cola, el precio de compra por paquete de acciones
	 * de la cartera y el n�mero de acciones que se comprar�n (introducir en un elemento de la Queue.
	 * 
	 * Una vez se ha creado el objeto acciones, se a�ade a la cartera. Es cuando se procede a aumentar
	 * el contador de acciones totales de la cartera y se notifica al usuario que se han a�adido las acciones.
	 * 
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param ID_prioridad    el ID prioridad
	 * @param preciocompra    el precio de compra del paquete de acciones
	 * @param accionescomprar el n�mero de acciones a comprar
	 */
	public void compraracciones(int ID_prioridad, int preciocompra, int accionescomprar) {
		Accion acciones = new Accion(ID_prioridad, preciocompra, accionescomprar);
		cartera.add(acciones);
		totalaccionescartera += accionescomprar;
		System.out.println("Acciones a�adidas correctamente.\n");
	}

	/**
	 * Venderacciones
	 * 
	 * El m�todo se encarga de matar (o vender) una acci�n, quit�ndola de la cola cartera.
	 * 
	 * En primer lugar se verifica si el n�mero de acciones a vender es mayor al n�mero total
	 * de acciones que hay en toda la cartera, ya que, de ser as�, se abortar� la operaci�n y notificar�
	 * al usuario del intento.
	 * 
	 * Y si no, se crear� una acci�n auxiliar "aux" de tipo Accion cuyo valor se� el peek() de la cola
	 * (primer elemento) y una variable local que almacenar� el beneficio parcial del sistema.
	 * Cabe destacar que el elemento auxiliar hace de puntero (la referencia de esa acci�n coincide con la del
	 * elemento peek()). As�, podemos manipularlo a nuestro antojo.
	 * 
	 * A la hora de tratar de vender un n�mero de acciones en un elemento de la cola, pueden aparecer dos
	 * situaciones: que la cantidad de acciones a vender sea mayor o igual a las existentes en el elemento auxiliar
	 * o menor.
	 * Para el primer caso, el n�mero de acciones a vender y el contador total de acciones de la cartera
	 * decrementa en "n�mero de acciones del elemento auxiliar". Acto seguido se elimina de la cartera el
	 * elemento auxiliar (el peek()). El beneficio depender� el n�mero de acciones del elemento auxiliar.
	 * Para el segundo caso, sencillamente actualizamos la acci�n auxiliar, decrementando el n�mero de acciones
	 * en "naccionesvender". Tambi�n disminuir� en la misma cantidad el contador de acciones totales de la cartera.
	 * Por �ltimo, el n�mero de acciones a vender que ha entrado como par�metro se asignar� a cero, porque para este
	 * 2� caso, ya no quedar�n acciones por quitar. El beneficio depender� el n�mero de acciones que se solicitan vender,
	 * que ha pasado como par�metro.
	 * 
	 * Este condicional se repetir� en bucle siempre y cuando queden acciones por vender (>0), y antes de acabar, la
	 * variable global va incrementando (o no si hay beneficios negativos) en funci�n del contenido de la variable
	 * beneficio_parcial.
	 * Por �ltimo, despu�s del bucle, se informa al usuario que las acciones se vendieron correctamente.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param naccionesvender la cantidad de acciones a vender
	 * @param precioventa el precio de venta para las acciones
	 */
	
	public void venderacciones(int naccionesvender, int precioventa) {
	
		if (naccionesvender > totalaccionescartera) {
			System.out.println("Error: Est�s intentando vender m�s acciones de las que hay en la cartera de acciones.");
		}
		else 
			do {
				Accion aux=cartera.peek(); //variable auxiliar de tipo acciones. Es como un "puntero"
				int beneficio_parcial=0;
				if(aux.getNacciones()<=naccionesvender) {
					beneficio_parcial+=((precioventa-aux.getPrecio())*aux.getNacciones());
					totalaccionescartera-=aux.getNacciones();
					naccionesvender-=aux.getNacciones();
					cartera.remove(aux);
				}
				else {
					beneficio_parcial+=((precioventa-aux.getPrecio())*naccionesvender);
					totalaccionescartera-=naccionesvender;
					aux.setNacciones(aux.getNacciones()-naccionesvender);
					naccionesvender=0;
				}
				beneficio+=beneficio_parcial;
			} while(naccionesvender>0);
		System.out.println("Acciones vendidas correctamente.\n");
	}
	
	/**
	 * Devolverbeneficio.
	 * 
	 * La �nica funci�n de este m�todo ser� devolver el contenido de la variable global que almacena el beneficio.
	 * Este se calcular� teniendo en cuenta el (precio de venta - precio de compra) * n�mero de acciones en cada
	 * elemento de la cartera. El c�lculo se efect�a al vender las acciones.
	 *
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return beneficio
	 * */

	public int devolverbeneficio() {
		return beneficio;
	}
}
