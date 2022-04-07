package aula4;

import java.time.LocalDate;
import java.util.Arrays;

public class TesteCompare {
	public static void printaVet(Pessoa[] vet) {
		System.out.print("[");
		for(int i=0;i<vet.length;i++) {
			System.out.print("("+vet[i]+")");
		}
		System.out.print("]\n");
	}
	public static void main(String[] args) {
		Pessoa[] vetPes = new Pessoa[4];
		
		System.out.println(Pessoa.getCont());
		vetPes[0]= new Pessoa("Tiagao", LocalDate.of(2000, 02, 20));
		System.out.println(vetPes[0].getCont()==Pessoa.getCont());
		System.out.println(Pessoa.getCont());
			
		vetPes[1] = new Pessoa("Tiago", LocalDate.of(2005, 02, 20));
		System.out.println(Pessoa.getCont());
		
		vetPes[2] =new Pessoa("Tiagao", LocalDate.of(1999,1,1));
		System.out.println(Pessoa.getCont());
		
		vetPes[3] =new Pessoa("Tiagao", LocalDate.of(2000,2,20));
		System.out.println(Pessoa.getCont());
		System.out.println(vetPes[2].getCont()==vetPes[0].getCont());
			
		String[] vetString = new String[3];
		vetString[0] = "aabb";
		vetString[1] = "aaab";
		vetString[2] = "bbaa";

		System.out.println(vetString[0].compareTo(vetString[1]));
		System.out.println(vetString[0].compareTo(vetString[0]));
		System.out.println(vetString[2].compareTo(vetString[0]));

		Arrays.sort(vetString);
		
		printaVet(vetPes);
		
		Arrays.sort(vetPes);
		
		printaVet(vetPes);
		
	}
}
