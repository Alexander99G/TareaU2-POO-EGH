package main.java;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador1;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador1) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador1=investigador1;
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
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Nombre del investigador: "+ investigador1.getNombreInvestigador());
        System.out.println("Nacionalidad del investigador: " + investigador1.getNacionalidadInvestigador());
        System.out.println();
    }
}