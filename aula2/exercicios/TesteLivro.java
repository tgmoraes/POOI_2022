package aula2.exercicios;

public class TesteLivro {
	public static void main(String[] args) {
		Livro livro1 = new Livro();
		
		livro1.titulo = "O senhor dos Anéis - A sociedade do Anel";
		livro1.paginas = 450;
		livro1.pagsLidas = 0;
		
		System.out.println(livro1.titulo.equals("O senhor dos Anéis "
				+ "- A sociedade do Anel"));
		System.out.println(livro1.paginas==450);
		System.out.println(livro1.pagsLidas==0);
		
		System.out.println(livro1.ler(100)==false);
		System.out.println(livro1.pagsLidas==100);

		System.out.println(livro1.ler(150)==false);
		System.out.println(livro1.pagsLidas==250);

		System.out.println(livro1.ler(200)==true);
		System.out.println(livro1.pagsLidas==450);

		System.out.println(livro1.ler(1)==true);
		System.out.println(livro1.pagsLidas==450);

		livro1.recomeca();
		
		System.out.println(livro1.ler(1)==false);
		System.out.println(livro1.pagsLidas==1);	
		
		double[] notas = new double[3];
		
		System.out.println(notas[0]);
		System.out.println(notas[1]);
		System.out.println(notas[2]);
		
	}
}
