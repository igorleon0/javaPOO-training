package br.com.listas;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Igor");
		list.add("Leon");
		list.add("Ferreira");
		list.add("Bernardo");
		list.add(".");
		list.add(0, "NOME COMPLETO: ");

		list.remove("."); // remove da lista.
		System.out.println(list.size()); // tamanho da lista.

		for (String nomes : list) {
			System.out.println(nomes);
		}

		System.out.println("---------------------");

		list.removeIf(nomes -> nomes.charAt(0) == 'N');
		/*
		 * remove os elementos do arrayList que satisfazem um filtro de predicado.
		 */

		for (String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("---------------------");
		System.out.println("Index of Igor: " + list.indexOf("Igor")); // posição da String "Igor".
	}

}
