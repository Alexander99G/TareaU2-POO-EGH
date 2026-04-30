package main.java;

public class Actor {

	private String nombre;
	private String apellido;
	private String nacionalidad;

	public Actor(String nombre, String apellido, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
