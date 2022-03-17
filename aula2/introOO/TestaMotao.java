package aula2.introOO;

public class TestaMotao {
	public static void main(String[] args) {
		Motao honda = new Motao();
		honda.modelo = "CG 250";
		honda.velocidade = 0;
		
		Motao motoDoKleber = new Motao();
		motoDoKleber.modelo = "Fan 150";
		motoDoKleber.velocidade = 20;
		
		System.out.println(motoDoKleber.modelo.equals("Fan 150"));
		motoDoKleber.acelerar();
		motoDoKleber.acelerar();
		motoDoKleber.acelerar();
		motoDoKleber.velocidade=23;
		System.out.println(motoDoKleber.velocidade == 23);
		motoDoKleber.frear();
		System.out.println(motoDoKleber.velocidade == 22);
		
		honda.acelerar();
		honda.frear();
		honda.frear();
		System.out.println(honda.velocidade == 0);
		
	}
}
