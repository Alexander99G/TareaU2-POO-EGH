package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PeliculaTest {

	@Test
	void testLogicaPelicula() {
		// 1. Preparar dependencias: Creamos un Actor usando su constructor exacto
		Actor actorPrueba = new Actor("Keanu", "Reeves", "Canadiense");
		actorPrueba.setId(77); // Le ponemos un ID manual para probar el método toCSV()

		// 2. Preparar el objeto principal: Creamos la Película usando el Constructor 1
		Pelicula peli = new Pelicula("The Matrix", 136, "Ciencia Ficción", "Warner Bros", actorPrueba);

		// 3. Comprobar herencia: Verificamos que los datos de ContenidoAudiovisual se guarden bien
		assertEquals("The Matrix", peli.getTitulo());
		assertEquals(136, peli.getDuracionEnMinutos());
		assertEquals("Ciencia Ficción", peli.getGenero());

		// 4. Comprobar atributos propios: Verificamos el estudio y el Actor
		assertEquals("Warner Bros", peli.getEstudio());
		assertNotNull(peli.getActorPrincipal()); // Confirmamos que el actor no está vacío
		assertEquals("Keanu", peli.getActorPrincipal().getNombre());
		assertEquals("Reeves", peli.getActorPrincipal().getApellido());

		// 5. Comprobar toCSV(): Formato esperado -> id,Titulo,Duracion,Genero,Estudio,IdActor
		String csvObtenido = peli.toCSV();
		assertTrue(csvObtenido.contains("The Matrix,136,Ciencia Ficción,Warner Bros,77"));

		// 6. Comprobar obtenerDetalles(): Verificamos el texto generado
		String detalles = peli.obtenerDetalles();
		assertTrue(detalles.contains("Actor Principal: Keanu Reeves"));
		assertTrue(detalles.contains("Estudio: Warner Bros"));
	}
}