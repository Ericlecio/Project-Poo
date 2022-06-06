package Model;

public class Livro {
	private String titulo;
	private String genero;
	private String situacao;
	private float preco;
	private int entiqueta;
	
	public Livro(String titulo, String genero, String situacao, float preco, int entiqueta) {
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
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
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
	}
}
