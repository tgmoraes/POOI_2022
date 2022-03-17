package aula2.exercicios;

public class TesteEstudante {

	public static void main(String[] args) {
		Estudante joao = new Estudante();
			
		joao.inicializa("Joao Silva", 15);
		
		System.out.println(joao.nome.equals("Joao Silva"));
		System.out.println(joao.idade==15);

		//System.out.println(joao.calculaMedia());

		joao.insereNota(9, 2);
		joao.insereNota(8, 2);
		System.out.println(joao.calculaMedia()==8);
		joao.insereNota(7, 1);
		joao.insereNota(11,1);
		System.out.println(joao.calculaMedia()==7.5);
		joao.insereNota(10,3);
		joao.insereNota(2,4);
		System.out.println(joao.calculaMedia()==(25/3.0));
		
	}

}
