package main.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivosCSV {

    /**
     * Método para guardar la lista de contenidos en un archivo.
     * Utiliza un bloque try-with-resources para asegurar que el archivo se cierre automáticamente.
     */
    public void guardarContenidos(List<ContenidoAudiovisual> contenidos, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                // Obtenemos el tipo exacto (Pelicula, SerieDeTV, etc.) para la primera columna
                String tipo = contenido.getClass().getSimpleName();
                bw.write(tipo + "," + contenido.toCSV());
                bw.newLine();
            }
            System.out.println("Datos guardados exitosamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    /**
     * Método para leer datos del archivo CSV e inicializar los objetos.
     */
    public List<ContenidoAudiovisual> cargarContenidos(String rutaArchivo) {
        List<ContenidoAudiovisual> contenidosCargados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
                // Validación básica para evitar errores de líneas vacías
                if (datos.length < 5) continue; 

                // Extraemos los atributos comunes de la clase padre
                String tipo = datos[0];
                int id = Integer.parseInt(datos[1]);
                String titulo = datos[2];
                int duracion = Integer.parseInt(datos[3]);
                String genero = datos[4];

                // Reconstruimos el objeto específico según la primera columna
                switch (tipo) {
                    case "Pelicula":
                        String estudio = datos[5];
                        // NOTA: Para Actor, deberías buscarlo en una lista de actores usando su ID (datos[6])
                        // Por simplicidad en este paso, pasaremos null.
                        Pelicula p = new Pelicula(id, titulo, duracion, genero, estudio, null);
                        contenidosCargados.add(p);
                        break;
                        
                    case "SerieDeTV":
                        int temporadas = Integer.parseInt(datos[5]);
                        SerieDeTV s = new SerieDeTV(id, titulo, duracion, genero, temporadas, null);
                        contenidosCargados.add(s);
                        break;
                        
                    case "Documental":
                        String tema = datos[5];
                        Documental d = new Documental(id, titulo, duracion, genero, tema, null);
                        contenidosCargados.add(d);
                        break;
                        
                    case "Gameplay":
                        String streamer = datos[5];
                        Gameplay g = new Gameplay(id, titulo, duracion, genero, streamer);
                        contenidosCargados.add(g);
                        break;
                        
                    case "VideoClipMusical":
                        String cantante = datos[5];
                        VideoClipMusical v = new VideoClipMusical(id, titulo, duracion, genero, cantante);
                        contenidosCargados.add(v);
                        break;
                        
                    default:
                        System.out.println("Tipo de contenido desconocido: " + tipo);
                }
            }
        } catch (IOException e) {
            System.out.println("Aviso: No se encontró un archivo previo o hubo un error al leer (" + e.getMessage() + ")");
        }

        return contenidosCargados;
    }
}