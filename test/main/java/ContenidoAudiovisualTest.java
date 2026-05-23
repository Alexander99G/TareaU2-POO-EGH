package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContenidoAudiovisualTest {

	@Test
	void testConstructoresYMetodos() {
		
		// 1. Preparar: Creamos un objeto instanciando la clase de forma anónima
		// Le agregamos las llaves {} al final para implementar el método abstracto obligatorio
		ContenidoAudiovisual contenidoNuevo = new ContenidoAudiovisual("Inception", 148, "Ciencia Ficción") {
			@Override
			public String obtenerDetalles() {
				return "Detalles de prueba";
			}
		};

		// 2. Comprobar Constructor 1 (Asignación normal)
		assertEquals("Inception", contenidoNuevo.getTitulo());
		assertEquals(148, contenidoNuevo.getDuracionEnMinutos());
		assertEquals("Ciencia Ficción", contenidoNuevo.getGenero());
		
		// 3. Comprobar el método toCSV()
		// Como es un contenido nuevo, asume el ID actual del contador (probablemente 1 o 2)
		String csvEsperado = contenidoNuevo.getId() + ",Inception,148,Ciencia Ficción";
		assertEquals(csvEsperado, contenidoNuevo.toCSV());
		
		// 4. Comprobar Constructor 2 (Cargado desde CSV)
		ContenidoAudiovisual contenidoCargado = new ContenidoAudiovisual(50, "Matrix", 136, "Acción") {
			@Override
			public String obtenerDetalles() {
				return "Detalles Matrix";
			}
		};
		
		assertEquals(50, contenidoCargado.getId());
		assertEquals("Matrix", contenidoCargado.getTitulo());
		
		// 5. Comprobar que el contador se sincronizó correctamente al usar el Constructor 2
		// Si creamos uno nuevo ahora, su ID debería ser 51 (ya que el anterior fue 50)
		ContenidoAudiovisual contenidoSiguiente = new ContenidoAudiovisual("Avatar", 162, "Fantasía") {
			@Override
			public String obtenerDetalles() {
				return "Detalles Avatar";
			}
		};
		
		assertEquals(51, contenidoSiguiente.getId());
	}
}