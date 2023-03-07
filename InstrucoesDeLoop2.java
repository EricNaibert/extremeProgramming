package extremeProgramming;

import java.util.*;

public class InstrucoesDeLoop2 {
	
	public static void main(String [] args) {
		
		double nota1, nota2, media;
		int alunos, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Quantos alunos estudam na sala?: ");
		alunos = input.nextInt();
		
		for(i=1; i<=alunos; i++) {
			
			System.out.println("Aluno " + i);
			System.out.print("Digite a primeira nota do aluno:");
			nota1 = input.nextDouble();
			System.out.print("Digite a segunda nota do aluno:");
			nota2 = input.nextDouble();
			media = (nota1 + nota2)/2;
			System.out.println("Resultado: " + media);
			System.out.println("");
			if (i == alunos) {
				input.close();
			}
		}
		
	}

}
