package polimorfismo;

public class Quadrado extends Figura {
	int Numlados;
	
	public Quadrado(){
		Numlados = 0;
	}
	
	public Quadrado(int lados) {
		Numlados = lados;
	}
	
	public int getLados() {
		return this.Numlados;
	}
	
	public int getPerimetroQuadrado() {
		return 4*Numlados;
	}
	
}
