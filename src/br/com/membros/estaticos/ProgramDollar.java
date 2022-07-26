package br.com.membros.estaticos;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double valor = sc.nextDouble();

		System.out.println("How many dollars will be bought? ");
		double buyDollar = sc.nextDouble();

		double result = CurrencyConvert.dollarToReal(valor, buyDollar);
		System.out.printf("Amount to be poid in reais = %.2f%n", result);

		sc.close();
	}

}
