package aula4;

import java.time.LocalDate;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Tiagao", LocalDate.of(2000, 02, 20));
		Pessoa p3 = p;
		Pessoa p2 = new Pessoa("Tiago", LocalDate.of(2000, 2, 20));
		
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(Integer.toHexString(p.hashCode()));
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass().getSimpleName());
		

		System.out.println(p==p2);
		System.out.println(p==p3);
		System.out.println(p.equals(p2)==false);
		p3 = new Pessoa("Tiagao", LocalDate.of(2000, 2, 20));
		System.out.println(p.equals(p3));
		Pessoa p0 = new Pessoa("Tiagao", LocalDate.of(1999, 3, 3));
		System.out.println(p0.equals(p2)==false);
		
	}
}
