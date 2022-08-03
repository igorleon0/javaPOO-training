package br.com.oo.java.introducao.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.oo.java.introducao.entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		product.setName("GBA");
		System.out.println("Update Name: " + product.getName());

		product.setPrice(350);

		System.out.print("Price: " + product.getPrice());

		System.out.println();
		System.out.print("Quantity in stock: ");
		product.getQuantity();

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();

	}

}
