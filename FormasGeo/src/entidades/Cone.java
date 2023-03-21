package entidades;

public class Cone {
	private double raio;
	private double geratriz;
	
	//construtores----------------->
		public Cone(double raio, double geratriz) {
			this.raio = raio;
			this.geratriz = geratriz;
		}
		
	// gets e sets-------------------->
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getGeratriz() {
		return geratriz;
	}

	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}
	//Metodos---------------->
	
	public double AreaCone() {
		double area;
		area = (Math.PI * raio) * (raio + geratriz);
		
		return area;
	}
	public double VolumeCone() {
		double volume;
		volume = 1 / 3 * Math.PI * (raio * raio);
		
		return volume;
	}
	
	
	
	
	
}
