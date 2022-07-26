package br.com.oo.java.introducao.entities;

public class Rectangle {

	public double widht;
	public double height;

	double area;
	double perimeter;
	double diagonal;

	public double area() {
		return area = widht * height;
	}

	public double perimeter() {
		return perimeter = 2 * (widht + height);
	}

	public double diagonal() {
		return Math.sqrt(diagonal = (widht * widht) + (height * height));

	}

}
