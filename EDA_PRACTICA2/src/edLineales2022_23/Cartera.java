package edLineales2022_23;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class Cartera.
 */
public class Cartera {

	/** The cartera. */
	Queue<Accion> cartera;// = new LinkedBlockingQueue<Acciones>(); //COLA CARTERA
	int beneficio = 0;

	/**
	 * Instantiates a new cartera.
	 */
	public Cartera() { // constr
		this.cartera = new LinkedBlockingQueue<Accion>();
	}

	/** The totalaccionescartera. */
	private int totalaccionescartera = 0;

	/**
	 * Compraracciones.
	 *
	 * @param ID_prioridad    the i D prioridad
	 * @param preciocompra    the preciocompra
	 * @param accionescomprar the accionescomprar
	 */
	public void compraracciones(int ID_prioridad, int preciocompra, int accionescomprar) {
		Accion acciones = new Accion(ID_prioridad, preciocompra, accionescomprar);
		cartera.add(acciones);// la cola es "cartera"
		System.out.println("Size: " + cartera.size());
		totalaccionescartera += accionescomprar;
		System.out.println("Total acciones: " + totalaccionescartera);
		System.out.println("Acciones añadidas correctamente.\n");
	}

	/**
	 * Para poder vender una acción, se pide el precio y nº acciones (variables locales)
	 * de las acciones a vender (ambos datos pasan por un filtro de escritura). El precio servirá
	 * únicamente para calcular el beneficio.
	 * Acto seguido se declara una variable auxiliar de tipo Acciones cuyo valor será el "peek"
	 * de la cola "cartera", que tendrá una función de puntero. Así, podremos modificar la cola
	 * cómodamente, ya que si en un elemento de la cola hay menos acciones de las que se quieren
	 * vender, el número de las acciones (local) se restará a las acciones de la "cartera", y después
	 * se elimina dicho elemento de la cartera. Pero si hay más acciones en la cartera de las solicitadas,
	 * simplemente se restan como el caso anterior.
	 * Todo esto se repetirá en bucle (do-while) hasta que el número de acciones (local) sea cero.
	 *
	 * @author Pablo Blázquez Sánchez, Jesús Fernández López, Raúl Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * @param naccionesvender the naccionesvender
	 */
	
	public void venderacciones(int naccionesvender, int precioventa) {
	
		if (naccionesvender > totalaccionescartera) {
			System.out.println("Error: Estás intentando vender más acciones de las que hay en la cartera de acciones.");
		}
		else 
			do {
				Accion aux=cartera.peek(); //variable auxiliar de tipo acciones. Es como un ""puntero""
				if(aux.getNacciones()<=naccionesvender) {
					beneficio+=((precioventa-aux.getPrecio())*aux.getNacciones());
					totalaccionescartera-=aux.getNacciones();
					naccionesvender-=aux.getNacciones();
					cartera.remove(aux);
					System.out.println(naccionesvender +"vender");
					System.out.println(beneficio);
				}
				else {
					beneficio+=((precioventa-aux.getPrecio())*naccionesvender);
					System.out.println(precioventa+" " +aux.getPrecio()+" " + naccionesvender);
					totalaccionescartera-=naccionesvender;			
					naccionesvender=0;
					System.out.println(naccionesvender);
				}
			} while(naccionesvender>0);
		
	}

	public int devolverbeneficio() {
		return beneficio;
	}

}
