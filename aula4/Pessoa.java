package aula4;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa>{
	private final LocalDate dataNasc;
	private final String nome;
	private double peso;
	private static int cont=0;
	//getters e setters
	public Pessoa(String nome, LocalDate dataNasc) {
		this.dataNasc = dataNasc;
		this.nome=nome;
		Pessoa.cont++;
	}
	public Pessoa(String nome, LocalDate dataNasc, double peso) {
		this(nome, dataNasc);
		this.peso = peso;
	}
	
	public static int getCont() {
		return Pessoa.cont;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	public LocalDate getIdade() {
		return this.dataNasc;
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
	@Override
	public int compareTo(Pessoa o) {
		int ret = this.nome.compareTo(o.nome);
		if(ret==0) ret= this.dataNasc.compareTo(o.dataNasc);
		return ret;
	}
	@Override
	public String toString() {
		return this.nome+" - "+this.dataNasc;
	}
}
