package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desarrollo.Calculos2;
import desarrollo.Lista;
import desarrollo.Nodo;

public class TestCalculos2 {

	private double[][] arreglo1 = { { 130, 15 }, { 650, 69.9 }, { 99, 6.5 }, { 150, 22.4 }, { 128, 28.4 },
			{ 302, 65.9 }, { 95, 19.4 }, { 945, 198.7 }, { 368, 38.8 }, { 961, 138.2 } };

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
		double resultadoEsperado = -4.039d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularB1() {
		inicializar();
		double resultadoObservado = calculos.B1();
		double resultadoEsperado = 0.1681d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularRxy() {
		inicializar();
		double resultadoObservado = calculos.Rxy();
		double resultadoEsperado = 0.9333d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularR2() {
		inicializar();
		double resultadoObservado = calculos.R2();
		double resultadoEsperado = 0.8711d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

	@Test
	public void CalcularYk() {
		inicializar();
		double resultadoObservado = calculos.Yk(386);
		double resultadoEsperado = 60.858d;
		assertEquals(resultadoEsperado, resultadoObservado, 0.001);
	}

}
