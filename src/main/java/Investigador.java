package main.java;

public class Investigador {

	private String nombreInvestigador;
	private String nacionalidadInvestigador;

	public Investigador(String nombreInvestigador, String nacionalidadInvestigador) {
		this.nacionalidadInvestigador = nacionalidadInvestigador;
		this.nombreInvestigador = nombreInvestigador;
	}

	public String getNombreInvestigador() {
		return nombreInvestigador;
	}

	public void setNombreInvestigador(String nombreInvestigador) {
		this.nombreInvestigador = nombreInvestigador;
	}

	public String getNacionalidadInvestigador() {
		return nacionalidadInvestigador;
	}

	public void setNacionalidadInvestigador(String nacionalidadInvestigador) {
		this.nacionalidadInvestigador = nacionalidadInvestigador;
	}

}
