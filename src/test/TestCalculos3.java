package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desarrollo.Calculos2;
import desarrollo.Lista;
import desarrollo.Nodo;

public class TestCalculos3 {

	private double[][] arreglo1 = { { 163, 186 }, { 765, 699 }, { 141, 132 }, { 166, 272 }, { 137, 291 }, { 355, 331 },
			{ 136, 199 }, { 1206, 1890 }, { 433, 788 }, { 1130, 1601 } };

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
		double resultadoEsperado = -23.923d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularB1() {
		inicializar();
		double resultadoObservado = calculos.B1();
		double resultadoEsperado = 1.43097d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularRxy() {
		inicializar();
		double resultadoObservado = calculos.Rxy();
		double resultadoEsperado = 0.9631d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularR2() {
		inicializar();
		double resultadoObservado = calculos.R2();
		double resultadoEsperado = 0.9276d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularYk() {
		inicializar();
		double resultadoObservado = calculos.Yk(386);
		double resultadoEsperado = 528.4294d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

}
