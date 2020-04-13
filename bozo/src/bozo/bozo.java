// igor guilhernme pereira loredo
// 11275071


package bozo;

import java.io.IOException;

public class bozo {

	public static void main(String[] args) throws IOException {
		RolaDados vetdados = new RolaDados(5);
		Placar placar = new Placar();
		
		System.out.println("-------------------------------------------");
		System.out.println("   	        Bozo/General");
		System.out.println("___________________________________________");
		
		for(int i = 0; i < 10; i++) { // faz as 10 rodadas
			System.out.println("Aperte Enter para começar a rodada: " + (i +1));
			
			String buffer = EntradaTeclado.leString(); // serve somente para pegar o enter do teclado
			
			int result[] = vetdados.rolar(); // rola os dados e manda 
			
            System.out.println(vetdados); // imprive os dados rolados
			System.out.printf("Escolha os dados para rolar novamente ou digite Enter para terminar a  rodada\n");
			
			
            String novos = EntradaTeclado.leString();		
			
            
            if (!novos.equals("")) {
                result = vetdados.rolar(novos);
                System.out.println(vetdados);

                System.out.printf("Escolha os dados a serem rolados novamente ou digite Enter para terminar a  rodada\n");
                
                novos = EntradaTeclado.leString();

                if (!novos.equals("")) {

                    result = vetdados.rolar(novos);

                }
                
                
                System.out.println(vetdados); // imprime os dados ja prontos 
                
                
                
            } else {
            	System.out.println(vetdados);
            }
            
            System.out.println(placar);
            System.out.printf("Escolha uma posicao de 1 a 10 para dar o placar \n");
            int pos = EntradaTeclado.leInt();

            try {
            	
                placar.add( result, pos); // add ao placar o resultado  na posicaos possivel
                
            } catch (IllegalArgumentException e) {
            	
                System.out.println(e.getMessage());
                
                System.out.println("Digite uma posicao que possa ser usada");
                
                pos = EntradaTeclado.leInt();
                
                placar.add(result, pos); // caso tenha só um erro de digitacao
            }
            
                System.out.println(placar); // imprime o placar nome final da rodada
            
			
		}
		
		System.out.println("Você fez " + placar.getScore() + " pontos!\n");

	}

}





