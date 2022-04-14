package aula4.exercicios.maqCafe;

public class Cafe {
	private final boolean doce;
	private final char tipo;
	
	public Cafe(char tipo, boolean doce) {
		this.doce=doce;
		this.tipo=tipo;
	}
	public String getTipo() {
		if(this.tipo=='T') return "tradicional";
		else return "forte";
	}
	public boolean isDoce() {
		return this.doce;
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(o==this) return true;
		if(!(o instanceof Cafe)) return false;
		Cafe par = (Cafe)o;
		return par.doce==this.doce&&
			   par.tipo==this.tipo;
	}
	@Override
	public String toString() {
		String doce;
		if(this.doce) doce= "adoçado";
		else doce = "não adoçado";
		return "café "+this.getTipo()+" "+doce;		
	}
}
