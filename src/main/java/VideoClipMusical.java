package main.java;

public class VideoClipMusical extends ContenidoAudiovisual {
    private String cantante;

    public VideoClipMusical(String titulo, int duracionEnMinutos, String genero, String cantante) {
        super(titulo, duracionEnMinutos, genero);
        this.cantante = cantante;
    }

    public VideoClipMusical(int id, String titulo, int duracionEnMinutos, String genero, String cantante) {
        super(id, titulo, duracionEnMinutos, genero);
        this.cantante = cantante;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    @Override
    public String obtenerDetalles() {
        return "--- Detalles del Video Musical ---\n" +
               "ID: " + getId() + "\n" +
               "Título: " + getTitulo() + "\n" +
               "Duración: " + getDuracionEnMinutos() + " min\n" +
               "Género: " + getGenero() + "\n" +
               "Cantante: " + cantante + "\n";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + cantante;
    }
}