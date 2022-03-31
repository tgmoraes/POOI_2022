package aula4;

import java.time.LocalDate;

public class Pessoa {
	private LocalDate dataNasc;
	private String nome;
	//getters e setters
	public Pessoa(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setDataNascimento(LocalDate data) {
		this.dataNasc = data;
	}
	public LocalDate getIdade() {
		return this.dataNasc;
	}
	@Override	
	public String toString() {
		return this.nome;
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(this==o) return true;
		if(!(o instanceof Pessoa)) return false;
		
		Pessoa aux = (Pessoa)o;
		return (aux.nome.equals(this.nome) && 
		aux.dataNasc.equals(this.dataNasc));
	}
}
