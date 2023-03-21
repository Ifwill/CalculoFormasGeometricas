package entidades;

public class Cilindro {
	private  double raio;
	private double altura;
	
	//construtores------------------->
	public Cilindro(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	
	
	//get e sets------------------>
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodos----------------------->
	
	public double area() {
		double area;
		area= ((Math.PI * 2) * raio)*(raio + altura);
		
		return area;
		
	}
	
	public double volume() {
		double volume;
		volume = (Math.PI * (raio*raio)) * altura;
		
		return volume;
		
	}
	
}
