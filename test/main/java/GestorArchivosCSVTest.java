package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class GestorArchivosCSVTest {

    @Test
    void testGuardarYCargarArchivos() {
        // 1. Preparar el Gestor y una ruta de archivo temporal exclusiva para la prueba
        GestorArchivosCSV gestor = new GestorArchivosCSV();
        String rutaPrueba = "archivo_prueba_junit.csv";
        
        // 2. Preparar datos de prueba
        List<ContenidoAudiovisual> listaOriginal = new ArrayList<>();
        Gameplay juegoOriginal = new Gameplay(10, "Prueba CSV", 20, "Acción", "TestStreamer");
        listaOriginal.add(juegoOriginal);

        try {
            // 3. Ejecutar: Guardar los datos en el archivo temporal
            gestor.guardarContenidos(listaOriginal, rutaPrueba);

            // 4. Ejecutar: Volver a cargar los datos desde ese mismo archivo
            List<ContenidoAudiovisual> listaCargada = gestor.cargarContenidos(rutaPrueba);

            // 5. Comprobar: Verificamos que la lista cargada tenga 1 elemento y sea un Gameplay
            assertEquals(1, listaCargada.size());
            assertTrue(listaCargada.get(0) instanceof Gameplay);

            // 6. Comprobar los datos internos para asegurar que se leyeron bien
            Gameplay juegoCargado = (Gameplay) listaCargada.get(0);
            assertEquals("Prueba CSV", juegoCargado.getTitulo());
            assertEquals("TestStreamer", juegoCargado.getStreamer());
            assertEquals(10, juegoCargado.getId());

        } finally {
            // 7. Limpieza: Borramos el archivo de prueba al terminar, pase lo que pase
            File archivo = new File(rutaPrueba);
            if (archivo.exists()) {
                archivo.delete();
            }
        }
    }
}