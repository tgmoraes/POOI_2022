package aula2.exercicios;

import java.util.ArrayList;
public class TestaLista {
	public static void main(String[] args) {
		
		//vetor X lists
		
		
		Lista l = new Lista();
		System.out.println(l.paraTexto());
		l.add(4);
		l.add(6);
		System.out.println(l.paraTexto());		
		l.add(8);
		System.out.println(l.paraTexto());
		l.add(10);
		System.out.println(l.paraTexto());
		l.add(12);
		l.valores[2] =90;
		System.out.println("valor 2:"+l.get(2));
		System.out.println("valor tam:"+l.getTamanho());
		l.remove(1);
		System.out.println(l.paraTexto());

		l.add(14);
		System.out.println(l.paraTexto());
		l.add(14);
		System.out.println(l.paraTexto());
		l.add(5);
		System.out.println(l.paraTexto());
		l.add(24);
		System.out.println(l.paraTexto());
		l.add(9);
		System.out.println(l.paraTexto());
		l.add(13);
		System.out.println(l.paraTexto());
		l.add(11);
		l.add(11);
		l.add(11);
		l.add(11);
		System.out.println(l.paraTexto());
		
		
	}

}
