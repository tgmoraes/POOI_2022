package aula7.polimorfismoEClassesAbstratas.exercicios.animais;

public abstract class Animal {
	private final String nome;
	public Animal(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public abstract String seComunica() ;
}


