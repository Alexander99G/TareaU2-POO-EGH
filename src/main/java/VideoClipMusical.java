package main.java;

public class VideoClipMusical extends ContenidoAudiovisual {

	private String cantante;
	
	public VideoClipMusical(String titulo, int duracionEnMinutos, String genero, String cantante) {
		super(titulo, duracionEnMinutos, genero);
		this.cantante=cantante;
		
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalle del video Musical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Cantante: " + getCantante());
        System.out.println();
	}

}
