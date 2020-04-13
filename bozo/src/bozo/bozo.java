

package bozo;

import java.io.IOException;

public class bozo {

	public static void main(String[] args) throws IOException {
		RolaDados vetdados = new RolaDados(5);
		Placar placar = new Placar();
		
		System.out.println("---------------------------------");
		System.out.println("   	      Bozó");
		System.out.println("_________________________________");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Aperte Enter para começar a rodada");
			
			String buffer = EntradaTeclado.leString();
			
			int result[] = vetdados.rolar(); // imprime		            
            System.out.println(vetdados);
			System.out.printf("Escolha os dados para rolar novamente ou digite ENTER para terminar a  rodada\n");
			
			
            String novos = EntradaTeclado.leString();		
			
            
            if (!novos.equals("")) {
                result = vetdados.rolar(novos);
                System.out.println(vetdados);

                System.out.printf("Escolha os dados a serem rolados novamente ou digite ENTER para finalizar a rodada\n");
                novos = EntradaTeclado.leString();

                if (!novos.equals("")) {

                    result = vetdados.rolar(novos);

                }
                System.out.println(vetdados);
            } else
            	System.out.println(vetdados);
            
            
            System.out.println(placar);
            System.out.printf("Escolha uma posicao de 1 a 10 para ser ocupada\n");
            int pos = EntradaTeclado.leInt();

            try {
                placar.add( result, pos);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Escolha uma posicao possivel para ser ocupada");
                pos = EntradaTeclado.leInt();
                placar.add(result, pos);
            }
                System.out.println(placar);
            
			
		}
		
		System.out.println("Você obteve " + placar.getScore() + " pontos!\n");

	}

}





