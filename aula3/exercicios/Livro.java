package aula3.exercicios;

public class Livro {
	//atributos
	private String titulo;
	private int paginas;
	private int pagsLidas;
	
	//construtores
	public Livro(String titulo) {
		this.titulo=titulo;
		this.pagsLidas=0;
	}
	public Livro(int paginas,String titulo) {
		this(titulo);
		this.paginas=paginas;
	}
	
	//getters e setters
	public int getPaginas() {
		return this.paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas=paginas;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public int getPagsLidas() {
		return this.pagsLidas;
	}
	//metodos
	public void recomeca() {
		this.pagsLidas=0;
	}
	public boolean ler(int pags) {
		if(pags+this.pagsLidas >= this.paginas) {
			this.pagsLidas = this.paginas;
			return true;
		} else {
			this.pagsLidas += pags;
			return false;
		}
	}
}