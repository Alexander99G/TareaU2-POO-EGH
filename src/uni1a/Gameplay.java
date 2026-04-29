package uni1a;

public class Gameplay extends ContenidoAudiovisual{

	private String streamer;
	
	public Gameplay(String titulo, int duracionEnMinutos, String genero, String streamer) {
		super(titulo, duracionEnMinutos, genero);
		this.streamer=streamer;
	}

	public String getStreamer() {
		return streamer;
	}

	public void setStreamer(String streamer) {
		this.streamer = streamer;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalle del Gameplay:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Streamer: " + getStreamer());
        System.out.println();
		
	}

	
}
