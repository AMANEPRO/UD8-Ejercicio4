package ejercicio4;

public class seriesejercicio4 {
	
	private String titulo;
	
	private int numTemporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;
	
	final private int cNumTemporadas = 3;
	
	final private boolean cEntregado = false;

	public seriesejercicio4() {
	
		this.titulo = "";
		
		this.numTemporadas = cNumTemporadas;
		
		this.entregado = cEntregado;
		
		this.genero = "";
		
		this.creador = "";
		
	}

	public seriesejercicio4(String titulo, String creador) {
	
		this.titulo = titulo;
		
		this.numTemporadas = cNumTemporadas;
		
		this.entregado = cEntregado;
		
		this.genero = "";
		
		this.creador = creador;
	
	}
	
	public seriesejercicio4(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
	
		this.titulo = titulo;
		
		this.numTemporadas = numTemporadas;
		
		this.entregado = entregado;
		
		this.genero = genero;
		
		this.creador = creador;
	
	}
	
	public String getTitulo() {

		return titulo;
	
	}

	
	public void setTitulo(String titulo) {
	
		this.titulo = titulo;
	
	}

	public int getNumTemporadas() {
	
		return numTemporadas;
	
	}

	public void setNumTemporadas(int numTemporadas) {
	
		this.numTemporadas = numTemporadas;
	
	}

	public boolean isEntregado() {
	
		return entregado;
	
	}

	public void setEntregado(boolean entregado) {
	
		this.entregado = entregado;
	}

	public String getGenero() {

		return genero;
	
	}

	public void setGenero(String genero) {
	
		this.genero = genero;
	
	}

	public String getCreador() {
	
		return creador;
	
	}

	public void setCreador(String creador) {
	
		this.creador = creador;
	
	}
	
}
