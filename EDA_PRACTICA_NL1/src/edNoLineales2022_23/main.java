package edNoLineales2022_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
		public static void main(String[] args) throws IOException, FileNotFoundException {
			leerFichero2("marvel-unimodal-edges.csv");
			mostrarMenu();
		}
		
		//Método menú
		public static void mostrarMenu() {
			int opcion = 0;
			do {
				System.out.println("Menú: \n" + "1. GRAFO.\n"
						+ "2. GRAFO.\n"
						+ "3. GRAFO.\n");
				opcion = (int) filtrarEscritura();
				switch (opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				default:
					break;
				}
			} while (opcion != 8);

		}
		
		
		
		//Método que captura el dato introducido por teclado y comprueba si es un número o un carácter
		public static long filtrarEscritura() {
			long numero = 0;
			Scanner lectura = new Scanner(System.in);
			try {
				numero = lectura.nextLong();
			} catch (InputMismatchException ime) { //Detecta si el dato introducido no es un número y lanza un mensaje de error
				System.out.println("Sólo puede escribir números. Inténtelo de nuevo: ");
				numero = filtrarEscritura(); //Vuelve a solicitar el dato
			}
			return numero;
		}
		
		//Método que lee el fichero
		private static void leerFichero2(String fichero) throws IOException, FileNotFoundException {
		String origen, objetivo;
		int peso;
		int contador=0;
			String line;
			try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
				while ((line = br.readLine()) != null) {
					String texto= line.replaceAll("\"", "");
					String[] split = texto.split(",(?=\\S)");
					origen = split[0];
					objetivo = split[1];
					peso = Integer.parseInt(split[2]);
					contador++;
					System.out.println(contador+ ".- Origen: "+origen+" 			Destino: "+ split[1]+ " 		Peso: "+peso);
				}
			} catch(FileNotFoundException e) { //Si el fichero a buscar no existe lanza este mensaje de error y finaliza el programa
				System.out.println("El fichero no existe en el directorio de búsqueda.\n"
						+ "El programa no puede continuar ejecutándose. Fin del Programa.");
				System.exit(0); //Finaliza el programa
			} catch (IOException e) { //Detecta otros errores
				e.printStackTrace();
			}
		}
	}
