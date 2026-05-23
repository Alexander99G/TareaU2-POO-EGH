package main.java;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actorPrincipal;

    // Constructor 1: Para crear una NUEVA película
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, Actor actorPrincipal) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actorPrincipal = actorPrincipal;
    }

    // Constructor 2: Para CARGAR una película desde el CSV
    public Pelicula(int id, String titulo, int duracionEnMinutos, String genero, String estudio, Actor actorPrincipal) {
        super(id, titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actorPrincipal = actorPrincipal;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    @Override
    public String obtenerDetalles() {
        String infoActor = (actorPrincipal != null) 
            ? actorPrincipal.getNombre() + " " + actorPrincipal.getApellido() 
            : "No asignado";
            
        return "--- Detalles de la Película ---\n" +
               "ID: " + getId() + "\n" +
               "Título: " + getTitulo() + "\n" +
               "Duración: " + getDuracionEnMinutos() + " min\n" +
               "Género: " + getGenero() + "\n" +
               "Estudio: " + estudio + "\n" +
               "Actor Principal: " + infoActor + "\n";
    }

    @Override
    public String toCSV() {
        int idActor = (actorPrincipal != null) ? actorPrincipal.getId() : -1;
        return super.toCSV() + "," + estudio + "," + idActor;
    }
}