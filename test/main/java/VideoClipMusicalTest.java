package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VideoClipMusicalTest {

	@Test
	void testLogicaVideoClip() {
		// 1. Preparar objeto
		VideoClipMusical video = new VideoClipMusical("Thriller", 14, "Pop", "Michael Jackson");

		// 2. Comprobar herencia
		assertEquals("Thriller", video.getTitulo());
		assertEquals(14, video.getDuracionEnMinutos());
		assertEquals("Pop", video.getGenero());

		// 3. Comprobar atributos propios
		assertEquals("Michael Jackson", video.getCantante());

		// 4. Comprobar toCSV()
		String csvEsperado = video.getId() + ",Thriller,14,Pop,Michael Jackson";
		assertEquals(csvEsperado, video.toCSV());

		// 5. Comprobar obtenerDetalles()
		String detalles = video.obtenerDetalles();
		assertTrue(detalles.contains("Cantante: Michael Jackson"));
		assertTrue(detalles.contains("Duración: 14 min"));
	}
}