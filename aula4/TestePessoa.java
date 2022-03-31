package aula4;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Tiagao");
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(Integer.toHexString(p.hashCode()));
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass().getSimpleName());
		

	}
}
