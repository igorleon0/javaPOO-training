package br.com.oo.java.introducao.entities; // Pacote da Classe

public class Triangle { // Classe � a descri��o  de um objeto
	
	public double a;  // Esses s�o os atributos desta classe (caractericas)  
	public double b;
	public double c;
	
	public double area() {               // Esse � o m�todo,
		double p = (a + b + c) / 2.0;
		return Math.sqrt (p * (p - a) * (p - b) * (p - c));
	}

}
