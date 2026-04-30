package main.java;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
	private String estudio;
	private Actor actorPrincipal;

	public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, Actor actorPrincipal) {
		super(titulo, duracionEnMinutos, genero);
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
	public void mostrarDetalles() {
		System.out.println("Detalles de la película:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Estudio: " + estudio);
		System.out.println("Actor Principal:" + actorPrincipal.getNombre() + " " + actorPrincipal.getApellido() + " "
				+ actorPrincipal.getNacionalidad());
		System.out.println();

	}
}