package aula6.heranca.outroPacote;

import aula6.heranca.Estudante;
import aula6.heranca.Pessoa;

public class TestaHeranca {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		 
		Pessoa julio = new Pessoa("Julio");
		Estudante carlos = new Estudante("Carlos", "m1829");
		EstudanteSuperior maria = new EstudanteSuperior("Maria Rita", "s8273"); 
		
		pessoas[0] = julio;
		pessoas[1] = carlos;
		pessoas[2] = maria;

		for(Pessoa p:pessoas) {
			System.out.println(p.quemSou());
		}
		
		Estudante car = null;
		if(carlos instanceof Estudante) {
			car = (Estudante)carlos;
		}
		System.out.println(car.getMatricula());
		
		System.out.println(julio.quemSou());
		System.out.println(carlos.quemSou());
		System.out.println(maria.quemSou());
		carlos.setNome("Carlos car loss");
		//estas linhas abaixo funcionarão se esta 
		//classe estiver no mesmo package de Pessoa (aula6.heranca)
		//System.out.println(julio.nome);	
		//System.out.println(carlos.nome);
	}

}
