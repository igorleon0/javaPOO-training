package br.com.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

		System.out.println("---------------------");

		List<String> result = list.stream().filter(nomes -> nomes.charAt(0) == 'B').collect(Collectors.toList());
		// Cria uma nova lista, com um filtro de predicado que começa com 'B'.

		for (String nomes : result) {
			System.out.println(nomes);
		}

		System.out.println("---------------------");

		list.removeIf(nomes -> nomes.charAt(0) != 'L');
		// remove todos da lista que não atendam o filtro de predicado.

		for (String nomes : list) {
			System.out.println(nomes);
		}

		System.out.println("---------------------");

		list.add("Igor");
		list.add("Victor");
		list.add("Tony");
		list.add("Taka");

		String name = list.stream().filter(nomes -> nomes.charAt(0) == 'T').findFirst().orElse(null);
// o findFirst irá mostrar o primeiro elemento do filtro do predicado, caso não exista, retorna o "null".

		System.out.println(name);

	}

}
