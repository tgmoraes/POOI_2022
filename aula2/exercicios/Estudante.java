package aula2.exercicios;

public class Estudante {
	String nome;
	int idade;
	double[] notas = new double[3];
	
	void inicializa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		for(int i=0;i<this.notas.length;i++) this.notas[i]=-1;
	}
	
	void fazAniversario() {
		this.idade++;
	}
	
	void insereNota(double nota, int trimestre){
		if(trimestre>=1 && trimestre<=3) {
			if(nota>=0 && nota<=10)	this.notas[trimestre-1] = nota;
		}
	}
	
	double calculaMedia() {
		int cont=0;
		double sum =0;
		for(double nota: this.notas) {
			if(nota>=0) {
				sum += nota;
				cont++;
			}
		}
		return sum/cont;
	}
}
