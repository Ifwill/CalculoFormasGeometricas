package entidades;

public class Piramide {
	private double areaBase;
	private double areaLado;
	private double altura;
	
	

	//construtores------------------->
	public Piramide(double areaBase, double areaLado, double altura) {
		this.areaBase = areaBase;
		this.areaLado = areaLado;
		this.altura = altura;
	}
	//gets e sets-------------------->
	
	public double getAreaBase() {
		return areaBase;
	}
	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}
	public double getAreaLado() {
		return areaLado;
	}
	public void setAreaLado(double areaLado) {
		this.areaLado = areaLado;
	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	//metodos------------------->
	
	public double areaPiramide() {
		double area;
		area = areaBase + areaLado;
		
		return area;
	}
	public double volumePiramide() {
		double volume;
		volume = areaBase * altura / 3;
		
		return volume;
	}
	
}
