package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desarrollo.Calculos2;
import desarrollo.Lista;
import desarrollo.Nodo;

public class TestsCalculos {

	private double[][] arreglo1 = { { 130, 186 }, { 650, 699 }, { 99, 132 }, { 150, 272 }, { 128, 291 }, { 302, 331 },
			{ 95, 199 }, { 945, 1890 }, { 368, 788 }, { 961, 1601 } };

	private Calculos2 calculos;
	private Lista lista;

	private void inicializar() {
		lista = new Lista(arreglo1.length);
		for (int i = 0; i < lista.getTamanio(); i++) {
			lista.Agregar(new Nodo(i, arreglo1[i][0], arreglo1[i][1]));
		}
		calculos = new Calculos2(lista);
	}

	@Test
	public void CalcularB0() {
		inicializar();
		double resultadoObservado = calculos.B0();
		double resultadoEsperado = -22.552532752034267d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularB1() {
		inicializar();
		double resultadoObservado = calculos.B1();
		double resultadoEsperado = 1.727932d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularRxy() {
		inicializar();
		double resultadoObservado = calculos.Rxy();
		double resultadoEsperado = 0.9545d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularR2() {
		inicializar();
		double resultadoObservado = calculos.R2();
		double resultadoEsperado = 0.9111d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularYk() {
		inicializar();
		double resultadoObservado = calculos.Yk(386);
		double resultadoEsperado = 644.429d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

}
