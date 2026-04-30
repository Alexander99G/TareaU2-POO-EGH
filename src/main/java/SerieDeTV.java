package main.java;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private int temporadas;
	private Temporada temporada;

	public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, Temporada temporada) {
		super(titulo, duracionEnMinutos, genero);
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
	public void mostrarDetalles() {
		System.out.println("Detalles de la Serie de TV:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Temporadas: " + this.temporadas);
		System.out.println("Temporada en emision:" + temporada.getNumeroTemporada());
		System.out.println();
	}
}