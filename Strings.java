package extremeProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String numeros = new String();
		String[] numerosEmOrdem;
		
		numeros = input.nextLine();
		
		numerosEmOrdem = numeros.split(" ");
		
		Arrays.sort(numerosEmOrdem);
		
		for(int i=0; i<numerosEmOrdem.length; i++) {
			
			System.out.print(numerosEmOrdem[i]);
			System.out.print(" ");
			
		}
		input.close();
		
		
	}
	
	
}
