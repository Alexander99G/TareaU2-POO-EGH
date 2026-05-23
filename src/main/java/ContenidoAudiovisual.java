package main.java;

public abstract class ContenidoAudiovisual {
    private static int contador = 1; // Iniciamos en 1 por convención de IDs
    private int id;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;

    // Constructor 1: Para crear un NUEVO contenido (ej. desde la consola)
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = contador++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // Constructor 2: Para cargar contenido EXISTENTE (desde el archivo CSV)
    public ContenidoAudiovisual(int id, String titulo, int duracionEnMinutos, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        // Sincronizamos el contador para que los nuevos registros no repitan IDs
        if (id >= contador) {
            contador = id + 1;
        }
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract void mostrarDetalles();

    // Método de ayuda para la Etapa 1: Formatea los datos para escribirlos en el archivo CSV
    public String toCSV() {
        return id + "," + titulo + "," + duracionEnMinutos + "," + genero;
    }
}
