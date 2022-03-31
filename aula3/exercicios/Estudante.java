package aula3.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estudante {
	private String nome;
	private LocalDate dataNasc;
	private double[] notas = new double[3];
	
	public Estudante(String nome, LocalDate dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		for(int i=0;i<this.notas.length;i++) this.notas[i]=-1;
	}
		
	//getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setDataNascimento(int dia, int mes, int ano) {
		this.dataNasc = LocalDate.of (ano,  mes,  dia);
	}
	public String getDataNascimento() {
		DateTimeFormatter formato = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return this.dataNasc.format(formato);
	}
	public int getIdade() {
		LocalDate agora = LocalDate.now();
		//Period p =this.dataNasc.until(agora).;
		//return p.getYears();
		return this.dataNasc.until(agora).getYears();
	}
	public double getNota(int trimestre) {
		return this.notas[trimestre-1];
	}
	//metodos
	public void insereNota(double nota, int trimestre){
		if(trimestre>=1 && trimestre<=3) {
			if(nota>=0 && nota<=10)	this.notas[trimestre-1] = nota;
		}
	}
	
	public double calculaMedia() {
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
