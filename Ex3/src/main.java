import java.io.IOException;


// programa para ajudar a mostrar a função das classes

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		System.out.println("Calculo de area de circulo, Retangulo e Quadrado");
		System.out.println("-------------------------------------------");
		int flag = 1, entrada;
		
		while(flag == 1) {
			System.out.println("Escolha uma figura para calcular");
			System.out.println("1 - Circulo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Retangulo");
			System.out.println("4 - Sair");
				entrada = EntradaTeclado.leInt();
				
				switch (entrada) {
				case 1:
					double raio;
					System.out.println("-------------------------------------------");
					System.out.println("Inseri Raio");
					raio = EntradaTeclado.leDouble();
					Circulo c1 = new Circulo(raio);
					System.out.println("Inseri Cor");
					String cor = EntradaTeclado.leString();
					c1.setCor(cor);
					System.out.println("Perimetro "+c1.getPerimetroCirculo());
					System.out.println("Area "+ c1.getAreaCirculo());
					System.out.println("Cor "+ c1.getCor());
					System.out.println("-------------------------------------------");
					break;
				case 2:
					System.out.println("-------------------------------------------");
					System.out.println("Inseri Tamanho");
					int tam  = EntradaTeclado.leInt();
					Quadrado q1 = new Quadrado(tam);
					System.out.println("Inseri Cor");
					cor = EntradaTeclado.leString();
					q1.setCor(cor);
					System.out.println("Perimetro "+ q1.getPerimetroQuadrado());
					System.out.println("Area "+ q1.getAreaQuadrado());
					System.out.println("Cor "+ q1.getCor());	
					
					System.out.println("-------------------------------------------");					
					break;
				case 3:
					System.out.println("-------------------------------------------");
					System.out.println("Inseri Altura");
					int altura  = EntradaTeclado.leInt();
					System.out.println("Inseri tamanho do lado");
					int lados =  EntradaTeclado.leInt();
					Retangulo r1 = new Retangulo(altura, lados);
					System.out.println("Inseri Cor");
					cor = EntradaTeclado.leString();
					r1.setCor(cor);
					System.out.println("Perimetro "+ r1.getPerimentroRentagulo());
					System.out.println("Area "+ r1.getAreaRentagulo());
					System.out.println("Cor "+ r1.getCor());	
					System.out.println("-------------------------------------------");
					break;
					
				case 4:
					System.out.println("Saindo");
					flag = 0;
					break;
				default:
					System.out.println("Opcao errada!!!");
					break;
				}
		}
	}

	
	
}
