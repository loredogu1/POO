package bozo;

public class Placar {
	private int[] placarAtual;
	
	
	public Placar () {
	   placarAtual = new int[10];
	   for (int i = 0; i < 10; i++) {
		   placarAtual[i] = -1;
	        }
	   }
	
	public String toString() {
		String result = " ";
		return result;
	}
	
	public void add(int []dado,int pos) {
		if(pos > 0 && pos < 11) {
			 switch (pos) {
			 case 1:
				 if (placarAtual[0] != -1)
					 throw new IllegalArgumentException("Posição ocupada.");
                 else {
                     int result = 0;
                     for(int i = 0; i<5; i++){
                         if(dado[i] == 1) result += 1;
                     }
                     placarAtual[0] = result;
				
			 }
				break;
			 case 2:
					 if (placarAtual[1] != -1)
						 throw new IllegalArgumentException("Posição ocupada.");
	                 else {
	                     int result = 0;
	                     for(int i = 0; i<5; i++){
	                         if(dado[i] == 2) result += 2;
	                     }
	                     placarAtual[1] = result;
					
				 }
				 break;
				 
			 case 3 :
					 if (placarAtual[2] != -1)
						 throw new IllegalArgumentException("Posição ocupada.");
	                 else {
	                     int result = 0;
	                     for(int i = 0; i<5; i++){
	                         if(dado[i] == 3) 
	                        	 result += 3;
	                     }
	                     placarAtual[2] = result;
					
				 }
				break;
			 case 4:
				 if (placarAtual[3] != -1)
					 throw new IllegalArgumentException("Posição ocupada.");
                 else {
                     int result = 0;
                     for(int i = 0; i<5; i++){
                         if(dado[i] == 4) 
                        result += 4;
                     }
                     placarAtual[3] = result;
				
			 }
				 break;
			 case 5:
				 if (placarAtual[4] != -1)
					 throw new IllegalArgumentException("Posição ocupada.");
                 else {
                     int result = 0;
                     for(int i = 0; i<5; i++){
                         if(dado[i] == 5) result += 5;
                     }
                     placarAtual[4] = result;
				
			 }
				 break;
			 case 6:
				 if (placarAtual[5] != -1)
					 throw new IllegalArgumentException("Posição ocupada.");
                 else {
                     int result = 0;
                     for(int i = 0; i<5; i++){
                         if(dado[i] == 6) result += 6;
                     }
                     placarAtual[5] = result;
				
			 }
				 break;
			 
			 
			 
		case 7: // full hand
            int flagFull = 0, flag3 = 0, flag2 = 0;
            int full[];
            full = new int[6];
            for(int i=0; i<5; i++) {
            	full[dado[i] - 1]++;
            }
            for(int i=0; i<6; i++){ // anda procurando o full hand
                if(full[i] == 3)
                	flag3 = 1;
                if(full[i] == 2) 
                	flag2 = 1;
                if(full[i] == 5) 
                	flagFull = 1;
            }

            if(flag2 == 1 && flag3 == 1) placarAtual[6] = 15;
            else if(flagFull == 1) 
            	placarAtual[6] = 15;
            else
            	placarAtual[6] = 0;

            break;
			 
			 }
		}else {
			throw new IllegalArgumentException ("Posição invalida\n"); 
		}
			
	}
	
	
	public int getScore() {
		int result= 0;
		for(int i =0 ; i< 10; i++) {
			result += this.placarAtual[i];
		}
		
		return result;
	}
	
}
