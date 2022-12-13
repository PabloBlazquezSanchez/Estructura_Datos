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

public class main {
	static TreeMapGraph<Heroe<String>, Relacion> grafo = new TreeMapGraph<Heroe<String>, Relacion>();
////////// PREGUNTAR Se valorará que la búsqueda de caminos se pueda repetir a indicación del usuario. ///////
	public static void main(String[] args) throws IOException, FileNotFoundException {

		leerFichero2("marvel-unimodal-edges.csv", grafo);
		mostrarMenu();
	}

	// Método menú
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Menú: \n"
					+ "1. Mostrar el número de personajes, el número total de relaciones entre personajes, el personaje más sociable y el personaje que menos trabaja en equipo.\n"
					+ "2. Determinar la secuencia más corta de personajes que conecte a dos personajes dados.\n" + "3. Equipo.\n" + "4. Salir\r\n"
					+ "Escriba el número de la opción que desea realizar:\n");
			opcion = (int) filtrarEscritura();
			switch (opcion) {
			case 1:
				mostrarDatos(grafo);
				break;
			case 2:
				ComprobarEsquinasBFS(grafo);
				break;
			case 3:
				ComprobarEsquinasDFS(grafo);
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opción otra vez.\n");
				break;
			}
		} while (opcion != 8);

	}

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
					element.getID() + " es el héroe que más trabaja en equipo con " + maximo + " interacciones.");
		}

		for (Vertex<Heroe<String>> element : heroes_minimo) {
			System.out.println(
					element.getID() + " es el héroe que menos trabaja en equipo con " + minimo + " interacciones.");
		}

	}

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

	// Método que captura el dato introducido por teclado y comprueba si es un
	// número o un carácter
	public static long filtrarEscritura() {
		long numero = 0;
		Scanner lectura = new Scanner(System.in);
		try {
			numero = lectura.nextLong();
		} catch (InputMismatchException ime) { // Detecta si el dato introducido no es un número y lanza un mensaje de
												// error
			System.out.println("Sólo puede escribir números. Inténtelo de nuevo: ");
			numero = filtrarEscritura(); // Vuelve a solicitar el dato
		}
		return numero;
	}

	// Método que lee el fichero
	private static void leerFichero2(String fichero, TreeMapGraph<Heroe<String>, Relacion> grafo)
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
			System.out.println("El fichero no existe en el directorio de búsqueda.\n"
					+ "El programa no puede continuar ejecutándose. Fin del Programa.");
			System.exit(0); // Finaliza el programa
		} catch (IOException e) { // Detecta otros errores
			e.printStackTrace();
		}
	}

	public static void ComprobarEsquinasBFS(Graph<Heroe<String>, Relacion> gr) {
		Scanner leer_vertex = new Scanner(System.in);
		System.out.println("Escribe el nombre del héroe desde el que hay que partir:");
		String a = leer_vertex.nextLine(); // leo toda la linea!!!
		System.out.println("Escribe el nombre del héroe al que hay que llegar:");
		String b = leer_vertex.nextLine();

		Stack<Vertex<Heroe<String>>> st = new Stack();
		Vertex<Heroe<String>> vertice_1 = gr.getVertex(a);
		Vertex<Heroe<String>> vertice_2 = gr.getVertex(b);
		if (vertice_1 == null || vertice_2 == null) {
			System.err.println("Alguno de los héroes introducidos no existen.");}
		else {
			System.out.println("\nPath");
			st = algoritmoBFS(gr, vertice_1, vertice_2);
			long peso = st.size();
			// relleno una stack con el recorrido final, invirtiendo la primera
			Stack<Vertex<Heroe<String>>> camino = new Stack();
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
			// ya tengo el elemento decorado, asi que me salto gran parte del proceso
		}
	}

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
		// return w2.getElement();
		return s;
	}

	public static void ComprobarEsquinasDFS(Graph<Heroe<String>, Relacion> gr) {
		Scanner leer_vertex = new Scanner(System.in);
		System.out.println("Escribe el nombre del héroe desde el que hay que partir:");
		String a = leer_vertex.nextLine(); // leo toda la linea!!!
		System.out.println("Escribe el nombre del héroe al que hay que llegar:");
		String b = leer_vertex.nextLine();
		Stack<Edge<Relacion>> sr = new Stack(), st = new Stack();
		Vertex<Heroe<String>> vertice_1 = gr.getVertex(a);
		Vertex<Heroe<String>> vertice_2 = gr.getVertex(b);
		if (vertice_1 == null || vertice_2 == null)
			System.err.println("Alguno de los héroes no existen.");
		else {
			Vertex<Heroe<String>>[] equipo;
			boolean noCaminoExistente = algoritmoDFS(gr, vertice_1, vertice_2, sr);
			if (!noCaminoExistente) {
				while (!sr.isEmpty())
					st.push(sr.pop()); // con esto obtenemos el camino (equipo) en orden (de A a B). Igual que BFS
				System.out.println(
						"\nEl equipo que formamos con " + vertice_1.getID() + " y " + vertice_2.getID() + " es:\n");

				while (!st.isEmpty()) {
					equipo = gr.endVertices(st.pop());
					System.out.print(equipo[0].getElement().toString() + "-");
					System.out.print(equipo[1].getElement().toString() + ".");
				}
			} else
				System.err.println("No es posible formar un equipo dado a que entre ambos heroes no existe camino.\n");
		}
	}

	public static boolean algoritmoDFS(Graph<Heroe<String>, Relacion> gr, Vertex<Heroe<String>> v1,
		Vertex<Heroe<String>> v2, Stack<Edge<Relacion>> st) {
		boolean noEnd = !v1.equals(v2);
		Edge<Relacion> r;
		Iterator<Edge<Relacion>> i;
		Vertex<Heroe<String>> w1;

		v1.getElement().setVisited(true);
		i = gr.incidentEdges(v1);
		while (i.hasNext() && noEnd) {
			r = i.next();
			w1 = gr.opposite(v1, r);
			if (!w1.getElement().getVisited()) {
				st.push(r);
				System.out.println(r.getElement().getPeso()+" \n");
				if (r.getElement().getPeso() <= 10) { /* peso de la arista es hasta 10 */
					noEnd = algoritmoDFS(gr, w1, v2, st);
				}		
				
				
				if (noEnd) {
					st.pop();
				}
			}
		}
		return noEnd;
	}
}
