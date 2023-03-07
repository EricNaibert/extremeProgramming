package extremeProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturandoExcecao {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[3];
		int[] multiplica = new int[2];
		int j=0;
		
		try {
			
			for(int i=0; i<array.length; i++) {
				array[i] = input.nextInt();
			}
			
			do {
				multiplica[j] = array[j]/array[j+1];
				j++;
			} while(j<2);
			
			for(int resultado:multiplica) {
				System.out.println(resultado);
			}
			
			input.close();
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fim");
		}
		
		
		
	}

}
