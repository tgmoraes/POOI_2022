package aula5.agregacao;

public class TestaContaCliente {
	public static void main(String[] args) {
		//a parte existe independente
		Cliente cli  = new Cliente("João Silva",4000);
		cli.setDataNascimento(5, 3, 1996);
		System.out.println(cli.getDataNascimento());
		System.out.println(cli.getIdade());

		Conta conta = new Conta(1000);
		// estabelecendo a agregação entre os objetos
		conta.setCliente(cli);
		
		System.out.println(conta.getSaldoDisponivel()==1000);
		
		conta.deposita(4000);
		System.out.println(conta.getSaldoDisponivel()==5000);
		
		//System.out.println(conta.getTitular().getIdade()==cli.getIdade());
		//System.out.println(conta.getTitular()==cli);
		
	}
}
