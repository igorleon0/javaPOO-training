package br.com.conta.bancaria.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.conta.bancaria.entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountName = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			conta = new Conta(accountNumber, accountName, depositValue);
		} else {
			conta = new Conta(accountNumber, accountName);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		sc.close();

	}

}
