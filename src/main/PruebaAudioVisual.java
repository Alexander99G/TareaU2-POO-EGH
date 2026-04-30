package main;

import main.java.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		System.out.println("Hello from Eclipse!");
		Actor actorAvatar = new Actor("Sam", "Worthington", "Australiano");
		Temporada temporadaGot = new Temporada(2);
		Investigador investigadorPrincipal = new Investigador("Jon Wick", "Chino");
		// Crear instancias de las subclases
		ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
		contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", actorAvatar);
		contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8, temporadaGot);
		contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", investigadorPrincipal);
		contenidos[3] = new VideoClipMusical("Coqueta", 3, "Merengue", "Heredero");
		contenidos[4] = new Gameplay("Minecraft", 25, "Acción", "Beast");

		// Mostrar los detalles de cada contenido audiovisual
		for (ContenidoAudiovisual contenido : contenidos) {
			contenido.mostrarDetalles();
		}
	}
}