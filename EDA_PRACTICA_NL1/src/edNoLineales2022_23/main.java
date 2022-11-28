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
		
		//M�todo men�
		public static void mostrarMenu() {
			int opcion = 0;
			do {
				System.out.println("Men�: \n" + "1. GRAFO.\n"
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
		
		
		
		//M�todo que captura el dato introducido por teclado y comprueba si es un n�mero o un car�cter
		public static long filtrarEscritura() {
			long numero = 0;
			Scanner lectura = new Scanner(System.in);
			try {
				numero = lectura.nextLong();
			} catch (InputMismatchException ime) { //Detecta si el dato introducido no es un n�mero y lanza un mensaje de error
				System.out.println("S�lo puede escribir n�meros. Int�ntelo de nuevo: ");
				numero = filtrarEscritura(); //Vuelve a solicitar el dato
			}
			return numero;
		}
		
		//M�todo que lee el fichero
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
				System.out.println("El fichero no existe en el directorio de b�squeda.\n"
						+ "El programa no puede continuar ejecut�ndose. Fin del Programa.");
				System.exit(0); //Finaliza el programa
			} catch (IOException e) { //Detecta otros errores
				e.printStackTrace();
			}
		}
	}
