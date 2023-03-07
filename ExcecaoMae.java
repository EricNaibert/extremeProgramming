package extremeProgramming;

public class ExcecaoMae {
	
	public static void main(String[] args) {
		ExcecaoFilha filha = new ExcecaoFilha();
		
		try {
		System.out.println(filha.Divide());
	} catch (Exception e) {
		System.out.println("Erro");
	}
	
	}

}
