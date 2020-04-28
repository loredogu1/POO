//igor guilherme pereira loredo
// 11275071

package polimorfismo;

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
	
}
