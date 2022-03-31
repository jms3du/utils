package test.java.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.utils.Utilidades;

class UtilidadesTest {

	@Test
	void testInvierteListaImpar() {
		Integer[] listaEnteros = new Integer[3];
		listaEnteros[0]=10;
		listaEnteros[1]=3;
		listaEnteros[2]=50;
		
		// 1, 3, 5, 7, 9 ==> 9, 7, 5, 3, 1
		// hola, buenos, dias ==> dias, buenos, hola
		Integer[] invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida[0], 50);
		assertEquals(invertida[1], 3);
		assertEquals(invertida[2], 10);
	}
	
	@Test
	void testInvierteListaPar() {
		Integer[] listaEnteros = new Integer[4];
		listaEnteros[0]=10;
		listaEnteros[1]=3;
		listaEnteros[2]=50;
		listaEnteros[3]=20;
		

		Integer[] invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida[0], 20);
		assertEquals(invertida[1], 50);
		assertEquals(invertida[2], 3);
		assertEquals(invertida[3], 10);

	}
	
	@Test
	void testInvierteListaVacia() {
		Integer[] listaEnteros = new Integer[0];
		Integer[] invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida.length,0);
	}
	
	@Test
	void testListaNula() {
		Integer[] listaEnteros = null;
		Integer[] invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida, null);
	}
	
	@Test
	void testCadenaNoVacia() {
		String[] saludo = "Hola que tal".split(" ");
		assertEquals(Utilidades.reverse(saludo)[0], "tal");
		assertEquals(Utilidades.reverse(saludo)[1], "que");
		assertEquals(Utilidades.reverse(saludo)[2], "Hola");
	
	}
	
	@Test
	void testInvertirArrayDeListas() {
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		lista1.add(3);
		lista1.add(4);
		lista2.add(5);
		
		Object [] arrayDeListas = new Object[2];
		arrayDeListas[0]= lista1;
		arrayDeListas[1]= lista2;
		
		assertEquals(((List<Integer>)Utilidades.reverse(arrayDeListas)[0]).get(0), 5);
	}

}
