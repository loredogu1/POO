// igor guilherme pereira loredo
// 11275071

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
    
    
    public int [] rolar (String s) {
        int resultado[], auxiliar[];
        resultado = new int[quantLados];
        String separados[];
        separados = s.split(" ");
        int tam = separados.length;
        auxiliar = new int[tam];
        for (int i = 0; i < tam; i++) {
            auxiliar[i] = Integer.parseInt(separados[i]) - 1;
        }

        for (int i = 0; i < tam; i++) {
            dados[auxiliar[i]].rolar();
        }

        for (int i = 0; i <quantLados; i++) {
            resultado[i] = dados[i].getLado();
        }
        return resultado;
    }
    
    public String toString () { // desenha cada caso

        String result = "- 1 ----- 2 ------ 3 ------ 4 ------ 5-\n+-----+  +-----+  +-----+  +-----+  +-----+\n";
        
        for(int i=0; i< 5; i++) {
            if (dados[i].getLado() == 1)             	
            	result +="|     |  ";
            
            else if (dados[i].getLado() == 2 || dados[i].getLado() == 3) 
            	result+="|*    |  ";
            
            else 
            	result+="|*   *|  ";
            
            if (i == 4)            	
            	result+="\n";
        }

        for(int i=0; i< 5; i++) { // muda o dado que vai ser impresso
            if (dados[i].getLado() == 1 || dados[i].getLado() == 3 || dados[i].getLado() == 5)
            	result += "|  *  |  ";
            else if (dados[i].getLado() == 6) {// se o lado de cima for igual ao a 6
            	result+="|*   *|  ";
            }
            else
            	result+="|     |  "; // muda a string
            
             if (i == 4) {
            	result+="\n";
            }
        }

        for(int i=0; i< 5; i++) {
            if (dados[i].getLado() == 2 || dados[i].getLado() == 3) 
            	result+="|    *|  ";
            else if (dados[i].getLado() == 1)
            	result+="|     |  ";
            else 
            	result+="|*   *|  ";
            
            if (i == 4)
            	result+="\n";
        }

        result += "+-----+  +-----+  +-----+  +-----+  +-----+ \n";
        
        
        
        return result;
        
    }
    
    
}
