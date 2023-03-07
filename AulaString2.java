package extremeProgramming;

import java.util.Scanner;

public class AulaString2 {
	
	public static void main(String [] args) {
		
		double nota1, nota2, media;
		int alunos, i;
		String nome;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na sala?: ");
		alunos = input.nextInt();
		double armazenaNota[] = new double[alunos];
		String armazenaNome[] = new String[alunos];
		
		for(i = 0; i < alunos; i++) {
			System.out.print("Qual o nome do aluno " + (i+1) + "?: ");
			nome = input.next();
			armazenaNome[i] = nome;
			System.out.print("Qual a primeira nota de " + nome + "?:");
			nota1 = input.nextDouble();
			System.out.print("Qual a segunda nota de " + nome + "?:");
			nota2 = input.nextDouble();
			media = (nota1 + nota2)/2;
			armazenaNota[i] = media;
			System.out.println("A media das notas de " + nome + ": " + media);
			System.out.println("");
				
		
			if (i == alunos) {
				input.close();
			}
		}
		
		for(int i2=0; i2<armazenaNota.length; i2++) {
			System.out.println("Nota do(a) aluno(a) " + armazenaNome[i2] + ": " + armazenaNota[i2] );
		}
		
	}
}
	
		
			
			
			
		
			
			
	
		