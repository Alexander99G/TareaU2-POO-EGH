package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemporadaTest {

	@Test
	void testLogicaTemporada() {
		// 1. Preparar: Instanciamos usando tu constructor
		Temporada temp = new Temporada(1);
		
		// 2. Comprobar Constructor
		assertEquals(1, temp.getNumeroTemporada());
		
		// 3. Comprobar Setters y ID
		temp.setNumeroTemporada(2);
		temp.setId(101);
		
		assertEquals(2, temp.getNumeroTemporada());
		assertEquals(101, temp.getId());
	}
}