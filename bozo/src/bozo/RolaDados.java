package bozo;

public class RolaDados {
	private Dado[] dados;
	private int quantLados;
	
	public RolaDados(int quant) {
		if (quant  > 0) { // tem que ser acima de 1 dado pra rolar
			quantLados = quant;
			dados = new Dado[quantLados];
			for(int i =0; i < quant;i++) {
				dados[i] = new Dado();
			}
			
		}else {
			throw new IllegalArgumentException("quantidade de lados invalido");
		}
	}
	
	
}
