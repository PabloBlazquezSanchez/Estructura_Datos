package edLineales2022_23;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Cartera {
	Queue<Acciones> cartera;// = new LinkedBlockingQueue<Acciones>(); //COLA CARTERA
	
	public Cartera() { //constr
		this.cartera = new LinkedBlockingQueue<Acciones>();
	}
	
	private int totalaccionescartera = 0;
	
//	public void recorrercartera() {
//		for (Acciones i : cartera) {
//			Acciones aux=cartera.peek();
//			totalaccionescartera+=aux.getNacciones();
//			System.out.println(totalaccionescartera);
//		}
//	}
	
	public void compraracciones(int ID_prioridad, int preciocompra, int accionescomprar) {
		Acciones acciones= new Acciones(ID_prioridad,preciocompra,accionescomprar);
		cartera.add(acciones);//la cola es "cartera"
		System.out.println("Size: "+cartera.size());
		totalaccionescartera+=accionescomprar;
		System.out.println("Total acciones: "+totalaccionescartera);
		System.out.println("Acciones a�adidas correctamente.\n");
	}
	
	/**
	 * Para poder vender una acci�n, se pide el precio y n� acciones (variables locales)
	 * de las acciones a vender (ambos datos pasan por un filtro de escritura). El precio servir�
	 * �nicamente para calcular el beneficio.
	 * Acto seguido se declara una variable auxiliar de tipo Acciones cuyo valor ser� el "peek"
	 * de la cola "cartera", que tendr� una funci�n de puntero. As�, podremos modificar la cola
	 * c�modamente, ya que si en un elemento de la cola hay menos acciones de las que se quieren
	 * vender, el n�mero de las acciones (local) se restar� a las acciones de la "cartera", y despu�s
	 * se elimina dicho elemento de la cartera. Pero si hay m�s acciones en la cartera de las solicitadas,
	 * simplemente se restan como el caso anterior.
	 * Todo esto se repetir� en bucle (do-while) hasta que el n�mero de acciones (local) sea cero.
	 * @author Pablo Bl�zquez S�nchez, Jes�s Fern�ndez L�pez, Ra�l Jimenez de la
	 *         Cruz.
	 * @version 1.0
	 * */
	
	public void venderacciones(int naccionesvender) {
		
//		do {
//			Acciones aux=cartera.peek(); //variable auxiliar de tipo acciones. Es como un ""puntero""
//			if(aux.getNacciones()<=naccionesvender) {
//				naccionesvender-=aux.getNacciones();
//				cartera.remove(aux);
//			}
//			else {
//				naccionesvender-=aux.getNacciones();
//			}
//		} while(naccionesvender==0);
		
		if (naccionesvender > totalaccionescartera) {
			System.out.println("Error: Est�s intentando vender m�s acciones de las que hay en la cartera de acciones.");
		}
		else {
			do {
				Acciones aux=cartera.peek(); //variable auxiliar de tipo acciones. Es como un ""puntero""
				if(aux.getNacciones()<=naccionesvender) {
					totalaccionescartera-=aux.getNacciones();
					naccionesvender-=aux.getNacciones();
					cartera.remove(aux);
					System.out.println("Size: "+cartera.size());
					venderacciones(naccionesvender);
				}
				else {
					totalaccionescartera-=naccionesvender;
				}
				naccionesvender-=aux.getNacciones();
				System.out.println("Total acciones: "+totalaccionescartera);
				System.out.println("Size: "+cartera.size());
			} while(naccionesvender>0);
		}
	}
	
	
}
