package desarrollo;

public class Nodo {

	private int index;
	private double valorX;
	private double valorY;

	public Nodo(int index, double valorX, double valorY) {
		this.index = index;
		this.valorX = valorX;
		this.valorY = valorY;
	}

	public double getValorX() {
		return valorX;
	}

	public double getValorY() {
		return valorY;
	}

	public int getIndex() {
		return index;
	}
}
