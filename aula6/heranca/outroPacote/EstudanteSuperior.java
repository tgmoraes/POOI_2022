package aula6.heranca.outroPacote;

import aula6.heranca.Pessoa;
import aula6.heranca.Estudante;

public  class EstudanteSuperior extends Estudante{
	
	public EstudanteSuperior(String nome, String matricula) {
		super(nome, matricula); // chamando construtor da classe pai(superclasse) Estudante
	}
	@Override
	public String quemSou() {
		String retorno = "Sou ";
		// mesmo fora do pacote, consegue usar pois é 
		// protected e recebe por herança indireta
		retorno+= this.nome;
		retorno+= " e sou estudante do ensino superior!";
		return retorno;
	}
}
