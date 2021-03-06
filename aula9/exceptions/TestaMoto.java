package aula9.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaMoto {

	public static void main(String[] args)  {
		Scanner inp = new Scanner(System.in);
		Moto cg = new Moto("CG Titan");
		
		System.out.println("Informe o valor que deseja aumentar na velocidade da moto.");
		//int velo = inp.nextInt();
		try {
			int vel = inp.nextInt();
			cg.acelera(vel);
			cg.freia(vel-10);
			
		} catch (InputMismatchException e) {
			
			System.out.println("Você deve informar um valor numérico!");
//			System.out.println(e);
//			System.out.println("----------------");
//			System.out.println(e.getMessage());
//			System.out.println("----------------");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(e);	
		} catch (VelocidadeException e) {
			System.out.println(e);	
		}
		
		System.out.println("Até mais!");
	}

}
