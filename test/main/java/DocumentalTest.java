package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DocumentalTest {

	@Test
	void testLogicaDocumental() {
		// 1. Preparar dependencias: Creamos un Investigador (solo nombre y
		// nacionalidad)
		Investigador investigadorPrueba = new Investigador("Jacques Cousteau", "Francesa");
		investigadorPrueba.setId(99); // Le ponemos un ID manual para probar el CSV

		// 2. Preparar el objeto principal: Creamos el Documental usando el Constructor
		// 1
		Documental doc = new Documental("El Mundo Submarino", 120, "Naturaleza", "Biología Marina", investigadorPrueba);

		// 3. Comprobar herencia: Verificamos que los datos de la clase padre se
		// guardaron bien
		assertEquals("El Mundo Submarino", doc.getTitulo());
		assertEquals(120, doc.getDuracionEnMinutos());
		assertEquals("Naturaleza", doc.getGenero());

		// 4. Comprobar atributos propios: Verificamos el tema y el objeto Investigador
		assertEquals("Biología Marina", doc.getTema());
		assertNotNull(doc.getInvestigador1()); // Verifica que el investigador no sea nulo
		assertEquals("Jacques Cousteau", doc.getInvestigador1().getNombreInvestigador());

		// 5. Comprobar toCSV(): Verificamos que concatene bien los datos del padre +
		// los propios
		// El formato esperado es:
		// id_generado,Titulo,Duracion,Genero,Tema,IdInvestigador
		String csvObtenido = doc.toCSV();
		assertTrue(csvObtenido.contains("El Mundo Submarino,120,Naturaleza,Biología Marina,99"));

		// 6. Comprobar obtenerDetalles(): Verificamos que el texto generado incluya la
		// info clave
		String detallesObtenidos = doc.obtenerDetalles();
		assertTrue(detallesObtenidos.contains("Jacques Cousteau (Francesa)"));
		assertTrue(detallesObtenidos.contains("Tema: Biología Marina"));
	}
}