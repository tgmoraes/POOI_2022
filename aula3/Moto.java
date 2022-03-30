package aula3;

public class Moto {
	//atributos
	private String modelo;
	private int velocidade;
	private Pessoa motorista;
	
	public Moto() {
		this.velocidade=0;
	}

	public Moto(String modelo) {
		this();
		this.modelo=modelo;
	}
	public Moto(String modelo, Pessoa motorista) {
		this(modelo);
		this.motorista=motorista;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public Pessoa getMotorista() {
		return this.motorista;
	}
	public void setMotorista(Pessoa motorista) {
		this.motorista=motorista;
	}
	//aumenta a velocidade até a velocidade máxima
	public void acelera(int vel) {
		int velFinal = 150;
		if(this.velocidade+vel> velFinal) this.velocidade=velFinal;
		else this.velocidade+=vel;
	}
	//diminui velocidade até parar 
	public void freia(int vel) {
		if(this.velocidade-vel<0) this.velocidade = 0;
		else this.velocidade-=vel;
	}
	public boolean exiteMotorista() {
		return this.motorista!=null;
	}
	
	
}
