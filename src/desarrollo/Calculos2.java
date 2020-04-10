package desarrollo;

public class Calculos2 extends ACalculosImpresion {

	private ILista lista;

	public Calculos2(ILista lista) {
		super(lista);
		this.lista = lista;
	}

	private double getX2() {
		double x2 = 0;
		for (int i = 0; i < lista.getTamanio(); i++) {
			x2 += lista.getValor(i, 0) * lista.getValor(i, 0);
		}
		return x2;
	}

	private double getY2() {
		double y2 = 0;
		for (int i = 0; i < lista.getTamanio(); i++) {
			y2 += lista.getValor(i, 1) * lista.getValor(i, 1);
		}
		return y2;
	}

	private double getXy() {
		double xy = 0;
		for (int i = 0; i < lista.getTamanio(); i++) {
			xy += lista.getValor(i, 0) * lista.getValor(i, 1);
		}

		return xy;
	}

	private double getSumX() {
		double sumX = 0;
		for (int i = 0; i < lista.getTamanio(); i++) {
			sumX += lista.getValor(i, 0);
		}
		return sumX;
	}

	private double getSumY() {
		double sumY = 0;
		for (int i = 0; i < lista.getTamanio(); i++) {
			sumY += lista.getValor(i, 1);
		}
		return sumY;
	}

	private double getPromedioX() {
		double promedioX = 0;
		promedioX = getSumX() / lista.getTamanio();
		return promedioX;
	}

	private double getPromedioY() {
		double promedioY = 0;
		promedioY = getSumY() / lista.getTamanio();
		return promedioY;
	}

	@Override
	public double B0() {
		return getPromedioY() - B1() * getPromedioX();

	}

	@Override
	public double B1() {
		double numerador = getXy() - lista.getTamanio() * getPromedioX() * getPromedioY();
		double denominador = getX2() - lista.getTamanio() * Math.pow(getPromedioX(), 2);
		return numerador / denominador;

	}

	@Override
	public double Yk(double xk) {
		// TODO Auto-generated method stub
		return B0() + B1() * xk;

	}

	@Override
	public double Rxy() {

		double numerador = lista.getTamanio() * getXy() - getSumX() * getSumY();
		double denominador = Math.sqrt((lista.getTamanio() * getX2() - Math.pow(getSumX(), 2))
				* (lista.getTamanio() * getY2() - Math.pow(getSumY(), 2)));

		return numerador / denominador;

	}

	@Override
	public double R2() {
		return Math.pow(Rxy(), 2);
	}

}
