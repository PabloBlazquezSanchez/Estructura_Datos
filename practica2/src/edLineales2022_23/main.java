package edLineales2022_23;

public class main {
}
	public static void mostrarMenu() {
		int opcion = 0;
		do {
			System.out.println("Menú: \n" + "1. Comprar acciones\r\n"
					+ "2. Vender acciones\r\n"
					+ "3. Ganancia de capital hasta el momento\r\n"
					+ "4. Salir"
					
					+ "Escriba el número de la opción que desea realizar: ");
			opcion = (int) filtrarEscritura();
			switch (opcion) {
			case 1:
				
				break;
			case 2:
				n.crearPromocion(); //Llamada al método de la clase netflix
				break;
			case 3:
				n.mostrarTodasPromociones(); //Llamada al método de la clase netflix
				break;
			case 4:
				n.calcularPrecioPromocionesRealizadas(); //Llamada al método de la clase netflix
				break;
			case 5:
				costePromocionconreta();
				break;
			case 6:
				n.campañaMarketingMasiva(); //Llamada al método de la clase netflix
				break;
			case 7:
				calculoSubvenciones();
				break;
			case 8:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error. Vuelva a escribir la opción otra vez.\n");
				break;
			}
		} while (opcion != 8);

	}
	
	//Este método solicita el id de una promoción
	private static void costePromocionconreta() {
		long id;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Escriba el ID de la promoción realizada a una película o serie para saber el coste de esta:");
		id = filtrarEscritura();
		n.calcularPreciounaPromocion(id); //Llamada al método de la clase netflix
	}
	
	//Este método solicita el tipo de subvención a realizar
	private static void calculoSubvenciones() {
		String tipo;
		Scanner lectura = new Scanner(System.in);
		boolean comprobacion = true;
		//Se realiza un bucle que no finaliza hasta que el dato introducido sea 'serie' o 'pelicula'
		do {
			System.out.println("Si desea calcular las subvenciones obtenidas a partir de las series escriba \"serie\" y si lo desea para las películas escriba \"pelicula\".");
			tipo = lectura.nextLine();
			if (tipo.toLowerCase().equals("serie") || tipo.toLowerCase().equals("pelicula")) {
				comprobacion = false;
			}
			if (comprobacion) {
				System.out.println("Error. Vuelva a escribir su respuesta.");
			}
		} while (comprobacion);

		n.calcularSubvenciones(tipo); //Llamada al método de la clase netflix
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
		String titulo, descripcion, tipoContenido, productora, pais;
		int año, duracion, nTemporadas, nCapitulos;
		boolean tendencia;
		Contenido contenido;
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			while ((line = br.readLine()) != null) {
				String[] split = line.split(";");
				tipoContenido = split[0];
				titulo = split[1];
				año = Integer.valueOf(split[2]);
				duracion = Integer.valueOf(split[3]);
				descripcion = split[4];
				tendencia = Boolean.valueOf(split[5]);

				// Informacion de una Serie
				if (tipoContenido.charAt(0) == 's') {
					nTemporadas = Integer.valueOf(split[6]);
					nCapitulos = Integer.valueOf(split[7]);
					contenido = new Series(titulo, año, duracion, descripcion, tendencia, nTemporadas, nCapitulos);
					n.addContenido(contenido);
				}
				// Informacion de una Pelicula
				else {
					productora = split[7];
					pais = split[6];
					contenido = new Pelicula(titulo, año, duracion, descripcion, tendencia, productora, pais);
					n.addContenido(contenido);
				}
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