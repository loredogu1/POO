package bozo;

public class Placar {
	private int[] placarAtual;
	
	
	public Placar () {
	   placarAtual = new int[10];
	   for (int i = 0; i < 10; i++) {
		   placarAtual[i] = 0;
	        }
	   }
	
	public String toString() {
		String result = " ";
		return result;
	}
	
	public void add(int novo) {
		this.placarAtual = this.placarAtual + novo;
	}
	
	
	public int getScore() {
		return this.placarAtual;
	}
	
}
