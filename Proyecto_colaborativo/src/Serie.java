import java.io.*;
public class Serie {
	
	static BufferedReader teclado=new BufferedReader (new InputStreamReader (System.in)) ;
	
	
	private String titulo;
	private int numero_de_temporadas=3;
	private boolean entregado= false;
	private String genero;
	private String creador;
	
	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numero_de_temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numero_de_temporadas = numero_de_temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public static BufferedReader getTeclado() {
		return teclado;
	}

	public static void setTeclado(BufferedReader teclado) {
		Serie.teclado = teclado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero_de_temporadas() {
		return numero_de_temporadas;
	}

	public void setNumero_de_temporadas(int numero_de_temporadas) {
		this.numero_de_temporadas = numero_de_temporadas;
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
