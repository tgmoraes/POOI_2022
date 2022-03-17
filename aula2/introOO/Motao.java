package aula2.introOO;

public class Motao {
	String modelo;
	int velocidade;
	void acelerar() {
		this.velocidade++;
	}
	void frear() {
		if(this.velocidade>0) this.velocidade--;
	}
}
