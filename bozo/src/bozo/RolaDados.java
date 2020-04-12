package bozo;

public class RolaDados {
	private Dado[] dados;
	private int quantLados;
	
	public RolaDados(int quant) {
		if (quant  > 0) { // tem que ser acima de 1 dado pra rolar
			this.quantLados = quant;
			this.dados = new Dado[quantLados];
			for(int i =0; i < quant;i++) {
				this.dados[i] = new Dado();
			}
			
		}else {
			throw new IllegalArgumentException("quantidade de lados invalido");
		}
	}
	
    public int[] rolar () { // rola a quantidade de dados que ele quer
        int mostra[];
        mostra = new int[quantLados];
        for (int i = 0; i < quantLados; i++) {
            mostra[i] = dados[i].rolar();
        }
        return mostra;
    }
    
    
    
}
