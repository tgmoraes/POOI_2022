package aula5.agregacao;

public class Conta {
	private int limite;
	private double saldo;
	//agregacao entre conta e cliente um para um
	private Cliente titular;
	
	
	//construtores
	public Conta(int limite, double saldo, Cliente c) {
		this.titular = c;
		this.setLimite(limite);
		this.saldo = saldo;
	}
	public Conta(int limite) {
		this.titular = null;
		this.setLimite(limite);
		this.saldo = 0;
	}
	//getters e setters
	public Cliente getTitular() {
		return this.titular;
	}
	public void setCliente(Cliente c) {
		this.titular = c;
	}
	public int getLimite() {
		return this.limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public double getSaldoDisponivel() {
		return this.saldo+this.limite;
	}
	//outros métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) {
		if(valor<=(this.getSaldoDisponivel())) {
			this.saldo -= valor;
		}
	}
}
