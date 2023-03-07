package extremeProgramming;

public class AulaArray3 {
	
	public static void main(String [] args) {
		
		int matriz[][], i, j;
		matriz = new int[2][3];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		for(i=0; i<=1; i++) {
			for(j=0; j<=2; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
	}

}
