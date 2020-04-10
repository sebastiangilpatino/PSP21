package desarrollo;

public class Lista implements ILista {

	private int tamanio;
	private double[][] arreglo;

	public Lista(int tamanio) {
		this.tamanio = tamanio;
		arreglo = new double[tamanio][2];
	}

	@Override
	public int getTamanio() {
		return tamanio;
	}

	@Override
	public void Agregar(Nodo nodo) {
		// agrega los nodos a un arreglo 0 y 1 va fijo porque son pares de datos
		arreglo[nodo.getIndex()][0] = nodo.getValorX();
		arreglo[nodo.getIndex()][1] = nodo.getValorY();
	}

	@Override
	public double getValor(int indexX, int indexY) {
		// TODO Auto-generated method stub
		return arreglo[indexX][indexY];
	}

}
