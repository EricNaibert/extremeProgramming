package extremeProgramming;

import java.util.*;

public class InstrucoesDeLoop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int opcao=0;
		
		
		do {
			System.out.println("--------------");
			System.out.println("Menu Principal");
			System.out.println("--------------");
			System.out.println("Escolha uma das opcoes abaixo:");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Coordenador");
			System.out.println("4 - Sair");
			opcao = input.nextInt();
			
			if (opcao == 4) {
				break;
			}
			
			switch(opcao) {
			case 1: 
				System.out.println("Bem vindo a central do aluno.");
				break;
				
			case 2:
				System.out.println("Bem vindo a central do professor.");
				break;
				
			case 3:
				System.out.println("Bem vindo a central do coordenador.");
				break;
				
			default:
				System.out.println("Digite uma opcao valida!");
			}
			
		
		} while (opcao == 0 || opcao >=5);  
			
		
		System.out.println("Fim");
		input.close();
		
	}

}
