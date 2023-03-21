package principal;

import java.util.Scanner;



import entidades.Cilindro;
import entidades.Cone;
import entidades.Esfera;
import entidades.Piramide;
import entidades.Quadrado;

public class Principal {
	
	static Scanner lerDados = new Scanner(System.in);
	
	public static int menu () {
		int num = 0;
		do {
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("[1]-area e perimetro do Quadrado: ");
			System.out.println("[2]-area e volume da esfera: ");
			System.out.println("[3]-area e volume do cilindro: ");
			System.out.println("[4]-area e volume do cone: ");
			System.out.println("[5]-area e volume da piramede (quadrangular): ");
			System.out.println("[]6-sair");
			num = lerDados.nextInt();
		}while ((num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5) && (num != 6));
		
		return num;
	}

	public static void main(String[] args) {
		int opcao, escolha, resultado;
		double raio, altura,geratriz,areaBase,areaLado;
		float lado;
		
		do {
			opcao = menu();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Digite o lado do quadrado: ");
				lado = lerDados.nextFloat();
				Quadrado quadrado = new Quadrado(lado);
				System.out.println("Escolha uma das opcao abaixo: \n[1]-Area: \n[2]-Perimetro: ");
				escolha = lerDados.nextInt();
				if (escolha == 1) {
					System.out.println("Area: "+quadrado.Area());
				}
				else {
					System.out.println("Perimetro: "+quadrado.Perimetro());
				}
			break;
			
			case 2:
				System.out.println("Digite o raio da esfera: ");
				raio = lerDados.nextDouble();
				Esfera esfera = new Esfera(raio);
				System.out.println("Escolha uma das opcao abaixo: \n[1]-Area: \n[2]-volume: ");
				escolha = lerDados.nextInt();
				if (escolha == 1) {
					System.out.printf("Area: %.2f \n",esfera.AreaEsfera());
				}
				else {
					System.out.printf("Volume: %.2f \n",esfera.VolumeEsfera());
				}
			break;
			
			case 3:	
				System.out.println("Digite o raio do cilindro: ");
				raio = lerDados.nextDouble();
				System.out.println("digite a altura do cilindro: ");
				altura = lerDados.nextDouble();
				Cilindro cilindro = new Cilindro(raio,altura);
				System.out.println("Escolha uma das opcao abaixo: \n[1]-Area: \n[2]-volume: ");
				escolha = lerDados.nextInt();
				if (escolha == 1) {
					System.out.printf("Area: %.2f \n",cilindro.area());
				}
				else {
					System.out.printf("Volume: %.2f \n",cilindro.volume());
				}
			break;
			
			case 4:
				System.out.println("Digite o raio do Cone: ");
				raio = lerDados.nextDouble();
				System.out.println("Digite a geratriz do Cone: ");
				geratriz = lerDados.nextDouble();
				Cone cone = new Cone(raio,geratriz);
				System.out.println("Escolha uma das opcao abaixo: \n[1]-Area: \n[2]-volume: ");
				escolha = lerDados.nextInt();
				if (escolha == 1) {
					System.out.printf("Area: %.2f \n",cone.AreaCone());
				}
				else {
					System.out.printf("Volume: %.2f \n",cone.VolumeCone());
				}
			break;
				
			case 5:
				System.out.println("Digie a Area da Base da Piramide: ");
				areaBase = lerDados.nextDouble();
				System.out.println("Digite a Area do Lado da Piramide: ");
				areaLado = lerDados.nextDouble();
				System.out.println("Digite a altura da Piramide: ");
				altura = lerDados.nextDouble();
				Piramide piramide = new Piramide(areaBase,areaLado,altura);
				System.out.println("Escolha uma das opcao abaixo: \n[1]-Area: \n[2]-volume: ");
				escolha = lerDados.nextInt();
				if (escolha == 1) {
					System.out.printf("Area: %.2f \n",piramide.areaPiramide());
				}
				else {
					System.out.printf("Volume: %.2f \n",piramide.volumePiramide());
				}
			break;
			}
			
		}while(opcao != 6);
		
		System.err.println("saindo...");
		
	
		
		lerDados.close();
	}
}
