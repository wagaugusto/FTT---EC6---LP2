import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		System.out.println("Idade...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu ano de nascimento: ");
		try {
			System.out.println("Sua idade é: " + (2018 - scanner.nextInt()));
		}
		catch (Exception e) {
			System.out.println("Ops!!");
			e.printStackTrace();
		}
		scanner.close();		
	}

}
