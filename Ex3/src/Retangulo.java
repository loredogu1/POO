
public class Retangulo extends Quadrado{
	int altura;
	
	public Retangulo() {
		altura = 0;
		Numlados =0;
	}
	
	public Retangulo(int altura, int lados) {
		this.altura = altura;
		Numlados = lados;
	}
	
	public int getAlturaRentagulo() {
		return altura;
	}
	
	
	public int getAreaRentagulo() {
		return (Numlados*altura);
	}
	
	public int getPerimentroRentagulo() {
		return ((2*Numlados) + (2*altura));
	}
	
	public String toString() {
		String r = " " +Numlados + " " + altura +" ";
		return r;
	}
	
}
