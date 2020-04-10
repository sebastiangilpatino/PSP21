package desarrollo;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		System.out.println("ingrese la ruta del archivo .csv de dos columnas sin encabezado");
		System.out.println("Se calculara los coeficientes de correlacion Bo, B1, Rxy, R^2");
		System.out.println(".................................");

		Scanner myObj = new Scanner(System.in); // Un objeto lector para ingreso data
		String dirpath = myObj.nextLine();

		// "/home/sebastiangilpatino/eclipse-workspace/PSP2.1/data/regre.csv";

		ReadFileIntoList lectura_archivos = new ReadFileIntoList();
		lectura_archivos.IngresoDatos(dirpath); // metodo que vuelve un arreglo el .csv

		ACalculosImpresion calcular = new Calculos2(new Lista(lectura_archivos.getTamanio() / 2));
		// se divide entre dos, porque son datos pares dicho en los requerimientos

		for (int i = 0; i < calcular.lista.getTamanio(); i++) {
			// Nodo nd = new Nodo(i, lectura_archivos.getDatos(2 * i),
			// lectura_archivos.getDatos(2 * i + 1));
			// sucesion par e impar para tomar la columna derecha e izquierda
			// se crea un nodo de dos valores y se ingresa a la lista
			calcular.lista.Agregar(new Nodo(i, lectura_archivos.getDatos(2 * i), lectura_archivos.getDatos(2 * i + 1)));
		}

		System.out.println(".................................");
		System.out.println("el valor de B0 es:  " + calcular.B0());
		System.out.println("el valor de B1 es:  " + calcular.B1());
		System.out.println("el valor de Rxy es:  " + calcular.Rxy());
		System.out.println("el valor de R^2 es:  " + calcular.R2());
		System.out.println(".................................");

		System.out.println("Tambien Se predice yk ingrese xk");

		String xk = myObj.nextLine(); // se lee Xk
		myObj.close(); // se cierra el lector

		try {
			System.out.println(".................................");
			System.out.println("el valor de Y(" + xk + ") es:  " + calcular.Yk(Double.parseDouble(xk)));
			// se imprime Yk
		} catch (Exception e) {
			System.out.println("error");
			System.exit(0);
		}

	}

}
