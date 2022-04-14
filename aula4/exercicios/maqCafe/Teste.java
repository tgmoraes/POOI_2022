package aula4.exercicios.maqCafe;

public class Teste {
	public static void main(String[] args) {
		CopoCafe cp1 = new CopoCafe(200);
		
		
		System.out.println(cp1);
		Cafe cafesinho = new Cafe('T', true); 
		cp1.encher(50, cafesinho);
		System.out.println(cp1.encher(50, cafesinho)==true);
		System.out.println(cp1.getQuantidade()==100);
		Cafe cafeAmargo = new Cafe('T', false);
		System.out.println(cp1.encher(50, cafeAmargo)==false);
		System.out.println(cp1.getQuantidade()==100);
		cp1.esvazia(200);
		System.out.println(cp1.getQuantidade()==0);
		System.out.println(cp1.encher(50, cafeAmargo)==true);
		System.out.println(cp1.getQuantidade()==50);
		
	}
}
