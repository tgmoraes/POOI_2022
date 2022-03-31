package aula3.exercicios;

public class TesteLivro {
	public static void main(String[] args) {
		Livro livro1 = new Livro(450,"O senhor dos Anéis - A sociedade do Anel");
		
		System.out.println(livro1.getTitulo().equals("O senhor dos Anéis "
				+ "- A sociedade do Anel"));
		System.out.println(livro1.getPaginas()==450);
		System.out.println(livro1.getPagsLidas()==0);
		
		System.out.println(livro1.ler(100)==false);
		System.out.println(livro1.getPagsLidas()==100);

		System.out.println(livro1.ler(150)==false);
		System.out.println(livro1.getPagsLidas()==250);

		System.out.println(livro1.ler(200)==true);
		System.out.println(livro1.getPagsLidas()==450);

		System.out.println(livro1.ler(1)==true);
		System.out.println(livro1.getPagsLidas()==450);

		livro1.recomeca();
		
		System.out.println(livro1.ler(1)==false);
		System.out.println(livro1.getPagsLidas()==1);	
				
	}
}
