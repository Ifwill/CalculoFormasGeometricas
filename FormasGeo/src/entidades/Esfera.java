package entidades;

public class Esfera {
	private double raio;
	
	//Construtor-------------->
	public Esfera(double raio){
		this.raio = raio;
	}
	
	//Get e Set--------------->
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	//Metodos----------------->
	
	public double AreaEsfera() {
		double area;
		area = (4 * Math.PI * Math.pow (raio , 2));
		
		return area;
	}
	
	public double VolumeEsfera() {
		double volume;
		volume = (4 * Math.PI * Math.pow (raio, 3) /3);
		
		return volume;
	}
}
