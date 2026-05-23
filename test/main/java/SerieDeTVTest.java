package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SerieDeTVTest {

	@Test
	void testLogicaSerie() {
		// 1. Preparar dependencia: Creamos la Temporada
		Temporada tempPrueba = new Temporada(3);
		tempPrueba.setId(55); // ID manual para la prueba del CSV

		// 2. Preparar objeto principal: Creamos la SerieDeTV
		SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama", 5, tempPrueba);

		// 3. Comprobar herencia
		assertEquals("Breaking Bad", serie.getTitulo());
		assertEquals(50, serie.getDuracionEnMinutos());
		assertEquals("Drama", serie.getGenero());

		// 4. Comprobar atributos propios
		assertEquals(5, serie.getTemporadas());
		assertNotNull(serie.getTemporada());
		assertEquals(3, serie.getTemporada().getNumeroTemporada());

		// 5. Comprobar toCSV(): Esperamos -> id,Titulo,Duracion,Genero,TotalTemporadas,IdTemporada
		String csvObtenido = serie.toCSV();
		assertTrue(csvObtenido.contains("Breaking Bad,50,Drama,5,55"));

		// 6. Comprobar obtenerDetalles()
		String detalles = serie.obtenerDetalles();
		assertTrue(detalles.contains("Total Temporadas: 5"));
		assertTrue(detalles.contains("Temporada en emisión: 3"));
	}
}