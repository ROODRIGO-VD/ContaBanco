package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da Conta!");
		int numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Por favor, digite o número da Agência!");
		String agencia = sc.nextLine();
		
		System.out.println("Por favor, digite seu nome!");
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite o saldo da sua conta!");
		Double saldo = sc.nextDouble();
		
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
		
		sc.close();
	}

}
