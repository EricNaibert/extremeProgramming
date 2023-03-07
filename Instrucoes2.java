package extremeProgramming;

import java.util.*;

public class Instrucoes2 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a from 1 to 3:");
		int numero = input.nextInt();
		input.close();
		
		
		switch(numero) {
		case 1: 
		case 2:
			System.out.println("You typed 1 or 2");
			break;
			
		case 3:
			System.out.println("You typed 3");
			break;
			
		default:
			System.out.println("Please, type a legal number.");
			break;
		}
	}
}
