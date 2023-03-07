package extremeProgramming;

import java.util.*;

public class Instrucoes {
	
	//programa1
	/*
	public static void main(String[] args) {
		
		int valor;
		System.out.print("Write a number: ");
		Scanner input = new Scanner(System.in);
		valor = input.nextInt();
		input.close();
		
		if (valor==8) {
			System.out.println("Valor equals 8");
		} else if (valor>8) {
			System.out.println("Valor is higher then 8");
		} else {
			System.out.println("Valor is lower than 8");
		}
		
	}
	*/
	
	//programa2
	public static void main(String[]args) {
		
		double nota1, nota2, nota3, media;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da nota 1: ");
		nota1 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 2: ");
		nota2 = input.nextDouble();
		
		System.out.println("Digite o valor da nota 3: ");
		nota3 = input.nextDouble();
		input.close();
		
		media = (nota1 + nota2+ nota3)/3;
		System.out.println("A media das notas: " + media);
		
		if (media >= 7) {
			System.out.println("O aluno esta aprovado!");
		} else if (media<=4) {
			System.out.println("O aluno esta reprovado!");
		} else {
			System.out.println("O aluno esta de recuperacao.");
		}
		
	}
}
