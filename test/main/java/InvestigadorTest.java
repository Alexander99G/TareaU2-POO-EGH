package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InvestigadorTest {

	@Test
	void testLogicaInvestigador() {
		// 1. Preparar: Instanciamos un objeto Investigador usando tu constructor
		Investigador inv = new Investigador("Carl Sagan", "Estadounidense");
		
		// 2. Comprobar Constructor: Verificamos que los datos iniciales se asignaron bien
		assertEquals("Carl Sagan", inv.getNombreInvestigador());
		assertEquals("Estadounidense", inv.getNacionalidadInvestigador());
		
		// 3. Comprobar Setters: Modificamos los datos y comprobamos que cambien
		inv.setNombreInvestigador("Neil deGrasse Tyson");
		inv.setNacionalidadInvestigador("Norteamericana");
		
		assertEquals("Neil deGrasse Tyson", inv.getNombreInvestigador());
		assertEquals("Norteamericana", inv.getNacionalidadInvestigador());
		
		// 4. Comprobar el ID: Como no está en el constructor, usamos su setter
		inv.setId(42);
		assertEquals(42, inv.getId());
	}
}