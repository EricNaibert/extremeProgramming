package extremeProgramming;

import java.util.*;

public class Operadores {
	
	public static void main(String[]args) {
		
		int valor = 0;
		int num1, num2, num3 = 2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		valor = input.nextInt();
		input.close();
		
		System.out.println(valor);
		num1 = valor;
		num1++;
		System.out.println(num1);
		num2 = valor;
		System.out.println(--num2);
		
		num3 += 2;
		System.out.println(num3);
		
		
	}

}
