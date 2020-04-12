package bozo;

public class Dado {
	private int lados;
	private Random rand;
	private int LadoCima;
	
	
	public int rolar() { // usa o rand e rola os dados de forma efiente
		try {
			LadoCima = rand.getIntRand(1, lados+1); // usa a função random
		} catch(IllegalArgumentException e) {
			System.out.println("Número de lados inválido");
		}	
		
		return getLado(); // retoma o numero sorteador
	}
	
	public Dado() { // defeat com 6 lados
		lados = 6;
		rand = new Random();
		rolar(); // rola os dados
	}
	
	public Dado(int n) { // construtor que usar mais/menos de 6 lados
		if (n <= 1)
			throw new IllegalArgumentException("Numero de dados dever ser maior que 1");
		rand = new Random(); // cria um elemento para rolar o dados
		lados = n;
		rolar();
	}
	
	public int getLado() {
		
		return LadoCima; // retona lado sorteado pelo o rand
	}
	
	public String toString() {
		String visaolados = ""; 
			switch (this.LadoCima) { // ver qual lado vai ser impresso
			case 1:
					visaolados += "+-----+\n"; 
					visaolados += "|     |\n"; 
					visaolados += "|  *  |\n"; 
					visaolados += "|     |\n"; 
					visaolados += "+-----+\n"; 
				
					break;
				case 2: 
					visaolados += "+-----+\n"; 
					visaolados += "|    *|\n"; 
					visaolados += "|     |\n"; 
					visaolados += "|*    |\n"; 
					visaolados += "+-----+\n"; 
					
					break;
				case 3:
					visaolados += "+-----+\n"; 
					visaolados += "|    *|\n"; 
					visaolados += "|  *  |\n"; 
					visaolados += "|*    |\n"; 
					visaolados += "+-----+\n"; 
					
					break;
				case 4:
					
					visaolados += "+-----+\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "|     |\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "+-----+\n"; 
					
					break;
				case 5:
					visaolados += "+-----+\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "|  *  |\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "+-----+\n"; 
					
					break;
				
				case 6:
					visaolados += "+-----+\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "|*   *|\n"; 
					visaolados += "+-----+\n"; 
					break;
				
			}
			
			
		return visaolados; 
	}
}
