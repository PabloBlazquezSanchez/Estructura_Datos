package edNoLineales2022_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import Grafo.Edge;
import Grafo.Graph;
import Grafo.TreeMapGraph;
import Grafo.Vertex;

public class main {
	static TreeMapGraph<Heroe<String>, Relacion> grafo = new TreeMapGraph<Heroe<String>, Relacion>();

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
					+ "2. GRAFO.\n" + "3. GRAFO.\n" + "4. Salir\r\n"
					+ "Escriba el número de la opción que desea realizar:\n");
			opcion = (int) filtrarEscritura();
			switch (opcion) {
			case 1:
				mostrarDatos(grafo);
				break;
			case 2:
				break;
			case 3:
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
}
