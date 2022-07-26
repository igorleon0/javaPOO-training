package br.com.oo.java.introducao.entities; // Pacote da Classe

public class Triangle { // Classe é a descrição  de um objeto
	
	public double a;  // Esses são os atributos desta classe (caractericas)  
	public double b;
	public double c;
	
	public double area() {               // Esse é o método,
		double p = (a + b + c) / 2.0;
		return Math.sqrt (p * (p - a) * (p - b) * (p - c));
	}

}
