package aula4.exercicios.maqCafe;

public class CopoCafe {
	private int quantidade;			 //quantidade em mL 
	private final int capacidade;	 //capacidade em mL 
	private Cafe tipoCafe;

	public CopoCafe(int capacidade) {
		this.quantidade=0;
		this.tipoCafe=null;
		this.capacidade = capacidade;
	}
	
	//getters –> para os três atributos;
	public int getCapacidade() {
		return this.capacidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public Cafe getTipoCafe() {
		return this.tipoCafe;
	}
	
	public boolean encher(Cafe cafe) {
		return this.encher(this.capacidade,cafe);
	}

	public boolean encher(int qtde, Cafe cafe) {
		boolean consegui=false;
		int valorPreencher;
		if(qtde>(this.capacidade-this.quantidade)) {
			valorPreencher = (this.capacidade-this.quantidade);
		}else valorPreencher = qtde;
		
		if(this.quantidade==0 && this.tipoCafe==null) {
			this.quantidade = valorPreencher;
			this.tipoCafe = cafe;
			consegui=true;
		}else {
			if(cafe.equals(this.tipoCafe)) {
				this.quantidade += valorPreencher;
				consegui=true;
			}
		} 
		return consegui;
	}
	
	public void esvazia(int valor) {
		if(valor>0) {
			this.quantidade-=valor;
			if(this.quantidade<=0) {
				this.quantidade=0;
				this.tipoCafe= null;
			}
		}
	}

	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(o==this) return true;
		if(!(o instanceof CopoCafe)) return false;
		CopoCafe par = (CopoCafe)o;
		return this.capacidade==par.capacidade &&
			   this.quantidade==par.quantidade &&
			   this.tipoCafe.equals(par.tipoCafe);
	}
	
	@Override
	public String toString() {
		String cafe;
		if(this.tipoCafe==null) cafe= "(vazio)";
		else cafe = "de "+this.tipoCafe.toString();
		return "copo de "+this.capacidade+" mL com "+this.quantidade+
				" mL"+cafe;
	}
}





