package desarrollo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileIntoList {

	ArrayList<Double> datos = new ArrayList<>();

	public int getTamanio() {
		return datos.size();
	}

	public Double getDatos(int index) {
		return datos.get(index);
	}

	public void IngresoDatos(String file) {
		String line = "";
		String splitBy = ",";
		String[] data = null;
		try {
			// parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				try {
					data = line.split(splitBy); // use comma as separator
					datos.add(Double.parseDouble(data[0]));
					datos.add(Double.parseDouble(data[1]));
				} catch (Exception e) {
					System.out.println("algun dato esta erroneo");
					System.exit(0);
				}
			}

		} catch (IOException e) {
			System.out.println("error mal ingreso de datos");
			System.exit(0);
		}

	}
}
