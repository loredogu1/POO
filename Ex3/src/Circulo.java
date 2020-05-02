
public class Circulo extends Figura{
	private double Raio;
	
	public Circulo() {
		Raio = 0;
	}
	
	public Circulo(double raio) {
		Raio = raio;
	}
	
	public double getAreaCirculo() {
		double area = Math.PI*Math.sqrt(Raio);
		return area;
	}
	
	public double getPerimetroCirculo() {
		double pe= (2*Math.PI)*Raio;
		return pe;
	}
	
	public String toString() {
		String r = " "+ Raio + " ";
		return r;
	}
}
