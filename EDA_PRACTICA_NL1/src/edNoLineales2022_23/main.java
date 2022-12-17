package edNoLineales2022_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import Grafo.Edge;
import Grafo.Graph;
import Grafo.TreeMapGraph;
import Grafo.Vertex;

/**
 * The Class main.
 */
public class main {

	/** The grafo. */
	static TreeMapGraph<Heroe<String>, Relacion> grafo = new TreeMapGraph<Heroe<String>, Relacion>();

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException           Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void main(String[] args) throws IOException, FileNotFoundException {
		leerFichero("marvel-unimodal-edges.csv", grafo);
		mostrarMenu();
	}

	/**
	 * Mostrar menu.
	 */
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Men�: \n"
					+ "1. Mostrar el n�mero de personajes, el n�mero total de relaciones entre personajes, el personaje m�s sociable y el personaje que menos trabaja en equipo.\n"
					+ "2. Determinar la secuencia m�s corta de personajes que conecte a dos personajes dados.\n"
					+ "3. Dise�ar un equipo de personajes formado a partir de dos personajes teniendo en cuenta que el n�mero de interacciones entre ellos en el camino no sea superior a 10.\n"
					+ "4. Salir\r\n" + "Escriba el n�mero de la opci�n que desea realizar:");
			opcion = (int) filtrarEscritura();
			switch (opcion) {
			case 1:
				mostrarDatos(grafo);
				break;
			case 2:
				limpiarGrafo(grafo);
				ComprobarVertices(grafo, false);
				break;
			case 3:
				limpiarGrafo(grafo);
				ComprobarVertices(grafo, true);
				break;
			case 4:
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opci�n otra vez.\n");
				break;
			}
		} while (opcion != 4);

	}

	/**
	 * Mostrar datos.
	 *
	 * @param grafo the grafo
	 */
	private static void mostrarDatos(TreeMapGraph<Heroe<String>, Relacion> grafo) {
		System.out.println(
				"El numero de relaciones es " + grafo.getM() + " y el numero de personajes es " + grafo.getN() + ".");
		Iterator<Vertex<Heroe<String>>> iterador = grafo.getVertices();
		Vertex<Heroe<String>> vertice;
		int maximo = 0;
		int minimo = 0;
		int grado = 0;
		List<Vertex<Heroe<String>>> heroes_maximo = new LinkedList<Vertex<Heroe<String>>>();
		List<Vertex<Heroe<String>>> heroes_minimo = new LinkedList<Vertex<Heroe<String>>>();

		while (iterador.hasNext()) {
			vertice = iterador.next();
			grado = grado(grafo, vertice);

			if (minimo == 0) {
				minimo = grado;
			}
			if (grado > maximo) {
				maximo = grado;
				heroes_maximo.clear();

			}
			if (grado == maximo) {
				heroes_maximo.add(vertice);
			}

			if (grado < minimo) {
				minimo = grado;
				heroes_minimo.clear();

			}
			if (grado == minimo) {
				heroes_minimo.add(vertice);
			}
		}

		for (Vertex<Heroe<String>> element : heroes_maximo) {
			System.out.println(
					element.getID() + " es el h�roe que m�s trabaja en equipo con " + maximo + " interacciones.");
		}

		for (Vertex<Heroe<String>> element : heroes_minimo) {
			System.out.println(
					element.getID() + " es el h�roe que menos trabaja en equipo con " + minimo + " interacciones.");
		}

	}

	/**
	 * Grado.
	 *
	 * @param g the g
	 * @param v the v
	 * @return the int
	 */
	public static int grado(Graph<Heroe<String>, Relacion> g, Vertex<Heroe<String>> v) {
		Iterator<Edge<Relacion>> iterador;
		int k = 0;
		iterador = g.incidentEdges(v);
		while (iterador.hasNext()) {
			iterador.next();
			k++;
		}
		return k;
	}

	// M�todo que captura el dato introducido por teclado y comprueba si es un
	/**
	 * Filtrar escritura.
	 *
	 * @return the long
	 */
	// n�mero o un car�cter
	public static long filtrarEscritura() {
		long numero = 0;
		Scanner lectura = new Scanner(System.in);
		try {
			numero = lectura.nextLong();
		} catch (InputMismatchException ime) { // Detecta si el dato introducido no es un n�mero y lanza un mensaje de
												// error
			System.out.println("S�lo puede escribir n�meros. Int�ntelo de nuevo: ");
			numero = filtrarEscritura(); // Vuelve a solicitar el dato
		}
		return numero;
	}

	/**
	 * Leer fichero 2.
	 *
	 * @param fichero the fichero
	 * @param grafo   the grafo
	 * @throws IOException           Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	// M�todo que lee el fichero
	private static void leerFichero(String fichero, TreeMapGraph<Heroe<String>, Relacion> grafo)
			throws IOException, FileNotFoundException {
		String origen, objetivo;
		Integer peso;
		int contador = 1;
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			while ((line = br.readLine()) != null) {
				String texto = line.replaceAll("\"", "");
				String[] split = texto.split(",(?=\\S)");
				origen = split[0];
				objetivo = split[1];
				peso = Integer.parseInt(split[2]);

				Relacion relacion = new Relacion(contador, peso);

				Heroe Heroe_A = new Heroe<String>(origen, peso.toString());
				Heroe Heroe_B = new Heroe<String>(objetivo, peso.toString());

				grafo.insertEdge(Heroe_A, Heroe_B, relacion);
				contador++;

			}
		} catch (FileNotFoundException e) { // Si el fichero a buscar no existe lanza este mensaje de error y finaliza
											// el programa
			System.out.println("El fichero no existe en el directorio de b�squeda.\n"
					+ "El programa no puede continuar ejecut�ndose. Fin del Programa.");
			System.exit(0); // Finaliza el programa
		} catch (IOException e) { // Detecta otros errores
			e.printStackTrace();
		}
	}

	/**
	 * Comprobar vertices.
	 *
	 * @param gr el grado completo
	 */
	public static void ComprobarVertices(Graph<Heroe<String>, Relacion> gr, boolean flag) {
		Scanner leer_vertex = new Scanner(System.in);
		System.out.println("Escribe el nombre del h�roe desde el que hay que partir:");
		String a = leer_vertex.nextLine(); // leo toda la linea!!!
		System.out.println("Escribe el nombre del h�roe al que hay que llegar:");
		String b = leer_vertex.nextLine();

		Stack<Heroe<String>> sr = new Stack(), sf = new Stack();
		Stack<Vertex<Heroe<String>>> st = new Stack(), camino = new Stack();
		Vertex<Heroe<String>> vertice_1 = gr.getVertex(a), vertice_2 = gr.getVertex(b);

		if (vertice_1 == null || vertice_2 == null)
			System.err.println("Los datos introducidos son err�neos.");
		else {
			if (flag) {
				boolean noCaminoExistente = algoritmoDFS(gr, vertice_1, vertice_2, sr);
				if (!noCaminoExistente) {
					System.out.println("\nEl equipo que formamos con " + vertice_1.getID() + " y " + vertice_2.getID()
							+ " es:");
					long peso = sr.size();
					for (int i = 0; i < peso; i++) {
						sf.push(sr.pop());
					} // con esto obtenemos el camino (equipo) en orden (de A a B). Igual que BFS
					System.out.print(vertice_1.getElement().getnombreHeroe());
					while (!sf.isEmpty()) {
						Heroe<String> paso = sf.pop();
						System.out.print(" - " + paso.getnombreHeroe());
					}
				} else
					System.err.println(
							"No es posible formar un equipo dado a que entre ambos heroes no existe camino.\n");
			} else {
				System.out.println("\nLa secuencia m�s corta existente entre " + vertice_1.getID() + " y "
						+ vertice_2.getID() + " es:");
				st = algoritmoBFS(gr, vertice_1, vertice_2);
				long peso = st.size();
				// relleno una stack con el recorrido final, invirtiendo la primera
				System.out.print(gr.getVertex(a).getElement().getnombreHeroe() + " - ");
				for (int i = 0; i < peso; i++) {
					camino.push(st.pop());
				}
				for (int i = 0; i < peso - 1; i++) {
					Vertex<Heroe<String>> paso = camino.pop();
					System.out.print(paso.getElement().getnombreHeroe() + " - ");
				}
				Vertex<Heroe<String>> paso_final = camino.pop();
				System.out.print(paso_final.getElement().getnombreHeroe() + ".\n");
			}
			System.out.println();
		}
	}

	/**
	 * Algoritmo BFS.
	 *
	 * @param gr the gr
	 * @param v1 the v 1
	 * @param v2 the v 2
	 * @return the stack
	 */

	/* Recorrido BFS apartado 2 */
	public static Stack<Vertex<Heroe<String>>> algoritmoBFS(Graph<Heroe<String>, Relacion> gr, Vertex<Heroe<String>> v1,
			Vertex<Heroe<String>> v2/* grafo G y vertices v1 y v2 */) {
		// Le pasamos el string del nombre del vertice, este metodo luego busca el/los
		// vertice(s) correspondiente(s)
		Stack<Vertex<Heroe<String>>> s = new Stack();
		boolean notermina = true;
		Vertex<Heroe<String>> w1, w2 = null;
		Edge<Relacion> r;
		Iterator<Edge<Relacion>> i;

		v1.getElement().setVisited(true);
		s.push(v1);

		while (!s.isEmpty() && notermina) {
			w1 = s.pop();
			i = gr.incidentEdges(w1);

			while (i.hasNext() && notermina) {
				r = i.next();
				w2 = gr.opposite(w1, r);

				if (!(w2.getElement()).getVisited()) {
					(w2.getElement()).setVisited(true);
					(w2.getElement()).setParent(w1.getElement());
					(w2.getElement()).setDistance(((w1.getElement()).getDistance()) + 1);
					s.push(w2);
					notermina = !(w2.getElement().equals(v2.getElement()));
				}
			}
		}

		if (notermina)
			w2.getElement().setParent(null);
		return s;
	}

	/**
	 * Algoritmo DFS.
	 * 
	 * Este m�todo booleano es la implementaci�n de un recorrido en profundidad, que se encarga de ir marcando el v�rtice de inicio
	 * como visitado y guardar en el iterador las aristas incidentes en dicha esquina. Entonces, mientras que haya un siguiente y la variable
	 * booleana de terminaci�n est� en true (ya que marca si NO ha terminado) vamos almacenando una arista incidente y comprobamos que su
	 * peso es de hasta 10. Si cumple la condici�n, declaramos el v�rtice opuesto w1, y miramos si ya se visit�, ya que de ser as�, no llamamos
	 * al m�todo recursivo y no lo guardamos en la pila st; no nos sirve. Si el resultado del m�todo recursivo es true, sacamos de la pila w1.
	 * La llamda recursiva se hace con w1 y no con v1.
	 * @param gr el grafo
	 * @param v1 el primer v�rtice o h�roe (punto de partida)
	 * @param v2 segundo v�rtice o h�roe (destino)
	 * @param st pila donde se almacenan cada uno de los h�roes que conforman el recorrido
	 * @return noEnd
	 */
	public static boolean algoritmoDFS(Graph<Heroe<String>, Relacion> gr, Vertex<Heroe<String>> v1,
			Vertex<Heroe<String>> v2, Stack<Heroe<String>> st) {
		boolean noEnd = !v1.equals(v2);
		Edge<Relacion> r;
		Iterator<Edge<Relacion>> i;
		Vertex<Heroe<String>> w1;

		v1.getElement().setVisited(true);
		i = gr.incidentEdges(v1);
		while (i.hasNext() && noEnd) {
			r = i.next();
			if (r.getElement().getPeso() <= 10) {
				w1 = gr.opposite(v1, r);
				if (!w1.getElement().getVisited()) {
					(w1.getElement()).setVisited(true);
					st.push(w1.getElement());
					noEnd = algoritmoDFS(gr, w1, v2, st);
					if (noEnd) {
						st.pop();
					}

				}

			}
		}
		return noEnd;
	}

	/**
	 * Limpiar grafo.
	 *
	 * @param grafo the grafo
	 */
	public static void limpiarGrafo(TreeMapGraph<Heroe<String>, Relacion> grafo) {
		Iterator<Vertex<Heroe<String>>> iterador = grafo.getVertices();
		Vertex<Heroe<String>> vertice;
		while (iterador.hasNext()) {
			vertice = iterador.next();
			vertice.getElement().setVisited(false);
		}
	}
}
