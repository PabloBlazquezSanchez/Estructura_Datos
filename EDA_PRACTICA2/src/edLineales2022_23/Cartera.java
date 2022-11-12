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
	 * Se instancia una nueva cartera (Método Constructor)
	 */
	public Cartera() { // constr
		this.cartera = new LinkedBlockingQueue<Accion>();
	}

	/** Variable entera que hará de contador del número total de acciones de la cola cartera */
	private int totalaccionescartera = 0;

	/**El beneficio total*/
	private int beneficio = 0;
	
	/**
	 * Compraracciones.
	 * 
	 * El método se encarga de crear (o comprar) una acción y añadirla a la cartera.
	 *
	 * Para poder comprar acciones, se crea una acción de tipo <Accion>, cuyos parámetros será el
	 * ID de prioridad de cada elemento de la cola, el precio de compra por paquete de acciones
	 * de la cartera y el número de acciones que se comprarán (introducir en un elemento de la Queue.
	 * 
	 * Una vez se ha creado el objeto acciones, se añade a la cartera. Es cuando se procede a aumentar
	 * el contador de acciones totales de la cartera y se notifica al usuario que se han añadido las acciones.
	 * 
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param ID_prioridad    el ID prioridad
	 * @param preciocompra    el precio de compra del paquete de acciones
	 * @param accionescomprar el número de acciones a comprar
	 */
	public void compraracciones(int ID_prioridad, int preciocompra, int accionescomprar) {
		Accion acciones = new Accion(ID_prioridad, preciocompra, accionescomprar);
		cartera.add(acciones);
		totalaccionescartera += accionescomprar;
		System.out.println("Acciones añadidas correctamente.\n");
	}

	/**
	 * Venderacciones
	 * 
	 * El método se encarga de matar (o vender) una acción, quitándola de la cola cartera.
	 * 
	 * En primer lugar se verifica si el número de acciones a vender es mayor al número total
	 * de acciones que hay en toda la cartera, ya que, de ser así, se abortará la operación y notificará
	 * al usuario del intento.
	 * 
	 * Y si no, se creará una acción auxiliar "aux" de tipo Accion cuyo valor seá el peek() de la cola
	 * (primer elemento) y una variable local que almacenará el beneficio parcial del sistema.
	 * Cabe destacar que el elemento auxiliar hace de puntero (la referencia de esa acción coincide con la del
	 * elemento peek()). Así, podemos manipularlo a nuestro antojo.
	 * 
	 * A la hora de tratar de vender un número de acciones en un elemento de la cola, pueden aparecer dos
	 * situaciones: que la cantidad de acciones a vender sea mayor o igual a las existentes en el elemento auxiliar
	 * o menor.
	 * Para el primer caso, el número de acciones a vender y el contador total de acciones de la cartera
	 * decrementa en "número de acciones del elemento auxiliar". Acto seguido se elimina de la cartera el
	 * elemento auxiliar (el peek()). El beneficio dependerá el número de acciones del elemento auxiliar.
	 * Para el segundo caso, sencillamente actualizamos la acción auxiliar, decrementando el número de acciones
	 * en "naccionesvender". También disminuirá en la misma cantidad el contador de acciones totales de la cartera.
	 * Por último, el número de acciones a vender que ha entrado como parámetro se asignará a cero, porque para este
	 * 2º caso, ya no quedarán acciones por quitar. El beneficio dependerá el número de acciones que se solicitan vender,
	 * que ha pasado como parámetro.
	 * 
	 * Este condicional se repetirá en bucle siempre y cuando queden acciones por vender (>0), y antes de acabar, la
	 * variable global va incrementando (o no si hay beneficios negativos) en función del contenido de la variable
	 * beneficio_parcial.
	 * Por último, después del bucle, se informa al usuario que las acciones se vendieron correctamente.
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param naccionesvender la cantidad de acciones a vender
	 * @param precioventa el precio de venta para las acciones
	 */
	
	public void venderacciones(int naccionesvender, int precioventa) {
	
		if (naccionesvender > totalaccionescartera) {
			System.out.println("Error: Estás intentando vender más acciones de las que hay en la cartera de acciones.");
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
	 * La única función de este método será devolver el contenido de la variable global que almacena el beneficio.
	 * Este se calculará teniendo en cuenta el (precio de venta - precio de compra) * número de acciones en cada
	 * elemento de la cartera. El cálculo se efectúa al vender las acciones.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @return beneficio
	 * */

	public int devolverbeneficio() {
		return beneficio;
	}
}
