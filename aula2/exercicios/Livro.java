package aula2.exercicios;

public class Livro {
	//atributos
	String titulo;
	int paginas;
	int pagsLidas;
	//metodos
	void recomeca() {
		this.pagsLidas=0;
	}
	boolean ler(int pags) {
		if(pags+this.pagsLidas >= this.paginas) {
			this.pagsLidas = this.paginas;
			return true;
		} else {
			this.pagsLidas += pags;
			return false;
		}
	}
}