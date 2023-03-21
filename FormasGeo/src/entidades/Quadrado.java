package entidades;

public class Quadrado {
	private float lado;
	
	//Construtor----------------->
	public Quadrado(float lado) {
		this.lado = lado;
	}
	
	//get e set ------------------>
	public float getLado() {
		return lado;
	}
	
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	//Metodos-------------------->
	public float Area() {
		float area;
		area = (this.lado*2);
		
		return area;
	}
	
	public float Perimetro() {
		float perimetro;
		perimetro = (this.lado*4);
		
		return perimetro;
	}

}
