package main.java;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private Temporada temporada;

    // Constructor 1: Para crear una NUEVA serie
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, Temporada temporada) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.temporada = temporada;
    }

    // Constructor 2: Para CARGAR una serie desde el CSV
    public SerieDeTV(int id, String titulo, int duracionEnMinutos, String genero, int temporadas, Temporada temporada) {
        super(id, titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.temporada = temporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public String obtenerDetalles() {
        String infoTemporada = (temporada != null) 
            ? String.valueOf(temporada.getNumeroTemporada()) 
            : "No asignada";

        return "--- Detalles de la Serie de TV ---\n" +
               "ID: " + getId() + "\n" +
               "Título: " + getTitulo() + "\n" +
               "Duración: " + getDuracionEnMinutos() + " min\n" +
               "Género: " + getGenero() + "\n" +
               "Total Temporadas: " + temporadas + "\n" +
               "Temporada en emisión: " + infoTemporada + "\n";
    }

    @Override
    public String toCSV() {
        // Guardamos el ID de la temporada. Asumimos que Temporada tiene un método getId()
        int idTemporada = (temporada != null) ? temporada.getId() : -1;
        return super.toCSV() + "," + temporadas + "," + idTemporada;
    }
}