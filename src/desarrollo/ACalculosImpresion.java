package desarrollo;

public abstract class ACalculosImpresion {
	ILista lista;

	public ACalculosImpresion(ILista lista) {
		this.lista = lista;
	}

	public abstract double B0();

	public abstract double B1();

	public abstract double Yk(double xk);

	public abstract double Rxy();

	public abstract double R2();
}
