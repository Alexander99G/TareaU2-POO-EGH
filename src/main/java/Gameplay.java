package main.java;

public class Gameplay extends ContenidoAudiovisual {
    private String streamer;

    public Gameplay(String titulo, int duracionEnMinutos, String genero, String streamer) {
        super(titulo, duracionEnMinutos, genero);
        this.streamer = streamer;
    }

    public Gameplay(int id, String titulo, int duracionEnMinutos, String genero, String streamer) {
        super(id, titulo, duracionEnMinutos, genero);
        this.streamer = streamer;
    }

    public String getStreamer() {
        return streamer;
    }

    public void setStreamer(String streamer) {
        this.streamer = streamer;
    }

    @Override
    public String obtenerDetalles() {
        return "--- Detalles del Gameplay ---\n" +
               "ID: " + getId() + "\n" +
               "Título: " + getTitulo() + "\n" +
               "Duración: " + getDuracionEnMinutos() + " min\n" +
               "Género: " + getGenero() + "\n" +
               "Streamer: " + streamer + "\n";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + streamer;
    }
}