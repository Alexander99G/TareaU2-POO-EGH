package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestActor {

	@Test
	void testActor() {
		// 1. Preparar: Instanciamos un objeto Actor usando tu constructor
		Actor miActor = new Actor("Guillermo", "Francella", "Argentina");
		
		// 2. Comprobar Constructor: Verificamos que los datos iniciales se asignaron bien
		assertEquals("Guillermo", miActor.getNombre());
		assertEquals("Francella", miActor.getApellido());
		assertEquals("Argentina", miActor.getNacionalidad());
		
		// 3. Comprobar Setters: Modificamos un dato y comprobamos que efectivamente cambie
		miActor.setNombre("Ricardo");
		assertEquals("Ricardo", miActor.getNombre());
		
		// 4. Comprobar el ID: Como no está en el constructor, usamos el setter y verificamos
		miActor.setId(101);
		assertEquals(101, miActor.getId());
	}
}