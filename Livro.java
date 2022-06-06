package Model;

public class Livro {
	private String titulo;
	private String genero;
	private String situacao;
	private int preco;
	private int entiqueta;
	
	public Livro(String titulo, String genero, String situacao, int preco, int entiqueta) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.situacao = situacao;
		this.preco = preco;
		this.entiqueta = entiqueta;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getEntiqueta() {
		return entiqueta;
	}
	public void setEntiqueta(int entiqueta) {
		this.entiqueta = entiqueta;
	}
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
}
