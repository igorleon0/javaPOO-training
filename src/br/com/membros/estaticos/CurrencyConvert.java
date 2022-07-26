package br.com.membros.estaticos;

public class CurrencyConvert {
	
 public static double imposto = 0.06;

public static double dollarToReal(double valor, double dollarPrice) {
	return valor * dollarPrice * (1.0 + imposto);
}
}
