package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GameplayTest {

    @Test
    void testLogicaGameplay() {
        // 1. Preparar: Instanciar un Gameplay
        Gameplay juego = new Gameplay(15, "Speedrun Mario 64", 45, "Plataformas", "SpeedRunner99");

        // 2. Comprobar herencia (ContenidoAudiovisual)
        assertEquals(15, juego.getId());
        assertEquals("Speedrun Mario 64", juego.getTitulo());
        assertEquals(45, juego.getDuracionEnMinutos());
        assertEquals("Plataformas", juego.getGenero());

        // 3. Comprobar atributo propio
        assertEquals("SpeedRunner99", juego.getStreamer());

        // 4. Comprobar toCSV()
        String csvEsperado = "15,Speedrun Mario 64,45,Plataformas,SpeedRunner99";
        assertEquals(csvEsperado, juego.toCSV());

        // 5. Comprobar obtenerDetalles()
        String detalles = juego.obtenerDetalles();
        assertTrue(detalles.contains("Streamer: SpeedRunner99"));
        assertTrue(detalles.contains("ID: 15"));
    }
}