package main.java;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador1;

    // Constructor 1: Nuevo documental
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador1) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador1 = investigador1;
    }

    // Constructor 2: Cargar desde CSV
    public Documental(int id, String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador1) {
        super(id, titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador1 = investigador1;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getInvestigador1() {
        return investigador1;
    }

    public void setInvestigador1(Investigador investigador1) {
        this.investigador1 = investigador1;
    }

    @Override
    public String obtenerDetalles() {
        String infoInvestigador = (investigador1 != null) 
            ? investigador1.getNombreInvestigador() + " (" + investigador1.getNacionalidadInvestigador() + ")" 
            : "No asignado";

        return "--- Detalles del Documental ---\n" +
               "ID: " + getId() + "\n" +
               "Título: " + getTitulo() + "\n" +
               "Duración: " + getDuracionEnMinutos() + " min\n" +
               "Género: " + getGenero() + "\n" +
               "Tema: " + tema + "\n" +
               "Investigador: " + infoInvestigador + "\n";
    }

    @Override
    public String toCSV() {
        int idInvestigador = (investigador1 != null) ? investigador1.getId() : -1;
        return super.toCSV() + "," + tema + "," + idInvestigador;
    }
}