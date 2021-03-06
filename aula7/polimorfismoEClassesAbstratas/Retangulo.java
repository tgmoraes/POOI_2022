package aula7.polimorfismoEClassesAbstratas;

public class Retangulo extends Forma2d{
	private final double base;
	private final double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return this.base*this.altura;
	}

	@Override
	public double getPerimetro() {
		return (this.base+this.altura)*2;
	}
	@Override
	public String toString() {
		return super.toString()+" base: "+this.base+" altura: "+this.altura;
	}
	
	
	

}
