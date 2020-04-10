package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desarrollo.Calculos2;
import desarrollo.Lista;
import desarrollo.Nodo;

public class TestCalculos4 {

	private double[][] arreglo1 = { { 163, 15 }, { 765, 69.9 }, { 141, 6.5 }, { 166, 22.4 }, { 137, 28.4 },
			{ 355, 65.9 }, { 136, 19.4 }, { 1206, 198.7 }, { 433, 38.8 }, { 1130, 138.2 } };

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
		double resultadoEsperado = -4.604d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularB1() {
		inicializar();
		double resultadoObservado = calculos.B1();
		double resultadoEsperado = 0.140164d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularRxy() {
		inicializar();
		double resultadoObservado = calculos.Rxy();
		double resultadoEsperado = 0.9480d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularR2() {
		inicializar();
		double resultadoObservado = calculos.R2();
		double resultadoEsperado = 0.8988d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularYk() {
		inicializar();
		double resultadoObservado = calculos.Yk(386);
		double resultadoEsperado = 49.499d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

}
