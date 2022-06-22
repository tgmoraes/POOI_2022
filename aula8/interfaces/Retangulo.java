package aula8.interfaces;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends Forma2d {
	private final int base;
	private final int altura;
	public Retangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	@Override
	public double getArea() {
		return this.base*this.altura;
	}
	@Override
	public double getPerimetro() {
		return this.base*2+this.altura*2;
	}
	@Override
	public String toString() {
		return super.toString()+" altura:"+this.altura
				+" base:"+this.base
				+" perímetro:"+this.getPerimetro()
				+" área:"+this.getArea();
	}
	
}
